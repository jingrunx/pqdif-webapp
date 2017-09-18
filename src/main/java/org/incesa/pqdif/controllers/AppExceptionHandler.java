package org.incesa.pqdif.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

  @ExceptionHandler(Exception.class)
  public String handleAllApplicationExceptions(Exception ex) {
    
    System.out.println(ex.getMessage());
    
    return "home";
  }

}
