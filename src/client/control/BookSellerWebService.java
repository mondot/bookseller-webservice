package client.control;

import javax.swing.JOptionPane;

import bankingservice.BankingService;
import bankingservice.BankingServiceImplService;
import client.view.BookResults;

public class BookSellerWebService {

	public static void searchBook(String keyword) throws Exception {
		String[] result = GoodreadsAPI.getInformationsByKeyword(keyword);
		System.out.println("Title: " + result[0] + " Average Rating: " + result[1] + " Description: " + result[2]);
		
		String offer = eBayAPI.getOffersByKeyword(keyword);

		BookResults frame = new BookResults(result, offer);
		frame.setVisible(true);
	}
	
	public static void payBook(int amount) {
		String creditedAccount = "01234567890";
		String currency = "USD";
			
		Object[] options = {"PayPal",
		                    "Visa"};
		int choice = JOptionPane.showOptionDialog(null,
		    "Please choose the payment method",
		    "Banking Service",
		    JOptionPane.DEFAULT_OPTION,
		    JOptionPane.QUESTION_MESSAGE,
		    null,
		    options,
		    options[0]);
		
		if (choice == 0) {
			String debitedAccount = JOptionPane.showInputDialog("Payment Process", "Enter your account number");
			BankingServiceImplService bankingServiceImpl = new BankingServiceImplService();  
	    	BankingService bankingService = bankingServiceImpl.getBankingServiceImplPort();
	    	String paymentStatus = bankingService.payment(amount, currency, debitedAccount, creditedAccount);
	    	JOptionPane.showMessageDialog(null, paymentStatus, "Payment Status", JOptionPane.INFORMATION_MESSAGE);
		} else {
			
		}

	}
}
