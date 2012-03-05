import javax.swing.*;
import java.util.*;
import java.io.*;

public class NomadenInstaller{

	public static void main( String[] args ){
		
		//	Välkomna användaren:
		JOptionPane.showMessageDialog(null, "Välkommen till konfigurationsprogrammet för Nomaden!");
		
		//	Fråga efter användarnamn och lösenord:
		String inputUsername = JOptionPane.showInputDialog("Skriv ditt Chalmers CID-användarnamn:");
		String inputPassword = JOptionPane.showInputDialog("Skriv ditt Chalmers CID-lösenord:");
		
		//	URL-encoda användarnamn och lösenord:
		String fixedUsername = urlEscapeReplace(inputUsername);
		String fixedPassword = urlEscapeReplace(inputPassword);
		
		try {
			
			String userHome = System.getProperty("user.home");
			
			//	Skapa filen .nomad-credentials 
			PrintWriter out = new PrintWriter( new BufferedWriter( new FileWriter(userHome + File.separator + ".nomad-credentials.txt") ) );
			
			//	Skriv användarnamn och lösenord till filen:
			out.print(fixedUsername);
			out.println();
			out.print(fixedPassword);
			
			
			//	Stäng filen:
			out.close();
			
			//	Säg hejdå. =)
			JOptionPane.showMessageDialog(null, "Nomaden är nu konfigurerad!\nTesta om det fungerar. I så fall kan du ta bort NomadenInstaller.jar-filen från skrivbordet.\nI annat fall, kör den igen.\nLycka till och ha ett bra liv med Nomaden!");
			
		} catch (IOException e) {
			
			JOptionPane.showMessageDialog(null, "Fel uppstod vid filhanteringen:\n\n" + e.toString() );
			
		}
		
	}

	public static String urlEscapeReplace( String text ){
		
    	String newText = text;
        
        newText = newText.replaceAll("\\%","%25");
        newText = newText.replaceAll(" ","%20");
        newText = newText.replaceAll("\\<","%3C");
        newText = newText.replaceAll("\\>","%3E");
        newText = newText.replaceAll("\\#","%23");
        newText = newText.replaceAll("\\{","%7B");
        newText = newText.replaceAll("\\}","%7D");
        newText = newText.replaceAll("\\|","%7C");
        newText = newText.replaceAll("\\^","%5E");
        newText = newText.replaceAll("\\~","%7E");
        newText = newText.replaceAll("\\[","%5B");
        newText = newText.replaceAll("\\]","%5D");
        newText = newText.replaceAll("\\`","%60");
        newText = newText.replaceAll("\\;","%3B");
        newText = newText.replaceAll("\\/","%2F");
        newText = newText.replaceAll("\\?","%3F");
        newText = newText.replaceAll("\\:","%3A");
        newText = newText.replaceAll("\\@","%40");
        newText = newText.replaceAll("\\=","%3D");
        newText = newText.replaceAll("\\&","%26");
        newText = newText.replaceAll("\\$","%24");
		
		return newText;
		
	}

}