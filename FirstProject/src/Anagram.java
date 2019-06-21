import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Write a text:");
		
		while(scan.hasNext()) {
		String finText="";
		String buf=scan.next();	
		for(int i=buf.length()-1;i>=0;i--){
			char ch =buf.charAt(i);
			if(Character.isLetter(ch)) finText+=ch;
		}
		for(int i=0;i<buf.length();i++){
			String str=""; 
			char ch =buf.charAt(i);
			if(!Character.isLetter(ch)) {
				str=finText.substring(0,i); 
				str+=ch; 
				str+=finText.substring(i); 
				finText=str; 
			}
		}
		System.out.print(finText+" ");
		}
		
		
	}
}
