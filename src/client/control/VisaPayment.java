package client.control;

import javax.swing.JOptionPane;

import client.view.SearchBook;
import client.view.VisaDetails;
import fi.aalto.t_75_5300.bank.MakeVisaTransaction;
import fi.aalto.t_75_5300.bank.VisaCard;
import fi.aalto.t_75_5300.bank.VisaTransaction;

public class VisaPayment {
	public void makePayment(int amount) {
		VisaDetails visaDetailsObject = new VisaDetails();
		String[] visaDetails = visaDetailsObject.visaForm();
		
		VisaCard visaCard = new VisaCard();
		visaCard.setOwner(visaDetails[0]);
		visaCard.setNumber(visaDetails[1]);
		visaCard.setCsv(visaDetails[2]);
		VisaTransaction visaTransaction = new VisaTransaction();
		visaTransaction.setAmountInCents(amount * 100);
		visaTransaction.setCard(visaCard);
		MakeVisaTransaction transaction = new MakeVisaTransaction();
		transaction.setArg0(visaTransaction);
    	JOptionPane.showMessageDialog(null, "The payment has been successful.", "Payment Status", JOptionPane.INFORMATION_MESSAGE);
    	
		try {
			SearchBook frame = new SearchBook();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
