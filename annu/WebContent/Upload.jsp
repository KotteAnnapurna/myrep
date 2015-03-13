<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
        <h1>File Upload to Database Demo</h1>
        <form method="post" action="FileUploadDBServlet" enctype="multipart/form-data">
            <table border="0">
                <tr>
                    <td>Enter  Area: </td>
                    <td><input type="text" name="area" size="50" required/></td>
                </tr>
                <tr>
                    <td>Enter problem: </td>
                    <td><textarea name="comments" required></textarea></td>
                </tr>
                <tr>
                    <td>Portrait Photo: </td>
                    <td><input type="file" name="photo" size="50"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Save">
                    </td>
                </tr>
            </table>
        </form>
    </center>
</body>
</html>