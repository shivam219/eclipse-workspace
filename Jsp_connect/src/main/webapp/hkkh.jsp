<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.DriverManager"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Company</th>
			<th>Contact</th>
		</tr>
		<%
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		String name = "yes";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// 2 either 1
			//		Class.forName("com.mysql.jdbc.Driver");// ; dont we this line
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "Shivam@219@");
			st = con.createStatement();
			rs = st.executeQuery("select id, district from city where id = 1");
		} catch (Exception e) {
			name = " Error" + e.toString();
		}
		//	int count = 1;
		if (rs != null) {
			while (rs.next()) {
		%>
		<tr>
			<th><%=rs.getInt(1)%></th>
			<th><%=rs.getString(2)%></th>
		</tr>
		<%
		}
		}
		%>

	</table>
</body>
</html>