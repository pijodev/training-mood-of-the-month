<%@ page import="io.takima.ProjectMOTM.Employee" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>JSP - Hello World Tutorial - Programmer Gate</title>
</head>
<body>
    <table>
    <%= // JSP can run java code.
            Employee testUno = ((Employee)request.getAttribute("Employee"))
    <tr>
                <td><%=testUno.getName()%></td>
                <td><%=testUno.getEmail()%></td>
                <td><%=testUno.getDateBirth()%></td>
            </tr>
            %>
        </table>
</body>
</html>
