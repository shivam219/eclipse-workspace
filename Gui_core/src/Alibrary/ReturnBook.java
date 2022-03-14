package Alibrary;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ReturnBook extends JFrame implements ActionListener {
	JLabel bookName, bookCount, title;
	JComboBox bookList;
	String arr[];
	JLabel img;
	Layout L;
	JButton submit, back;
	JTextField inbookCount;

	public ReturnBook(Layout L) {
		this.L = L;
		addContentToJComboBox();
		setBounds(370, 10, 520, 530);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(null);
		/* title */
		title = new JLabel("Return Book Section");
		title.setBounds(100, 0, 300, 60);
		title.setFont(new Font("verdana", Font.BOLD, 26));
		add(title);
		/* book name */
		bookName = new JLabel("Book Name");
		bookName.setBounds(210, 65, 100, 30);
		add(bookName);
		/* combox of fubject */
		bookList = new JComboBox(arr);
		bookList.setBounds(210, 90, 120, 30);
		add(bookList);
		bookList.setEditable(false);
		/* no book */
		bookCount = new JLabel("No's of book");
		bookCount.setBounds(340, 65, 100, 30);
		add(bookCount);
		/* input filed for book count */
		inbookCount = new JTextField();
		inbookCount.setBounds(340, 90, 100, 30);
		add(inbookCount);
		/* image */
		img = new JLabel(new ImageIcon("C:\\library\\returnBook.png"));
		img.setBounds(0, 90, 200, 200);
		add(img);
		/* submit button */
		submit = new JButton("submit");
		submit.setBounds(250, 200, 90, 40);
		add(submit);
		submit.addActionListener(this);
		submit.setFont(new Font("verdana", Font.BOLD, 15));
		/* back button */
		back = new JButton(new ImageIcon("C:\\library\\back.png"));
		back.setBounds(225, 350, 50, 50);
		add(back);
		back.addActionListener(this);
		addWindowListener(backHandle.instance);

	}

	void addContentToJComboBox() {
		arr = toOracleData.oracleReturnAddCombo();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == submit) {
			if ((bookList.getSelectedItem() != null)) {
				String str = String.valueOf(bookList.getSelectedItem());
				int count = 0;
				boolean isValidInput = false;
				try {
					count = Integer.parseInt(inbookCount.getText());
					isValidInput = true;
				} catch (NumberFormatException nu) {
					JOptionPane.showMessageDialog(this, "Please insert valid number only");
				}
				if (!str.equals("") & isValidInput) {
					if (toOracleData.oracleReturnBook(str, count, false)) {
						JOptionPane.showMessageDialog(this, "Return book successfully");
					}
				}
			} else {
				JOptionPane.showMessageDialog(this,
						"NO Book availble right now\nplease add book first from\nadd book section");
			}
		}
		if (e.getSource() == back) {
			L.setVisible(true);
			this.dispose();
		}
	}
}
