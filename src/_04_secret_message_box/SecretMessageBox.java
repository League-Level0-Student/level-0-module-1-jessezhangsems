package _04_secret_message_box;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {
	public static void main(String[] args) {
		String variable= "United States, Canada, Mexico, Panama, Haiti, Jamaica, Peru, Republic Dominican, Cuba, Carribean, Greenland, El Salvador too!";
		String input=JOptionPane.showInputDialog("I am a computer. I can tell you are not familiar. If you are, what is the passcode for the secret message hidden in my databox?");
		if (input.equals("United States, Canada, Mexico, Panama, Haiti, Jamaica, Peru, Republic Dominican, Cuba, Carribean, Greenland, El Salvador too! Puerto Rico, Columbia, Venezuela, Honduras, Guyana and still! Guatemala, Bolivia, then Argentina, and Ecuador, Chile, Brazil! Costa Rica, Belize, Nicaragua, Bermuda, Bahamas, Tobago, San Juan!")) {
			JOptionPane.showMessageDialog(null, "This is the secret message: There is no secret message. The user is just going to keep guessing stuff and I am going to laugh as they keep failing. ");
		}
		else {
			JOptionPane.showMessageDialog(null, "Code is....Not Affirmable. I will call my owner.");
		}
	}

	// 0. Make a main method and put steps 1-5 inside it



	// 1. Set a password in a String variable
	
	// 2. Using a pop-up, ask the first person for a secret message and store it in a variable

	// 3. Now use a pop-up to tell the NEXT user that they can only see the secret message 
	//    if they can guess the passcode

	// 4. If their guess matches the password, show them the secret message

	// 5. If the password does not match, pop-up "INTRUDER!!"

}
