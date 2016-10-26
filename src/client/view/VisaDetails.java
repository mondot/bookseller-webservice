package client.view;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VisaDetails {

	public String[] visaForm() {
	        JTextField ownerField = new JTextField();
	        JTextField numberField = new JTextField();
	        JTextField csvField = new JTextField();
	        JPanel panel = new JPanel(new GridLayout(0, 1));
	        
	        panel.add(new JLabel("Owner of the card"));
	        panel.add(ownerField);
	        panel.add(new JLabel("Number of the card"));
	        panel.add(numberField);
	        panel.add(new JLabel("Csv"));
	        panel.add(csvField);
	        int result = JOptionPane.showConfirmDialog(null, panel, "Test",
	            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
	        if (result == JOptionPane.OK_OPTION) {
	            String[] visaDetails = {ownerField.getText(), numberField.getText(), csvField.getText()};
	            return visaDetails;
	        } else {
	        	JOptionPane.showMessageDialog(null, "The payment has been cancelled.", "Payment Status", JOptionPane.INFORMATION_MESSAGE);
				return null;        
	        }
	}
}
