<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
<h2>uploadPage!</h2>
<h2>文件上传实例</h2>
<form action="uploadFile" method="post" enctype="multipart/form-data">
    选择文件1:<input type="file" name="files">
    选择文件2:<input type="file" name="files">
    选择文件3:<input type="file" name="files">
    <input type="submit" value="submit">
</form>
</body>
</html>