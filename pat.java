package pat;
import java.util.*;

public class pat {

	public static void main(String[] args) {
		
			Scanner scan=new Scanner(System.in);
			
			
			System.out.println("Enter the String to reverse");
			String str=scan.nextLine();
			char ch;
			String rev = "";
			for(int i=0;i<str.length();i++) {
				ch=str.charAt(i);
				rev=ch+rev;
		}
			System.out.println("reversed string is "+rev);
			
			int i=0;
			int j=rev.length()-1;
			while(i<j)
			{
				if(rev.charAt(i)==rev.charAt(j))
				{
					System.out.println("String is palindrome");
					System.exit(0);
				}
				else
					System.out.println("String is not palindrome");
				System.exit(0);
			}
	}

}
