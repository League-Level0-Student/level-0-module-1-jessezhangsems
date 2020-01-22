package _02_unbirthday;

import javax.swing.JOptionPane;

public class Happy_Unbirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input =JOptionPane.showInputDialog("What is your birthday?");
if (input.equals("January 15th")) {
	JOptionPane.showMessageDialog(null, "Woah! Happy Birthday!");
	
	
	
}

else{
	JOptionPane.showMessageDialog(null, "Happy Unbirthday!");	
}
	}

}
