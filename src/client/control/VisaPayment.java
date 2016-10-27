package client.control;

import javax.swing.JOptionPane;
import javax.xml.ws.BindingProvider;

import client.view.SearchBook;
import client.view.VisaDetails;
import fi.aalto.t_75_5300.bank.MakeVisaTransaction;
import fi.aalto.t_75_5300.bank.TransactionException_Exception;
import fi.aalto.t_75_5300.bank.TransactionResult;
import fi.aalto.t_75_5300.bank.TransactionService;
import fi.aalto.t_75_5300.bank.Transactions;
import fi.aalto.t_75_5300.bank.VisaCard;
import fi.aalto.t_75_5300.bank.VisaTransaction;

public class VisaPayment {
	public void makePayment(int amount) throws TransactionException_Exception {
		VisaDetails visaDetailsObject = new VisaDetails();
		String[] visaDetails = visaDetailsObject.visaForm();
		
		VisaCard visaCard = new VisaCard();
		visaCard.setOwner(visaDetails[0]);
		visaCard.setNumber(visaDetails[1]);
		visaCard.setCsv(visaDetails[2]);
		visaCard.setValidMonth(Integer.parseInt(visaDetails[3]));
		visaCard.setValidYear(Integer.parseInt(visaDetails[4]));

		VisaTransaction visaTransaction = new VisaTransaction();
		visaTransaction.setAmountInCents(amount * 100);
		visaTransaction.setCard(visaCard);

		MakeVisaTransaction transaction = new MakeVisaTransaction();
		transaction.setArg0(visaTransaction);
		TransactionService transactionService = new TransactionService();

		Transactions port = transactionService.getTransactionsPort();
		BindingProvider bindingProvider = (BindingProvider) port;
		bindingProvider.getRequestContext().put(
		      BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
		      "http://demo.seco.tkk.fi/ws/6/t755300bank/services/v1/transactions");

		TransactionResult transactionResult = port.makeVisaTransaction(visaTransaction);
		System.out.println(transactionResult.getArchiveNumber());

    	JOptionPane.showMessageDialog(null, "The payment has been successful.", "Payment Status", JOptionPane.INFORMATION_MESSAGE);
    	
		try {
			SearchBook frame = new SearchBook();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
