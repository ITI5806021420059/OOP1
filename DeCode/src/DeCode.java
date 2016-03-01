import java.util.Scanner;
public class DeCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String code;
		char c;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter text : ");
		code = scan.nextLine();
		code = code.toUpperCase();
		for(int i = code.length()-1;i >= 0;i--){
			c = code.charAt(i);
			if(c == 'E'){ c = 'R'; }
			else if(c == 'R'){ c = 'W'; }
			else if(c == 'W'){ c = 'E';}
			System.out.print(c);
		}
	}

}

