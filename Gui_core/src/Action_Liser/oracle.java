package Action_Liser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class oracle {
	public static void main(String[] args) {
		System.out.println("shivam");
	}
	public static void mai(String[] args) throws Exception {
		Connection con = null;	Statement st = null;ResultSet rs = null;
		String setString="SELECT * FROM BOOKSHELF "; 
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl", "c##scott", "tiger");
			if (con != null) {
				st = con.createStatement();
			}
			if(st!=null){
				rs = st.executeQuery(setString);
			}
			if (rs != null) {
				while (rs.next()){
					System.out.println(rs.getString(1)  );
			
			}
			}
		}		
		catch (SQLException e) {e.printStackTrace();} 
		 catch (ClassNotFoundException ee) {ee.printStackTrace();}
		 catch (Exception g) { g.printStackTrace(); }
		 finally {try { rs.close(); } catch (SQLException e2) {e2.printStackTrace();}
		 		  try { st.close(); } catch (SQLException e2) {e2.printStackTrace();}
		 		  try { con.close();} catch (SQLException e2) {e2.printStackTrace();}	
		 }
		
	}
}
