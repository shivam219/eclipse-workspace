package Alibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*GEt book  add section -- add books name to avialble books column && add corresponding data to GUI  */
public class toOracleData {
	static Connection con = null;
	static Statement st = null;
	static ResultSet rs = null;
	static {
		System.out.println("shviam");
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl", "c##scott", "tiger");
		} catch (Exception e) {
		}
	}
	public static String oracleGet(String args, boolean bookNameOnly) {
		String addBookDataToGetBookGUI = "", addNewBookToAddBookSection = "";
		ArrayList<String> arl = new ArrayList<String>();
		if (bookNameOnly) {
			addNewBookToAddBookSection = "SELECT * FROM BOOKSHELF";
		} else {
			addBookDataToGetBookGUI = "SELECT *  FROM BOOKSHELF WHERE NAME = '" + args + "'";
		}
		try {
			if (con != null) {
				st = con.createStatement();
			}
			if (st != null) {
				if (bookNameOnly) {
					rs = st.executeQuery(addNewBookToAddBookSection);
				} else {
					rs = st.executeQuery(addBookDataToGetBookGUI);
				}
			}
			if (rs != null) {
				while (rs.next()) {
					if (bookNameOnly) {
						arl.add(rs.getString(1));
					} else {
						GetBook.flag = true;
						GetBook.innameOfBook.setText(rs.getString(1));
						GetBook.inprice.setText("" + rs.getInt(2));
						GetBook.intotalBookCount.setText("" + rs.getInt(3));
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception g) {
			g.printStackTrace();
		}
		return arl.toString();
	}

	/* return book and getBook get at buy button count will subtracted */
	public static boolean oracleReturnBook(String args, int userBookCount, boolean isBuy) {

		String select = "SELECT *  FROM BOOKSHELF WHERE NAME = '" + args + "'";
		boolean flag = false, isBuyOk = false;
		String update = "";
		try {
			if (con != null) {
				st = con.createStatement();
			}
			if (st != null) {
				rs = st.executeQuery(select);
			}
			if (rs != null) {
				while (rs.next()) {
					int totalBookInDatabase = rs.getInt(3);
					if (isBuy) {
						if (totalBookInDatabase < userBookCount) {
							return false;
						}
					}
					if (isBuy) {
						update = "UPDATE BOOKSHELF SET BOOKCOUNT = " + (totalBookInDatabase - userBookCount)
								+ "WHERE NAME = '" + args + "'";
					} else {
						update = "UPDATE BOOKSHELF SET BOOKCOUNT = " + (userBookCount + totalBookInDatabase)
								+ "WHERE NAME = '" + args + "'";
					}
				}
			}
			if (st != null) {
				st.executeQuery(update);
				st.execute("Commit work");
				flag = true;
				isBuyOk = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception g) {
			g.printStackTrace();
		}
		if (flag || isBuyOk) {
			return true;
		}
		return false;
	}

	/* add data to combox box */ static int i = 0;

	public static String[] oracleReturnAddCombo() {
		String setString = "SELECT * FROM BOOKSHELF ";
		ArrayList<String> arl = new ArrayList<String>();
		String[] arr = null;
		try {
			if (con != null) {
				st = con.createStatement();
			}
			if (st != null) {
				rs = st.executeQuery(setString);
			}
			if (rs != null) {
				while (rs.next()) {
					arl.add(rs.getString(1));
				}
				String[] arr2 = new String[arl.size()];
				arl.stream().forEach(e -> {
					arr2[i] = arl.get(i);
					i++;
				});
				arr = arr2;
				i = 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception g) {
			g.printStackTrace();
		}
		return arr;
	}

	/* Add New Book */
	public static boolean addNewBook(String name, int price, int count) {
		String queryGetName = "SELECT * FROM BOOKSHELF WHERE NAME ='" + name + "'";
		String queryAddBook = "INSERT INTO BOOKSHELF VALUES('" + name + "', " + price + " , " + count + ")";
		try {
			if (con != null) {
				st = con.createStatement();
			}
			if (st != null) {
				rs = st.executeQuery(queryGetName);
			}
			String str = "oooo";
			while (rs.next()) {
				str = rs.getString(1);
			}

			if (str.equals(name)) {
				return false;
			}
			st.execute(queryAddBook);
			st.execute("commit work");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception g) {
			g.printStackTrace();
		}
		return true;
	}/* delete subject */

	public static boolean deleteBookTotally(String name) {
		String setString = "DELETE  FROM BOOKSHELF  WHERE NAME ='" + name + "'";
		try {
			if (con != null) {
				st = con.createStatement();
				if (st != null) {
					st.executeQuery(setString);
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception g) {
			g.printStackTrace();
		}
		return true;
	}
	/* change price */
	public static boolean changePrice(String name, int price) {
		String setString = "UPDATE BOOKSHELF  SET PRICE =" + price + "WHERE NAME ='" + name + "'";
		try {
			if (con != null) {
				st = con.createStatement();
				if (st != null) {
					st.executeQuery(setString);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception g) {
			g.printStackTrace();
		}
		return true;
	}

	public static boolean changeName(String name, String newName) {
		String setString = " update bookshelf set name ='" + newName + "' where name = '" + name + "'";
		try {
			if (con != null) {
				st = con.createStatement();
				if (st != null) {
					st.executeQuery(setString);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception g) {
			g.printStackTrace();
		}
		return true;
	}

	public static void close() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}
}
