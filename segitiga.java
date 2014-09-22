import java.io.*;
import java.util.Scanner;

public class segitiga{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int a,t,l;
		System.out.print(" | input alas     : ");
		a = in.nextInt();
		System.out.print(" | input tinggi   : ");
		t = in.nextInt();
		l = (a*t)/2;
		System.out.print(" | Luas : "+l);
	}
}