package client.view;

import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VisaDetails {

	public String[] visaForm() {
	        JTextField ownerField = new JTextField();
	        JTextField numberField = new JTextField();
	        JTextField csvField = new JTextField();
	        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
	        Integer[] validMonths = new Integer[12];
	        for (int i=0;i<12;i++){
	        	validMonths[i] = i+1;
	        }
	        JComboBox<Integer> validMonthsBox = new JComboBox<>(validMonths);
	        Integer[] validYears = new Integer[10];
	        int inc=0;
	        for(int i=currentYear;i<currentYear+10;i++){
	        	validYears[inc]= i;
	            inc++;
	        }
	        JComboBox<Integer> validYearsBox = new JComboBox<>(validYears);
	        JPanel panel = new JPanel(new GridLayout(0, 1));
	        
	        panel.add(new JLabel("Owner of the card"));
	        panel.add(ownerField);
	        panel.add(new JLabel("Number of the card"));
	        panel.add(numberField);
	        panel.add(new JLabel("Csv"));
	        panel.add(csvField);
	        panel.add(new JLabel("valid Month"));
	        panel.add(validMonthsBox);
	        panel.add(new JLabel("valid Year"));
	        panel.add(validYearsBox);
	        int result = JOptionPane.showConfirmDialog(null, panel, "Test",
	            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
	        if (result == JOptionPane.OK_OPTION) {
	            String[] visaDetails = {ownerField.getText(), numberField.getText(), csvField.getText(), validMonthsBox.getSelectedItem().toString(), validYearsBox.getSelectedItem().toString()};
	            return visaDetails;
	        } else {
	        	JOptionPane.showMessageDialog(null, "The payment has been cancelled.", "Payment Status", JOptionPane.INFORMATION_MESSAGE);
				return null;        
	        }
	}
}
