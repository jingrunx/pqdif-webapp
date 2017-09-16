package org.incesa.pqdif.services;

import java.io.IOException;
import java.util.List;

import org.incesa.pqdif.input.MetaData;
import org.incesa.pqdif.models.CsvDataModel;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

@Service
public class FileService {

  public MultipartFile createPqdif(MultipartFile csvFile, MetaData metaData) throws IOException {
    CsvMapper csvMapper = new CsvMapper();
    CsvSchema schema = csvMapper.schemaFor(CsvDataModel.class);
    String csv = new String(csvFile.getBytes());
    MappingIterator<CsvDataModel> iterator = csvMapper.readerFor(CsvDataModel.class).with(schema).readValues(csv);
    List<CsvDataModel> dataObjects = iterator.readAll();
    ObjectMapper mapper = new ObjectMapper();
    String jsonData = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(dataObjects);
    String jsonMetaData = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(metaData);
    ObjectNode jsonNode = mapper.valueToTree(jsonMetaData);
    jsonNode.put("DataSource", jsonData);
    //TODO convert data in jsonNode object to pqdif file and return it
    return null;
  }

}
