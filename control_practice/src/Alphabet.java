import java.util.*;

class Alphabet
{
	public static void main(String args[]) {//main method to print whether the the entered character is consonant or vowel
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the character");
		String a=in.next().toLowerCase();
		boolean uppercase = a.charAt(0) >= 65 && a.charAt(0) <= 90;
        boolean lowercase = a.charAt(0) >= 97 && a.charAt(0) <= 122;
        boolean vowels = a.equals("a") || a.equals("e") || a.equals("i")
                || a.equals("o") || a.equals("u");

        if (a.length() > 1)
        {
            System.out.println("Error!.you have entered more then one character.");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Error!You have entered a special character or a digit Enter uppercase or lowercase letter.");
        }
        else if (vowels)
        {
            System.out.println("Entered letter is Vowel");
        }
        else
        {
            System.out.println("Entered letter is Consonant");
        }

	}
}