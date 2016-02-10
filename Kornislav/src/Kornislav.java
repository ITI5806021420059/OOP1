import java.util.Scanner;
public class Kornislav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1,value2,value3,value4,temp;
		Scanner scan = new Scanner(System.in);
		do{
		System.out.print("Input Value 1 : ");
		value1=scan.nextInt();
		}while(value1<1 || value1>100);
		do{
		System.out.print("Input Value 2 : ");
		value2=scan.nextInt();
		}while(value2<1 || value2>100);
		do{
		System.out.print("Input Value 3 : ");
		value3=scan.nextInt();
		}while(value3<1 || value3>100);
		do{
		System.out.print("Input Value 4 : ");
		value4=scan.nextInt();
		}while(value4<1 || value4>100);
		if(value1>value2){
			temp=value1;
			value1=value2;
			value2=temp;
		}
		if(value1>value3){
			temp=value1;
			value1=value3;
			value3=temp;
		}
		if(value1>value4){
			temp=value1;
			value1=value4;
			value4=temp;
		}
		if(value2>value3){
			temp=value2;
			value2=value3;
			value3=temp;
		}
		if(value2>value4){
			temp=value2;
			value2=value4;
			value4=temp;
		}
		if(value3>value4){
			temp=value3;
			value3=value4;
			value4=temp;
		}
		System.out.print("\nRectangle Area = : "+value3*value1);
	}

}
