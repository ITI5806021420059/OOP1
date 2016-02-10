import java.util.Scanner;
public class Trik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l=1,c=0,r=0,tmp;
		Scanner scan = new Scanner(System.in);
		String word;
		do{
			System.out.print("Enter Character : ");
			word = scan.nextLine();
		}while(word.length() <= 0 || word.length() > 50);
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)=='A'||word.charAt(i)=='a'){
				tmp=l;
				l=c;
				c=tmp;
		}else if(word.charAt(i)=='B'||word.charAt(i)=='b'){
			tmp=c;
			c=r;
			r=tmp;
		}else{
			tmp=l;
			l=r;
			r=tmp;
			}
		}
		if(l==1){ System.out.println(l); }
		if(c==1){ System.out.println(2); }
		if(r==1){ System.out.println(3); }
	}

}
