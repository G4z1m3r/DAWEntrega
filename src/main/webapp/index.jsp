<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
        <form method="get" action="ServletControlador">
            <h1>Elige paises</h1>
            <input type="checkbox"  name="name" value="Spain"/> España
            <input type="checkbox"  name="name" value="Ukraine"/> Ucrania
            <input type="checkbox"  name="name" value="France"/>Francia
            <input type="checkbox"  name="name" value="Italy"/>Italia 
            <input type="submit" value="Buscar"/>
        </form>
    </body>
</html>
