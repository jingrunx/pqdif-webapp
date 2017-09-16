package org.incesa.pqdif.controllers;

import org.incesa.pqdif.input.MetaData;
import org.incesa.pqdif.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller("/")
public class MainController {

  @Autowired
  FileService fileService;

  @GetMapping
  public ModelAndView homepage() {
    ModelAndView response = new ModelAndView("home");
    response.addObject(new MetaData());
    return response;
  }

  @PostMapping
  public void convertFile(@ModelAttribute("inputData") MetaData inputData, MultipartFile csvFile) {
    //TODO receive csv file and metadata, then pass them to the FileService to build the PQDIF file, and then return pqdif file
  }

}
