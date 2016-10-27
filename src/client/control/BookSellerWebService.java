package client.control;

import javax.swing.JOptionPane;

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
			
		Object[] options = {"Bank Transfer",
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
			BankTransfer bankTransfer = new BankTransfer();
			bankTransfer.makePayment(amount, currency, creditedAccount);
		} else {
			VisaPayment visaPayment = new VisaPayment();
			visaPayment.makePayment(amount);
		}
	}
}
