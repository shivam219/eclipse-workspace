<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.DriverManager"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manager page</title>
</head>
<body>
	<%
	int eid = Integer.valueOf(request.getParameter("eid"));
	String Ename = "";
	String error = "Ok";
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");// 2 either 1
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "Shivam@219@");
		st = con.createStatement();
		rs = st.executeQuery("select mname  from tbl_manage where mid = '" + eid + "'");
		while (rs.next()) {
			Ename = rs.getString("mname");
		}
	} catch (Exception e) {
		error = e.toString();
		error = e.getMessage();
	}
	%>
	<center>
		<h1>
			ID =
			<%=request.getParameter("eid")%>
			|| Name :
			<%=Ename%>
			|| Status :
			<%=error%>
			<h1>
	</center>
	<table>
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Reason</td>
			<td>Details</td>
			<td>T-L</td>
			<td>Approve Button</td>
		</tr>

	<%
	String name = "yes";
	try {
		rs = st.executeQuery("select * from tbl_leave where tl = '"+Ename+"'");
	} catch (Exception e) {
		name = " Error" + e.toString();
	}
	
		while (rs.next()) {
	%>
	<tr>
		<td><%=rs.getString(1)%></td>
		<td><%=rs.getString(2)%></td>
		<td><%=rs.getString(3)%></td>
		<td><%=rs.getString(4)%></td>
		<td><%=rs.getString(5)%></td>
		<td><button><a href="AprroveLeaveApp.jsp?eid=<%=rs.getString(1)%>&mname=<%=rs.getString(5)%>">Approve</a> </button></td>
	</tr>
	<%
	
	}
	%>
	
	</table>
<%rs.close(); st.close();rs.close(); %>
</body>
</html>