import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binary_Converter implements ActionListener {
	private String binary;
	
	JFrame frame = new JFrame();
	JTextField answer = new JTextField(20);
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button = new JButton("Convert");
	
	public Binary_Converter() {
		
	String answerInput = JOptionPane.showInputDialog("Insert Binary: ");
		binary = answerInput;
		answer.setText(answerInput);
		panel.add(label);
		panel.add(answer);
		frame.add(panel);
		panel.add(button);
		frame.setVisible(true);
		frame.setSize(500, 100);
		button.addActionListener(this);
		
	}
	
	String convert(String input){
		binary = input;
		
	    if(input.length() != 8){
	         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	         return "-";
	    }
	    String binary = "[0-1]+";    //must contain numbers in the given range
	    if (!input.matches(binary)) {
	         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	         return "-";
	    }
	    try {
	         int asciiValue = Integer.parseInt(input, 2);
	         char theLetter = (char) asciiValue;
	         return "" + theLetter;
	    } catch (Exception e) {
	         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	         return "-";
	    }
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		
		if(arg0.getSource()==button){
			label.setText(convert(binary));
			
		}
	}
	
}


