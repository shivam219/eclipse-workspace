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
<title>Approve leave page</title>
</head>
<body>

	<%=request.getParameter("eid")%>
	<%=request.getParameter("mname")%>
	<%int n =0 ;
	String leaveAppEmpid = request.getParameter("eid");
	String TL = request.getParameter("mname");
	String lastApproveName = "";
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	String error = "success";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");// 2 either 1
		//		Class.forName("com.mysql.jdbc.Driver");// ; dont we this line
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "Shivam@219@");
		st = con.createStatement();
		rs = st.executeQuery("select lastapprove from tbl_manage where eid = '" + leaveAppEmpid + "'");
		while(rs.next()){
			lastApproveName = rs.getString(1);
		}
	} catch (Exception e) {
		error = e.toString();
	}
	if(lastApproveName.equals(TL)){
		out.print("<br>Your current TL is your last Approve");
		rs = st.executeQuery("select *  from tbl_leave where eid = '" + leaveAppEmpid + "'");
		while(rs.next()){
			out.print("<br>" + rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " );
		%>
		<br>
	<a href= "mailto:shivamchoudhary2002119@outlook.com?Employee_ID=<%=rs.getString(1)%>&Employee_Name=<%=rs.getString(2)%>&Reason_Leave=<%=rs.getString(3)%>&Reason_Descprition=<%=rs.getString(4)%>" > Click message </a>  
	<br>	
	<button><a href="mailto:shivamchoudhary2002119@outlook.com? subject=Learn about MailTo tags in HTML"> Click to send email  </a>
	</button>
<form action="mailto: shivamchoudhary2002119@outlook.com" method="post" enctype="text/plain">
Name:<br>
<input type="text" name="name"><br>
E-mail:<br>
<input type="text" name="mail"><br>
Comment:<br>
<input type="text" name="comment" size="50"><br><br>
<input type="submit" value="Send">
<input type="reset" value="Reset">
</form>
		<%
		}
	}else{		
			String updatedTL ="";
		try {
			rs = st.executeQuery("select mname from tbl_manage where ename = '" + TL  + "'");
			while(rs.next()){
				updatedTL = rs.getString(1);
			}
			n = st.executeUpdate("update tbl_leave set tl  = '"+updatedTL+"' where eid = '"+leaveAppEmpid+"'");			
		} catch (Exception e) {
			error = e.toString();
		}
	}
	%>
	<br>
	<%=n==1?"Yes updated tl":"Error while updating" %>
	<%=error%>
<%response.sendRedirect("managePage.jsp"); %>
	</body>
</html>