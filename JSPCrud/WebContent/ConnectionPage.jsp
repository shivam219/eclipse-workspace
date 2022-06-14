<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.DriverManager"%>

<%! public static Connection con = null; %>>
<%
try {
	Class.forName("com.mysql.cj.jdbc.Driver");// 2 either 1
	//		Class.forName("com.mysql.jdbc.Driver");// ; dont we this line
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "Shivam@219@");
} catch (Exception e) {
}
%>