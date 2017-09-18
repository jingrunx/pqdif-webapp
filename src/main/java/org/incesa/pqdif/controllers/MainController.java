package org.incesa.pqdif.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.incesa.pqdif.input.MetaData;
import org.incesa.pqdif.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller("/")
public class MainController {

  @Autowired
  FileService fileService;

  @GetMapping
  public String homepage() {
    return "home";
  }

  @PostMapping
  public void convertFile(@RequestParam("tagVersionInfo") String tagVersionInfo,
      @RequestParam("tagFileName") String tagFileName, @RequestParam("tagCreation") String tagCreation,
      @RequestParam("tagSubject") String tagSubject, @RequestParam("tagAuthor") String tagAuthor,
      @RequestParam("tagApplication") String tagApplication, @RequestParam("tagCopyright") String tagCopyright,
      @RequestParam("tagTrademark") String tagTrademark, @RequestParam("tagComments") String tagComments,
      @RequestParam("tagNotes") String tagNotes, @RequestParam("tagLanguage") String tagLanguage,
      @RequestParam("tagOwner") String tagOwner, @RequestParam("csvFile") MultipartFile csvFile, 
      HttpServletResponse response) throws IOException {

      //COD DE TEST, returneaza csv-ul uploadat ca download de fisier in browser
      response.setContentType("application/octet-stream");
      response.addHeader("Content-Disposition", "attachment; filename=" + csvFile.getOriginalFilename());
      response.getOutputStream().write(csvFile.getBytes());
      response.getOutputStream().close();

    //TODO verificare proces de conversie (nu am putut verifica din cauza erorilor de validare)
//     MetaData metaData = new MetaData();
//     metaData.setTagVersionInfo(tagVersionInfo);
//     metaData.setTagFileName(tagFileName);
//     metaData.setTagCreation(tagCreation);
//     metaData.setTagSubject(tagSubject);
//     metaData.setTagAuthor(tagAuthor);
//     metaData.setTagApplication(tagApplication);
//     metaData.setTagCopyright(tagCopyright);
//     metaData.setTagTrademark(tagTrademark);
//     metaData.setTagComments(tagComments);
//     metaData.setTagNotes(tagNotes);
//     metaData.setTagLanguage(tagLanguage);
//     metaData.setTagOwner(tagOwner);
//     File pqdFile = fileService.createPqdif(csvFile, metaData);
//    
//     System.out.println("SUCCESS! File converted! Returning...");
//    
//     InputStream in = new FileInputStream(pqdFile);
//     byte[] result = IOUtils.toByteArray(in);
//     response.setContentType("application/octet-stream");
//     response.addHeader("Content-Disposition", "attachment; filename=" + pqdFile.getName());
//     response.getOutputStream().write(result);
//     response.getOutputStream().close();
  }

}
