<%-- 
    Document   : pr
    Created on : Dec 1, 2016, 9:47:49 AM
    Author     : d.gagliano
--%>

<%@page import="prova.Myfunctions"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
Myfunctions mf = new Myfunctions();


%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            int intero1 = 3;
            int intero2 = 5;
            
        String ciao = " salve";
        
      
       mf.funzione_1(intero1, intero2);

        %>
         Welcome <%=request.getParameter("name")+ciao+intero1%>
         <br>
         dato n1: <%=request.getParameter("datoInpiu1")%>
    </body>
</html>
