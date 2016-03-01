import java.util.Scanner;
public class EnCode {

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
			if(c == 'R'){ c = 'E'; }
			else if(c == 'W'){ c = 'R'; }
			else if(c == 'E'){ c = 'W';}
			System.out.print(c);
		}
	}

}
