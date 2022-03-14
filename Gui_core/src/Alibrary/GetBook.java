package Alibrary;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GetBook extends JFrame implements ActionListener {
	String BookName = "";
	JLabel nameOfBook, price, totalBookCount, bookQuantityLabel, searchAndTypeLabel;
	static JLabel isAvailable, availableBookinfo, date;
	static JLabel innameOfBook, inprice, intotalBookCount;
	JTextField inUserBookCount;
	JTextField jtf;
	JButton buy, back, search;
	static boolean flag;
	static JPanel jpl;
	Layout L;

	public GetBook(Layout L) {
		this.L = L;
		put(BookName);// add all to available label
		setBounds(370, 10, 500, 450);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);/* only destroy this fram */
		setLayout(null);
		addWindowListener(backHandle.instance);/* call x - click layout will visisble */
		Font f = new Font("Calibri", Font.BOLD, 24);
		Color c = Color.CYAN;
		JLabel l = new JLabel(" Get the books");
		l.setBounds(150, 0, 500, 50);
		l.setFont(f);
		l.setForeground(c);
		add(l);
		JLabel icon = new JLabel(new ImageIcon("C:\\library\\persion.png"));// icon.setBorder(BorderFactory.createLineBorder(Color.gray,2));
		icon.setBounds(0, 95, 180, 200);
		add(icon);
		/* date and time show */ //
		date = new JLabel(String.valueOf(java.time.LocalDateTime.now()));
		date.setBounds(330, 65, 150, 30);
		add(date);
		showTime(); /* search details label */
		searchAndTypeLabel = new JLabel("Type and Search");
		searchAndTypeLabel.setBounds(190, 65, 110, 30);
		add(searchAndTypeLabel);
		/* input searh filed */
		jtf = new JTextField();
		jtf.setBounds(190, 100, 220, 30);
		jtf.setFont(new Font("Calibri", Font.BOLD, 21));
		jtf.setAlignmentY(BOTTOM_ALIGNMENT);
		jtf.setBackground(Color.gray);
		add(jtf);
		jtf.setForeground(Color.WHITE);
		/* search button */
		search = new JButton(new ImageIcon("C:\\library\\search.png"));
		search.setBorderPainted(false);
		search.setBackground(Color.blue);
		search.addActionListener(this);
		search.setBounds(415, 100, 40, 30);
		add(search);
		/* Available */
		isAvailable = new JLabel("");
		isAvailable.setBounds(200, 125, 100, 30);
		isAvailable.setForeground(Color.green);
		add(isAvailable);
		availableBookinfo = new JLabel("Availble Books");
		availableBookinfo.setBounds(310, 125, 100, 30);
		availableBookinfo.setForeground(Color.green);
		add(availableBookinfo);
		availableBookinfo.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(GetBook.this, BookName, "All Books", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		/* buy panel */
		jpl = new JPanel();
		jpl.setBounds(200, 160, 220, 170);
		jpl.setLayout(null);
		jpl.setBorder(BorderFactory.createLineBorder(Color.green, 3));
		add(jpl);
		nameOfBook = new JLabel("book name");
		nameOfBook.setBounds(10, 10, 70, 20);
		jpl.add(nameOfBook);
		innameOfBook = new JLabel("  ---  ");
		innameOfBook.setBounds(10, 30, 50, 20);
		jpl.add(innameOfBook);

		price = new JLabel("price");
		price.setBounds(80, 10, 50, 20);
		jpl.add(price);
		inprice = new JLabel("  --  ");
		inprice.setBounds(80, 30, 50, 20);
		jpl.add(inprice);

		totalBookCount = new JLabel("Available book");
		totalBookCount.setBounds(125, 10, 90, 20);
		jpl.add(totalBookCount);
		intotalBookCount = new JLabel("  --  ");
		intotalBookCount.setBounds(140, 30, 50, 20);
		jpl.add(intotalBookCount);

		bookQuantityLabel = new JLabel("book quantity");
		bookQuantityLabel.setBounds(10, 70, 90, 30);
		jpl.add(bookQuantityLabel);
		inUserBookCount = new JTextField();
		inUserBookCount.setBounds(10, 100, 50, 30);
		jpl.add(inUserBookCount);
		buy = new JButton();
		buy.setBackground(new Color(0, 0, 0));
		buy.setIcon(new ImageIcon("C:\\library\\buy.png"));
		buy.setBounds(80, 100, 40, 40);
		jpl.add(buy);
		buy.addActionListener(this);
		back = new JButton(new ImageIcon("C:\\library\\back.png"));
		back.setBounds(225, 350, 50, 50);
		add(back);
		back.addActionListener(this);
		/* make hide for no input */
		buy.setVisible(flag);
		inUserBookCount.setVisible(flag);
		bookQuantityLabel.setVisible(flag);

	}

	public void put(String bookName) {
		this.BookName = toOracleData.oracleGet(bookName, true);
	}

	public void showTime() {
		Runnable r = () -> {
			String str = "";
			while (true) {
				LocalDateTime d = LocalDateTime.now();
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
				str = String.valueOf(dtf.format(d));
				date.setText(str);
			}
		};
		Thread t = new Thread(r);
		t.start();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buy && flag) {
			int inUserBook = 0;
			boolean bookCountInputFieldiIsValid = false;
			int bookPrice = Integer.valueOf(inprice.getText());
			try {
				inUserBook = Integer.parseInt(inUserBookCount.getText()); // 10
				if (inUserBook > 0) {
					bookCountInputFieldiIsValid = true;
				}
			} catch (NumberFormatException numExcep) {
				JOptionPane.showMessageDialog(this, "only write number don't do  stupidity", "info",
						JOptionPane.PLAIN_MESSAGE, new ImageIcon("C:\\library\\invalid.png"));
			}
			if (bookCountInputFieldiIsValid && (Integer.parseInt(intotalBookCount.getText())) >= inUserBook) {
				String money = JOptionPane.showInputDialog(this, "pay rupees " + bookPrice * inUserBook);
				boolean panelinputValueCheck = false;
				try {
					if (!(money == null || money.equals("")) && (Integer.parseInt(money) >= 0)) {
						panelinputValueCheck = true;
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(this,
							"please insert amount in number \nplease amount should be greater 0");
				}

				/* 10 */ if (panelinputValueCheck) {// user will click OK == "" user click cancel==null !-just make
													// condition false not execute program
					int userpPice = Integer.parseInt(money);
					if ((bookPrice * inUserBook) == userpPice) {
						toOracleData.oracleReturnBook(innameOfBook.getText(),
								Integer.parseInt(inUserBookCount.getText()), true);
						JOptionPane.showMessageDialog(this, "payment is dones", "info", JOptionPane.PLAIN_MESSAGE,
								new ImageIcon("C:\\library\\done.png"));
						intotalBookCount.setText("" + (((Integer.parseInt(intotalBookCount.getText())) - inUserBook)));
					} else if ((bookPrice * inUserBook) < userpPice) {
						JOptionPane.showMessageDialog(this, "Payement No succseed you have paid extra", "info",
								JOptionPane.PLAIN_MESSAGE,
								new ImageIcon("C:\\library\\extra.png"));
					} else {
						JOptionPane.showMessageDialog(this, "you amount is insuffient", "info",
								JOptionPane.PLAIN_MESSAGE,
								new ImageIcon("C:\\library\\invalid.png"));
					}
				}
			} else {
				JOptionPane.showMessageDialog(this, "We don't have enough book", "info", JOptionPane.PLAIN_MESSAGE,
						new ImageIcon("C:\\library\\lessbook.png"));
			}
			// --end bookCountInputFieldValid

		} // --end buy action
			// search action
		if (e.getSource() == search) {
			if (!jtf.getText().equals("")) {
				flag = false;
				toOracleData.oracleGet(new String(jtf.getText()),
						false);/* set data to component set flag true if book found */
				if (flag == true) {
					if (0 < (Integer.parseInt(intotalBookCount.getText()))) {
						isAvailable.setForeground(Color.green);
						isAvailable.setText("availble");
						buy.setVisible(flag);
						inUserBookCount.setVisible(flag);
						bookQuantityLabel.setVisible(flag);
					} else if (Integer.parseInt(intotalBookCount.getText()) == 0) {
						isAvailable.setForeground(Color.green);
						isAvailable.setText("availble soon");
						isAvailable.setForeground(Color.blue);
						buy.setVisible(false);
						inUserBookCount.setVisible(false);
						bookQuantityLabel.setVisible(false);
					}
				} else {
					isAvailable.setForeground(Color.red);
					isAvailable.setText("Sorry no founded");
					innameOfBook.setText("  --  ");
					inprice.setText("   --  ");
					buy.setVisible(flag);
					inUserBookCount.setText("");
					inUserBookCount.setVisible(flag);
					bookQuantityLabel.setVisible(flag);
					intotalBookCount.setText("--");
				}
			}
		}
		/* back button */
		if (e.getSource() == back) {
			flag = false;
			L.setVisible(true);
			this.dispose();
		}

	}
}