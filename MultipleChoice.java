import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MultipleChoice extends JFrame implements ActionListener {
	private JRadioButton button1 = new JRadioButton("More than one check boxes can be selected");
	private JRadioButton button2 = new JRadioButton("More than one radio button can be selected");
	private JRadioButton button3 = new JRadioButton("There are at most five components in Border Layout Manager");
	private JButton submitButton = new JButton("Submit");
	private ButtonGroup optionGroup = new ButtonGroup();

	public MultipleChoice() {
		super("MC Questions");
		
		setLayout(new GridLayout(4,1));
		add(button1);
		add(button2);
		add(button3);
		
		optionGroup.add(button1);
		optionGroup.add(button2);
		optionGroup.add(button3);
		
		add(submitButton);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		submitButton.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		
	}

	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == submitButton){
			if(button2.isSelected())
				submitButton.setText("Your choice is correct");
			else
				submitButton.setText("Your choice is wrong");
		}
		pack();
	}

	public static void main(String[] args) {
		MultipleChoice mc = new MultipleChoice();
		mc.setVisible(true);
	}
}