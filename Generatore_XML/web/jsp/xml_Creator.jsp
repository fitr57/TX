
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>xml creator</title>
    </head>
    <body>
    <center>
        <h1>xml creator</h1>

        <form id="myform" action="xmlRun.jsp">
            nome file:
            <input type="text" name="file_name" >
            <br><br>
            nome container:
            <input type="text" name="container_name" >
            <!---->
            attributo :
            <select name="cont_attribuo">
                <option value="id">id</option>
                <option value="name">name</option>
                <option value="class">class</option>
            </select>
            nome attributo :
            <input type="text" name="container_name_att" >
            <!---->
            <br><br>
            nome del 1° elemento:
            <input type="text" name="element_name" >
            contenuto elemento:
            <input type="text" name="element_cont" >
            <br><br>  
            <input type="submit" value="Submit">
        </form>
        <button onclick="addElement()">aggiungi elemento</button>
    </center>
    <script>

        var n_element = 1;

        function addElement() {
            n_element++;

            var el_string = document.createTextNode("nome del " + n_element + "° elemento:");
            document.getElementById("myform").appendChild(el_string);

            var text_area = document.createElement("INPUT");
            text_area.setAttribute("type", "text");
            text_area.setAttribute("name", "elemento" + n_element);
            document.getElementById("myform").appendChild(text_area);

            var el_string_cont = document.createTextNode("contenuto elemento: ");
            document.getElementById("myform").appendChild(el_string_cont);

            var text_area_cont = document.createElement("INPUT");
            text_area_cont.setAttribute("type", "text");
            text_area_cont.setAttribute("name", "elemento_cont" + n_element);
            document.getElementById("myform").appendChild(text_area_cont);

            var br = document.createElement("br");
            document.getElementById("myform").appendChild(br);
            document.getElementById("myform").appendChild(br);

        }
    </script>
</body>
</html>
