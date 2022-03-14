package Alibrary;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.function.ToDoubleBiFunction;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MakeSomeChange extends JFrame implements ItemListener, ActionListener {
	JLabel title, deleteicon, addBookCounticon, renameBookicon, Quantity, changePriceIcon;
	JLabel deleteBook, chooseQuantity;
	JLabel addQuantityLabel, EnterQuantity;
	JTextField in;
	JButton addBbtn;
	JLabel changeName, newName;
	JTextField innewName;
	JButton renameBookbtn;
	JLabel changepriceLabel, newpriceLabel;
	JTextField inprice;
	JButton changepricebtn;
	JCheckBox selectAll, custom;
	JComboBox jc1, jc2, jc3, jc4;
	String[] arr;
	JButton back, deletebtn;
	JTextField inQuantity;
	Layout L;

	public MakeSomeChange(Layout L) {
		this.L = L;
		addContentToJComboBox();
		setBounds(370, 10, 500, 550);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		title = new JLabel("Make some change");
		title.setBounds(100, 0, 350, 50);
		title.setForeground(Color.blue);
		addWindowListener(backHandle.instance);
		title.setFont(new Font("verdana", Font.BOLD, 28));
		add(title);
		/* add delete icon */
		deleteicon = new JLabel(new ImageIcon("C:\\library\\detele.png"));
		deleteicon.setBounds(30, 100, 50, 50);
		add(deleteicon);
		/* Delete Book label */
		deleteBook = new JLabel("Delete Book");
		deleteBook.setBounds(120, 80, 100, 30);
		add(deleteBook);
		/* Jc for list of Book */
		jc1 = new JComboBox(arr);
		jc1.setBounds(120, 108, 110, 30);
		add(jc1);
		/* choose Quantity label */
		chooseQuantity = new JLabel("choose quantity");
		chooseQuantity.setBounds(250, 80, 90, 30);
		add(chooseQuantity);
		/* select all check box */
		selectAll = new JCheckBox("All");
		selectAll.setBounds(248, 108, 40, 30);
		add(selectAll);
		selectAll.addItemListener(this);
		/* custom cehck box */
		custom = new JCheckBox("Custom");
		custom.setBounds(285, 108, 70, 30);
		add(custom);
		custom.addItemListener(this);
		/* Enter Quantity label */
		Quantity = new JLabel("Quantity");
		Quantity.setBounds(358, 80, 55, 30);
		add(Quantity);
		/* asking for input */
		inQuantity = new JTextField();
		inQuantity.setBounds(360, 108, 40, 30);
		add(inQuantity);
		inQuantity.setVisible(false);
		/* Delete button */
		deletebtn = new JButton("Delete");
		deletebtn.setBounds(130, 145, 70, 30);
		add(deletebtn);
		deletebtn.addActionListener(this);

		/* add book count icon */
		addBookCounticon = new JLabel(new ImageIcon("C:\\library\\addbookicon.png"));
		addBookCounticon.setBounds(30, 200, 50, 50);
		add(addBookCounticon);
		/* add new Book label */
		addQuantityLabel = new JLabel("Add more Quantity");
		addQuantityLabel.setBounds(120, 190, 105, 30);
		add(addQuantityLabel);
		/* choose book for addd more quantity */
		jc2 = new JComboBox(arr);
		jc2.setBounds(120, 218, 110, 30);
		add(jc2);
		/* Showing Quantity */
		EnterQuantity = new JLabel("Quantity");
		Quantity.setBounds(255, 190, 55, 30);
		add(EnterQuantity);
		/* Input Quantity for adding */
		in = new JTextField();
		in.setBounds(255, 218, 40, 30);
		add(in);
		/* Add book button */
		addBbtn = new JButton("Add");
		addBbtn.setBounds(130, 255, 60, 30);
		add(addBbtn);
		addBbtn.addActionListener(this);

		/* add rename book icon */
		renameBookicon = new JLabel(new ImageIcon("C:\\library\\rename.png"));
		renameBookicon.setBounds(30, 300, 50, 50);
		add(renameBookicon);
		/* change book name label */
		changeName = new JLabel("Choose Book");
		changeName.setBounds(120, 290, 105, 30);
		add(changeName);
		/* choose book for addd more quantity */
		jc3 = new JComboBox(arr);
		jc3.setBounds(120, 318, 110, 30);
		add(jc3);
		/* new name book label */
		newName = new JLabel("New Name");
		newName.setBounds(255, 290, 80, 30);
		add(newName);
		/* Input new name */
		innewName = new JTextField();
		innewName.setBounds(255, 318, 100, 30);
		add(innewName);
		/* Rename button */
		renameBookbtn = new JButton("rename");
		renameBookbtn.setBounds(130, 355, 80, 30);
		add(renameBookbtn);
		renameBookbtn.addActionListener(this);

		/* add rename book icon */
		changePriceIcon = new JLabel(new ImageIcon("C:\\library\\changeprice.png"));
		changePriceIcon.setBounds(30, 420, 50, 50);
		add(changePriceIcon);
		/* change book name label */
		changepriceLabel = new JLabel("change book");
		changepriceLabel.setBounds(120, 400, 105, 30);
		add(changepriceLabel);
		/* choose book for addd more quantity */
		jc4 = new JComboBox(arr);
		jc4.setBounds(120, 428, 110, 30);
		add(jc4);
		/* new name book label */
		newpriceLabel = new JLabel("New price");
		newpriceLabel.setBounds(255, 400, 80, 30);
		add(newpriceLabel);
		/* Input new name */
		inprice = new JTextField();
		inprice.setBounds(255, 428, 100, 30);
		add(inprice);
		/* Rename button */
		changepricebtn = new JButton("Change");
		changepricebtn.setBounds(130, 465, 80, 30);
		add(changepricebtn);
		changepricebtn.addActionListener(this);

		back = new JButton(new ImageIcon("C:\\library\\back.png"));
		back.setBounds(20, 20, 50, 50);
		add(back);
		back.setBackground(getBackground());
		back.setBorderPainted(false);
		back.addActionListener(this);
	}

	void addContentToJComboBox() {
		arr = toOracleData.oracleReturnAddCombo();
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == selectAll) {
			if (selectAll.isSelected()) {
				custom.setSelected(false);
				inQuantity.setVisible(false);
				inQuantity.setText("");
			}
		}

		if (e.getSource() == custom) {
			if (custom.isSelected()) {
				selectAll.setSelected(false);
				inQuantity.setVisible(true);
			}
		}

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == back) {
			L.setVisible(true);
			this.dispose();
		}

		if (jc1.getSelectedItem() == null && jc2.getSelectedItem() == null && jc3.getSelectedItem() == null
				&& jc4.getSelectedItem() == null) {
			JOptionPane.showMessageDialog(this, "Please add book from add books section");
		} else {
			if (e.getSource() == addBbtn) {
				String str = "";
				int count = 0;
				try {
					str = String.valueOf(jc2.getSelectedItem());
					count = Integer.parseInt(in.getText());
				} catch (NumberFormatException nu) {
				}
				if (!str.equals("") & count > 0) {
					if (toOracleData.oracleReturnBook(str, count, false)) {
						JOptionPane.showMessageDialog(this, "Added More book successfully");
					}
				} else {
					JOptionPane.showMessageDialog(this,
							"please insert greater then 0 or input number should not be string");
				}
			}

			if (e.getSource() == deletebtn) {
				if (selectAll.isSelected()) {
					deleteTotallY();
				}

				if (custom.isSelected()) {
					String str = "";
					int count = 0;
					try {
						str = String.valueOf(jc1.getSelectedItem());
						count = Integer.parseInt(inQuantity.getText());
					} catch (NumberFormatException nu) {
					}
					if (!str.equals("") & count > 0) {
						if (toOracleData.oracleReturnBook(str, count, true)) {
							JOptionPane.showMessageDialog(this, "Number Book  Remove successfully");
						} else {
							deleteTotallY();
						}
					} else {
						JOptionPane.showMessageDialog(this,
								"please insert greater then 0 or input number should not be string");
					}
				}
			}

			if (e.getSource() == renameBookbtn) {
				if (!innewName.getText().equals(String.valueOf(jc3.getSelectedItem()))) {
					{
						String str = innewName.getText();
						if (!str.isBlank()) {
							if (toOracleData.changeName(String.valueOf(jc3.getSelectedItem()), str)) {
								JOptionPane.showMessageDialog(this, "Book Name change successfully");
								Object curObj = jc1.getSelectedItem();
								jc1.removeItem(curObj);
								jc2.removeItem(curObj);
								;
								jc3.removeItem(curObj);
								jc4.removeItem(curObj);
								jc1.addItem(str);
								jc2.addItem(str);
								jc3.addItem(str);
								jc4.addItem(str);
							}
						}
					}
				} else {
					JOptionPane.showMessageDialog(this, "brother is same please gives different name");
				}
			}
			if (e.getSource() == changepricebtn) {
				int n = 0;
				try {
					n = Integer.parseInt(inprice.getText());
					if (toOracleData.changePrice(String.valueOf(jc4.getSelectedItem()), n)) {
						JOptionPane.showMessageDialog(this, "Book price change successfully");
					}
				} catch (NumberFormatException nu) {
					JOptionPane.showMessageDialog(this,
							"please insert greater then 0 or input number should not be string");
				}
			}
		} // main if---
	}// end action performed

	void deleteTotallY() {
		String str = String.valueOf(jc1.getSelectedItem());
		toOracleData.deleteBookTotally(str);
		JOptionPane.showMessageDialog(this, "Book Remove Totally");
		Object curObj = jc1.getSelectedItem();
		jc1.removeItem(curObj);
		jc2.removeItem(curObj);
		;
		jc3.removeItem(curObj);
		jc4.removeItem(curObj);

	}
}