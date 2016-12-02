<!DOCTYPE html>
<%@page import="prova.CreateXML"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>xml creato</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%

            CreateXML cdsfd = new CreateXML(request.getParameter("file_name"), request.getParameter("container_name"));

            cdsfd.attrCont_type = request.getParameter("cont_attribuo");
            cdsfd.attrCont_cont = request.getParameter("container_name_att");

            cdsfd.addElementss(request.getParameter("element_name"), request.getParameter("element_cont"));

            cdsfd.function_createXML();

        %>

    </body>
</html>
