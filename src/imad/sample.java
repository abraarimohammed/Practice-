//Documentation
package imad;

import java.io.Console;
import java.lang.*;
public class sample {
	
//Create a method 
	public int mutltiply(int a, int b, int c){
	int result = a * b *c ;
	return result;
		}
	
public static void main (String[] args){
// this is a sample program 
int a= 10, b, c; // variable declaration
b = 20; c= 30 ; // initializing 

final int money = 100;
System.out.println("Addition of a, b is +(a+b)");
System.out.println("money");
// condtion Block
if (a>b){
	System.out.println("A is a Big Number");
}
else 
{
System.out.println("B is a Big Number");
}

//Loop block 
for (int d=1; d <= 10; d++){
}
//create object and access methods 
sample obj = new sample();
int x = obj.mutltiply(10, 25, 50);
System.out.println(x);



}
	}


