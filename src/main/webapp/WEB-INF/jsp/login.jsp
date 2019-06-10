<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
//recebe o valor digitado no campo usuario
String usuario = request.getParameter("login");

//recebe o valor digitado no campo senha
String senha = request.getParameter("senha");

if(usuario.equals("camilo")&& senha.equals("123")){

//Exibi o nome do usuario
    out.println("Seja bem vindo " + usuario);
    }
else{
out.println("Usuario ou senha invalidos");  
                         
}

%>
</body>
</html>