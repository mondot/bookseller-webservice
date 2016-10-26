package client.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import client.control.BookSellerWebService;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookResults extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public BookResults(String[] results, String offer) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		
		JPanel panel_2 = new JPanel();
		
		JLabel lblOffer_1 = new JLabel("Offer: <dynamic>");
		panel_2.add(lblOffer_1);
		lblOffer_1.setText("The price is " + offer + " $.");
		
		JSeparator separator_1 = new JSeparator();
		panel_2.add(separator_1);
		
		JButton buyButton = new JButton("Buy");
		buyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String debitedAccount = JOptionPane.showInputDialog("Payment Process", "Enter your account number");
				double amount = Double.parseDouble(offer);
				int correctedAmount = (int) amount;
				BookSellerWebService.payBook(correctedAmount, debitedAccount);
			}
		});

		panel_2.add(buyButton);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap(13, Short.MAX_VALUE)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(13)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
								.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))))
					.addGap(3))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap(16, Short.MAX_VALUE)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		
		JLabel lblTitle = new JLabel("Title");
		panel_1.add(lblTitle);
		lblTitle.setText("Title: " + results[0]);
		
		JSeparator separator = new JSeparator();
		panel_1.add(separator);

		JLabel lblAverageRating = new JLabel("Average Rating");
		panel_1.add(lblAverageRating);
		lblAverageRating.setText("Rating: " + results[1]);

		textPane.setText(results[2]);
		
		JLabel lblResultsFromYou = new JLabel("Results from you search");
		lblResultsFromYou.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblResultsFromYou.setBackground(Color.WHITE);
		panel.add(lblResultsFromYou);
		contentPane.setLayout(gl_contentPane);
	}
}
