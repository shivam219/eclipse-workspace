package com.t4.jdbc;
;
public class Oracle_connection {
	/*
	 * type 1 jdbc driver software registration sun.jdbc.jdbcOdbcDriver driver = new
	 * sun.jdbc.jdbcOdbcDriver driver(); DriverManager.registerDriver(driver);
	 *
	 *--alternate code 
	 *--class.forName("sun.jdbc.odbc.jdbcOdbcDriver");
	 *--not need create object 
	 *
	 *--oracle thin driver
	 *--class.forname("oracle.jdbc.driver.OracleDriveer
	 *--class.forname("org.postgresql.Driver");
	 *--class.forname("org.git.mm.mysql.Driver");S
	 *--all driver has static block that execute create object and regitsteter
	 *
	 *--jdbc opetion
	 *--curd => create , retrive, remove, 
	 *
	 */
	
	/*standard step to developing jdbc application
	 * --load driver class and register with driver manager serives
	 * 
	 * --establish the connection with db / s/w
	 * 
	 * --create jdbc statement object
	 * 
	 * --send eand execute sql queries in db
	 * 
	 * --gather result from db 
	 * 
	 * --close jdbc objec
	 */
	/*
	 * auto loading of jdbc drive class (jdbc 4 feature )
	 * jdbc 14 support autoloading feature 
	 * class.forname("oracle.jdbc.driver.OracleDriver");
	 * --no need write this
	 * 
	 * direct connection con = Driver.manager.getConnetion
	 * ("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	 * system.out.println("connection establish");
	 * this link go jdbc 6.jar 
	 * goto meta nf 
	 * goto services
	 * goto java.sql.driver
	 * 
	 */
	
	/* way to register drive 
	 * a) oracle.driver.OracleDriver driver = new oracle.driver.OracleDriver();
	 * 	  driverManager.registerDriver(drive);
	 * or
	 * DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	 * 
	 * b)oracle.jdbc.driver.OracleDriver driver = new oracle.jdbc.driver.OracleDriver();
	 * new oracle.jdbc.driver.OracleDriver();
	 * 
	 * c)conn test.java
	 * 	public class extends oracle.driver.OracleDriver{
	 * 	public main(){
	 * 		connection con = DriverManager.getConnection(__);
	 * 
	 * e)
	 * 	class.fornaem();
	 * connectio
	 */
	public static void main(String[] args) {
		
	}
}
