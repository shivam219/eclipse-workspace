package Alibrary;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;

public class backHandle implements WindowListener {
	public static backHandle instance = new backHandle();

	public void windowOpened(WindowEvent e) {
	}

	public void windowClosing(WindowEvent e) {
		Layout.L.setVisible(true);
		GetBook.flag = false;

		if (toOracleData.rs != null) {
			try {
				toOracleData.rs.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		if (toOracleData.st != null) {
			try {
				toOracleData.st.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		if (toOracleData.con != null) {
			try {
				toOracleData.con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();

			}
		}
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

}
