<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.SQLIntegrityConstraintViolationException"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.DriverManager"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leave DB page</title>
</head>
<body>
	<center>
		<h1>Your application is sumbited</h1>
	</center>

	<%
	Connection con = null;
	PreparedStatement st = null;
	String error = "success";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");// 2 either 1
		//		Class.forName("com.mysql.jdbc.Driver");// ; dont we this line
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "Shivam@219@");
		st = con.prepareStatement("insert into  tbl_leave values(?,?,?,?,?)");
		st.setString(1, request.getParameter("eid").trim());
		st.setString(2, request.getParameter("ename").trim());
		st.setString(3, request.getParameter("reason").trim());
		st.setString(4, request.getParameter("details").trim());
		st.setString(5, request.getParameter("mname").trim());
		int n = st.executeUpdate();
	}
	catch (SQLIntegrityConstraintViolationException e) {
		error = "Already sumited";
      }
	catch (Exception e) {
		error = e.toString();
	}
	%>
	<%=error%>>
	<%=request.getParameter("eid")%>
	<%=request.getParameter("ename")%>
	<%=request.getParameter("reason")%>
	<%=request.getParameter("details")%>
	<%=request.getParameter("mname")%>
	<%
	st.close();
	con.close();
	%>>
</body>
</html>