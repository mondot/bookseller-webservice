package client.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import client.control.BookSellerWebService;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;

public class SearchBook extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterYourBook;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchBook frame = new SearchBook();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SearchBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 100));
		setContentPane(contentPane);
		
		JLabel lblWelcomeToAalto = new JLabel("Welcome to Aalto Book Seller BETA");
		lblWelcomeToAalto.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblWelcomeToAalto, BorderLayout.NORTH);
		
		txtEnterYourBook = new JTextField();
		txtEnterYourBook.setText("Enter your book search here");
		contentPane.add(txtEnterYourBook, BorderLayout.CENTER);
		txtEnterYourBook.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		contentPane.add(btnSearch, BorderLayout.EAST);

		Action action = new AbstractAction()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		        try {
					BookSellerWebService.searchBook(txtEnterYourBook.getText());
					setVisible(false);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
		    }
		};
		
		btnSearch.addActionListener(action);
		getRootPane().setDefaultButton(btnSearch);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
	}
}
