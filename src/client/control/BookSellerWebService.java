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
	
	public static void payBook(int amount, String debitedAccount) {
		String creditedAccount = "01234567890";
		String currency = "USD";
		BankingServiceImplService bankingServiceImpl = new BankingServiceImplService();  
    	BankingService bankingService = bankingServiceImpl.getBankingServiceImplPort();
    	String paymentStatus = bankingService.payment(amount, currency, debitedAccount, creditedAccount);
    	JOptionPane.showMessageDialog(null, paymentStatus, "Payment Status", JOptionPane.INFORMATION_MESSAGE);
	}
}
