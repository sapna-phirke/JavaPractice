package javapracticepackage;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("input1");
Scanner scan= new Scanner(System.in);
double num1=scan.nextDouble();
System.out.println("input2");
double num2=scan.nextDouble();
double num3=num1+num2;
System.out.println("the answer:"+ num3);
//2
int n=4;
if(n>=4) {
	System.out.println("HI");
	
}
else if(n==4) {
	System.out.println("HiiI");}
     vx();//calling method in main 
 	System.out.println("b");	

}//main method end here
	//3
	public static void vx(){//u hv to cl this method
		for(int i=0;i<5;i++)
			System.out.println(i);
             kx();
}
	public static void kx() 
	{
	System.out.println("x");	
	}
	}


