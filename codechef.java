import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   char ch = sc.next().charAt(0);
	   switch (ch) {
	       case 'a':
	       case 'e':
	       case 'i':
	       case 'o':
	       case 'u':
	           System.out.println(ch + " is a vowel");
	           break;
	       default:
	           if (ch >= 'a' && ch <= 'z')
	               System.out.println(ch + " is a consonant");
	   }
	}
}




