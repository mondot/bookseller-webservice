package client.control;

import javax.swing.JOptionPane;

import bankingservice.BankingService;
import bankingservice.BankingServiceImplService;
import client.view.SearchBook;

public class BankTransfer {
	public void makePayment(int amount, String currency, String creditedAccount) {
		String debitedAccount = JOptionPane.showInputDialog("Payment Process", "Enter your account number");
		BankingServiceImplService bankingServiceImpl = new BankingServiceImplService();  
    	BankingService bankingService = bankingServiceImpl.getBankingServiceImplPort();
    	String paymentStatus = bankingService.payment(amount, currency, debitedAccount, creditedAccount);
    	JOptionPane.showMessageDialog(null, paymentStatus, "Payment Status", JOptionPane.INFORMATION_MESSAGE);
    	
		try {
			SearchBook frame = new SearchBook();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
