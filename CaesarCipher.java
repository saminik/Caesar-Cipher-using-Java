import java.util.Scanner;

public class CaesarCipher{
	public static final String ALPHABET="abcdefghijklmnopqrstuvwxyz";
	private String encryption(String pText,int s)
	{
		int n=0;
		String cText="";
		pText=pText.toLowerCase();
		for(int i =0;i<pText.length();i++)
		{
			int pos=ALPHABET.indexOf(pText.charAt(i));
			int part1=pos+s;
			int part2=(part1)%26;
			cText+=ALPHABET.charAt(part2);
		}
		return cText;
		
	}
	private String decryption(String cText,int s)
	{
		String ptext="";
		cText=cText.toLowerCase();
		for(int i =0;i<cText.length();i++)
		{
			int pos=ALPHABET.indexOf(cText.charAt(i));
			int part1=pos-s;
			int part2=(part1)%26;
			if(part2<0)
			{
				part2=ALPHABET.length()+part2;
			}
			ptext+=ALPHABET.charAt(part2);
		}
		
		return ptext;
	}
public static void main(String[] args) {
	
	CaesarCipher ver2=new CaesarCipher();
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	String plainText=null;
	System.out.println("Enter the shift bit");
	int n =sc.nextInt();
	System.out.println("Enter the plainText");
	plainText=sc1.nextLine();
	String cipherText="";
	cipherText=ver2.encryption(plainText,n);
	System.out.println("Cipher");
	System.out.println(cipherText);
	String gText="";
	gText=ver2.decryption(cipherText, n);
	System.out.println("The Decrypted Message is");
	System.out.println(gText);
	
}
}