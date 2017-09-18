<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>CSV to PQDIF</title>
</head>
<body>
  <div class="container">
    <h2>Please fill in the metadata and select a file for upload</h2>
    <form method="POST" action="/pqdif-webapp/" enctype="multipart/form-data">
      <table>
        <tr>
          <td>Version Info:</td>
          <td><input type="text" name="tagVersionInfo" required></td>
        </tr>
        <tr>
          <td>File Name:</td>
          <td><input type="text" name="tagFileName" required></td>
        </tr>
        <tr>
          <td>Creation:</td>
          <td><input type="text" name="tagCreation" required></td>
        </tr>
        <tr>
          <td>Subject:</td>
          <td><input type="text" name="tagSubject" required></td>
        </tr>
        <tr>
          <td>Author:</td>
          <td><input type="text" name="tagAuthor" required></td>
        </tr>
        <tr>
          <td>Application:</td>
          <td><input type="text" name="tagApplication" required></td>
        </tr>
        <tr>
          <td>Copyright:</td>
          <td><input type="text" name="tagCopyright" required></td>
        </tr>
        <tr>
          <td>Trademark:</td>
          <td><input type="text" name="tagTrademark" required></td>
        </tr>
        <tr>
          <td>Comments:</td>
          <td><input type="text" name="tagComments" required></td>
        </tr>
        <tr>
          <td>Notes:</td>
          <td><input type="text" name="tagNotes" required></td>
        </tr>
        <tr>
          <td>Language:</td>
          <td><input type="text" name="tagLanguage" required></td>
        </tr>
        <tr>
          <td>Owner:</td>
          <td><input type="text" name="tagOwner" required></td>
        </tr>
        <tr>
          <td>File:</td>
          <td><input type="file" name="csvFile" value="Upload" required></td>
        </tr>
        <tr>
          <td><input type="submit" value="Upload" required>
          <td>
        </tr>
      </table>
    </form>
  </div>
</body>
</html>