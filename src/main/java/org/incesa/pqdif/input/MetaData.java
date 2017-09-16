package org.incesa.pqdif.input;

import org.springframework.web.multipart.MultipartFile;

public class MetaData {

  private int[] tagVersionInfo;
  private String tagFileName;
  private String[] tagCreation;
  private String tagSubject;
  private String tagAuthor;
  private String tagApplication;
  private String tagCopyright;
  private String tagTrademark;
  private String tagComments;
  private String tagNotes;
  private String tagLanguage;
  private String tagOwner;

  public int[] getTagVersionInfo() {
    return tagVersionInfo;
  }

  public void setTagVersionInfo(int[] tagVersionInfo) {
    this.tagVersionInfo = tagVersionInfo;
  }

  public String getTagFileName() {
    return tagFileName;
  }

  public void setTagFileName(String tagFileName) {
    this.tagFileName = tagFileName;
  }

  public String[] getTagCreation() {
    return tagCreation;
  }

  public void setTagCreation(String[] tagCreation) {
    this.tagCreation = tagCreation;
  }

  public String getTagSubject() {
    return tagSubject;
  }

  public void setTagSubject(String tagSubject) {
    this.tagSubject = tagSubject;
  }

  public String getTagAuthor() {
    return tagAuthor;
  }

  public void setTagAuthor(String tagAuthor) {
    this.tagAuthor = tagAuthor;
  }

  public String getTagApplication() {
    return tagApplication;
  }

  public void setTagApplication(String tagApplication) {
    this.tagApplication = tagApplication;
  }

  public String getTagCopyright() {
    return tagCopyright;
  }

  public void setTagCopyright(String tagCopyright) {
    this.tagCopyright = tagCopyright;
  }

  public String getTagTrademark() {
    return tagTrademark;
  }

  public void setTagTrademark(String tagTrademark) {
    this.tagTrademark = tagTrademark;
  }

  public String getTagComments() {
    return tagComments;
  }

  public void setTagComments(String tagComments) {
    this.tagComments = tagComments;
  }

  public String getTagNotes() {
    return tagNotes;
  }

  public void setTagNotes(String tagNotes) {
    this.tagNotes = tagNotes;
  }

  public String getTagLanguage() {
    return tagLanguage;
  }

  public void setTagLanguage(String tagLanguage) {
    this.tagLanguage = tagLanguage;
  }

  public String getTagOwner() {
    return tagOwner;
  }

  public void setTagOwner(String tagOwner) {
    this.tagOwner = tagOwner;
  }
  
}
