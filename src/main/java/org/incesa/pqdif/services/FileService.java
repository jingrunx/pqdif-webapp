package org.incesa.pqdif.services;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import org.incesa.pqdif.input.MetaData;
import org.incesa.sympqd.pqdif.ContainerRecord;
import org.incesa.sympqd.pqdif.DataSourceRecord;
import org.incesa.sympqd.pqdif.ObservationRecord;
import org.incesa.sympqd.pqdif.PqdifConstants;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {

  public File createPqdif(MultipartFile csvFile, MetaData metaData) throws IOException {

    FileOutputStream fos;

    ContainerRecord containerRec = new ContainerRecord(metaData);
    DataSourceRecord dsRec = new DataSourceRecord();
    ObservationRecord observationRec = new ObservationRecord();

    byte[] containerDump = new byte[PqdifConstants.CONTAINER_MAX_SIZE];
    byte[] dataSourceDump = new byte[PqdifConstants.DATASOURCE_MAX_SIZE];
    byte[] observationDump = new byte[PqdifConstants.OBSERVATION_MAX_SIZE];

    String[] s1 = new String[2000000];
    float[] s2 = new float[2000000];

    File input = new File(csvFile.getOriginalFilename());
    input.createNewFile();
    fos = new FileOutputStream(input);
    fos.write(csvFile.getBytes());
    fos.close();

    List<String> lines = null;
    lines = Files.readAllLines(input.toPath(), StandardCharsets.UTF_8);

    // selectie coloane 1,2
    int idxLine = 0;
    for (String line : lines) {
      String[] array = line.split(";");
      s1[idxLine] = array[0];
      s2[idxLine] = Float.valueOf(array[1]);
      idxLine++;
    }

    /*
     * SimpleDateFormat sdf = new SimpleDateFormat("M/d/y h:m:s a"); Date date =
     * null; for (int i=0;i<10;i++) { System.out.printf("%s === ", s1[i]); try {
     * date = sdf.parse(s1[i]); } catch (ParseException ex) {
     * Logger.getLogger(DateTime.class.getName()).log(Level.SEVERE, null, ex); }
     * System.out.printf("\t%s\t%f\n\r",date,s2[i]); }
     * System.out.printf("total = %d\n\r", idxLine);
     */

    containerDump = containerRec.generate(0);
    int containerSize = containerRec.getBodySize() + PqdifConstants.RECORD_HEADER_SIZE;
    System.out.printf("Container Size = %08x / %d\n\r", containerSize, containerSize);

    dataSourceDump = dsRec.generate(containerSize);
    int dsRecSize = dsRec.getBodySize() + PqdifConstants.RECORD_HEADER_SIZE;
    System.out.printf("DataSource Size = %08x / %d\n\r", dsRecSize, dsRecSize);

    observationDump = observationRec.generate(containerSize + dsRecSize, 500, s1, s2);
    int observationRecSize = observationRec.getBodySize() + PqdifConstants.RECORD_HEADER_SIZE;
    System.out.printf("Observation Size = %08x / %d\n\r", observationRecSize, observationRecSize);

    String pqdFileName = csvFile.getName().split(".")[0] + ".pqd";
    File pqdFile = new File(pqdFileName);
    fos = new FileOutputStream(pqdFile);
    fos.write(containerDump, 0, containerSize);
    fos.write(dataSourceDump, containerSize, dsRecSize);
    fos.write(observationDump, containerSize + dsRecSize, observationRecSize);
    fos.close();

    return pqdFile;
  }

}
