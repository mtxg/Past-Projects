import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


/**This program creates a simple GUI calculator
 * with extra credit challenge
 * 
 * @author max_guerrero
 *
 */
public class Calculator extends JFrame
{
	JLabel label = new JLabel();
	JLabel equals = new JLabel("=");
	JLabel sum = new JLabel();
	JButton button = new JButton("Calculate!");
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JTextField text1 = new JTextField(4);
	JTextField text2 = new JTextField(4);



	/**this class adds the buttons to the panel and sets the labels
	 *  and commands based on what is selected
	 * 
	 * @param title
	 */
	public Calculator(String title)
	{
		super(title);
		//add things to the frame
		setLayout(new GridLayout(2,1));
		this.panel.add(this.text1);
		this.panel.add(this.label);
		this.panel.add(this.text2);
		this.panel.add(this.equals);
		this.panel.add(this.sum);

		panel2.add(button, BorderLayout.SOUTH);//add another panel for better looking calculate button

		ButtonGroup opGroup = new ButtonGroup();//add radio buttons
		final JRadioButton add = new JRadioButton("+");
		final JRadioButton subtract = new JRadioButton("-");
		final JRadioButton multiply = new JRadioButton("*");
		final JRadioButton divide = new JRadioButton("/");
		//tried using a for loop but found it hard to set the label with the selected button
		panel2.add(add);
		panel2.add(subtract);
		panel2.add(multiply);
		panel2.add(divide);
		opGroup.add(add);
		opGroup.add(subtract);
		opGroup.add(multiply);
		opGroup.add(divide);

		//sets the label to the + button when selected immediately
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{

				if(add.isSelected())
				{
					label.setText("+");
				}
			}
		});
		//sets the label to the - button when selected immediately
		subtract.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{

				if(subtract.isSelected())
				{
					label.setText("-");
				}
			}
		});
		//sets the label to the * button when selected immediately
		multiply.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{

				if(multiply.isSelected())
				{
					label.setText("*");
				}
			}
		});
		//sets the label to the / button when selected immediately
		divide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{

				if(divide.isSelected())
				{
					label.setText("/");
				}
			}
		});
		//based on which button is selected, the calculate button will execute the calculation selected
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				try{
					double numOne = Double.parseDouble(text1.getText());
					double numTwo = Double.parseDouble(text2.getText());

					if(add.isSelected())
					{
						sum.setText(String.valueOf(numTwo + numOne));
					}
					else if(subtract.isSelected())
					{
						sum.setText(String.valueOf(numTwo - numOne));
					}
					else if(multiply.isSelected())
					{
						sum.setText(String.valueOf(numTwo * numOne));
					}
					else if(divide.isSelected())
					{
						sum.setText(String.valueOf(numTwo / numOne));
					}
				}catch(NumberFormatException a) {
					JOptionPane.showMessageDialog(null,
							"Error: You must enter a number");
					// exception pops open a new window if anything other than a double is selected
				}catch (ArithmeticException a) {
					JOptionPane.showMessageDialog(null,
							"Error: You cannot divide by zero");
				}
			}
		});
		
		add(panel, BorderLayout.NORTH);
		add(panel2, BorderLayout.SOUTH);
	}

	//the main of the program makes the actual frame and runs it 
	public static void main(String[] args)
	{
		Calculator frame = new Calculator("CalcuMatic!");
		frame.setSize(350,150);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//exits the program when window is closed
	}
}

