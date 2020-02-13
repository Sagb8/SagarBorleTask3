import java.util.Scanner;
class Data
{
	static int a,b,res;
	
	public static void getdata()
	{	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First No:");
		a=s.nextInt();
		System.out.println("Enter Second No:");
		b=s.nextInt();
	}
}

public class Calculator  {
	public static void main(String[] args) {
		Data d=new Data();
		int ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("\n1.Addition\n2.Substraction\n3.Division\n4.Multiplication\n5.Exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				d.getdata();
				d.res=d.a+d.b;
				System.out.println("Answer:"+d.res);
				break;
			case 2:
				d.getdata();
				d.res=d.a-d.b;
				System.out.println("Answer:"+d.res);
				break;
			case 3:
				d.getdata();
				d.res=d.a/d.b;
				System.out.println("Answer:"+d.res);
				break;
			case 4:
				d.getdata();
				d.res=d.a*d.b;
				System.out.println("Answer:"+d.res);
				break;
			case 5:
				break;
			default:
				System.out.println("Invalid");
				break;
			
			}
			
			
		}while(ch!=5);

	}

}
