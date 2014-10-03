package pkg;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Gui extends JFrame implements ActionListener{

	JButton button1 = new JButton();
	private JButton button2 = new JButton();
	private JButton button3 = new JButton();
	private JButton button4 = new JButton();
	private JButton button5 = new JButton();
	private JButton button6 = new JButton();
	private JButton button7 = new JButton();
	private JButton button8 = new JButton();
	private JButton button9 = new JButton();
	int count=1;





	public void setupGui(){

		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button7);
		this.add(button8);
		this.add(button9);
		this.setLayout(new GridLayout(3,3));

		this.setSize(300,300);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);



		button1.addActionListener( this);
		button2.addActionListener( this);
		button3.addActionListener( this);
		button4.addActionListener( this);
		button5.addActionListener( this);
		button6.addActionListener( this);
		button7.addActionListener( this);
		button8.addActionListener( this);
		button9.addActionListener( this);




	} 

	public void actionPerformed(ActionEvent e) {
		String XorO="X";



		if(count%2==0){
			XorO="O";
			//  System.out.println("even"+count);
		}else{
			XorO="X";
			// System.out.println("odd"+count);
		}


		if(e.getSource() == button1){
			button1.setText(XorO);
			button1.setEnabled(false);
			count ++;

		}
		else if(e.getSource() == button2){
			button2.setText(XorO);
			button2.setEnabled(false);
			count ++;

		
		}
		else if(e.getSource() == button3){
			button3.setText(XorO);
			button3.setEnabled(false);
			count ++;
		}
		else if(e.getSource() == button4){
			button4.setText(XorO);
			button4.setEnabled(false);
			count ++;
		}
		else if(e.getSource() == button5){
			button5.setText(XorO);
			button5.setEnabled(false);
			count ++;
		}
		else if(e.getSource() == button6){
			button6.setText(XorO);
			button6.setEnabled(false);
			count ++;
		}
		else if(e.getSource() == button7){
			button7.setText(XorO);
			button7.setEnabled(false);
			count ++;
		}
		else if(e.getSource() == button8){
			button8.setText(XorO);
			button8.setEnabled(false);
			count ++;

		}
		else if(e.getSource() == button9){
			button9.setText(XorO);
			button9.setEnabled(false);
			count ++;

		}


		if(button1.getText()==button2.getText()&&button3.getText()==button2.getText()&&button1.getText()==button3.getText()
				&&button1.getText().isEmpty()==false&&button2.getText().isEmpty()==false&&button3.getText().isEmpty()==false){

			JOptionPane.showMessageDialog(this, "The winner is "+button1.getText());
			System.out.println("winner Top row"+button1.getText());
		}

		if(button4.getText()==button5.getText()&&button6.getText()==button5.getText()&&button4.getText()==button6.getText()
				&&button4.getText().isEmpty()==false&&button5.getText().isEmpty()==false&&button6.getText().isEmpty()==false){

			JOptionPane.showMessageDialog(this, "The winner is "+button4.getText());
			System.out.println("winner middle row"+button4.getText());
		}
		if(button7.getText()==button8.getText()&&button9.getText()==button8.getText()&&button9.getText()==button7.getText()
				&&button1.getText().isEmpty()==false&&button2.getText().isEmpty()==false&&button3.getText().isEmpty()==false){

			JOptionPane.showMessageDialog(this, "The winner is "+button7.getText());
			System.out.println("winner"+button7.getText());
		}
		
		if(button1.getText()==button4.getText()&&button7.getText()==button4.getText()&&button1.getText()==button4.getText()
				&&button1.getText().isEmpty()==false&&button4.getText().isEmpty()==false&&button7.getText().isEmpty()==false){

			JOptionPane.showMessageDialog(this, "The winner is "+button7.getText());
			System.out.println("winner"+button7.getText());
		}

	} 






	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}


}
