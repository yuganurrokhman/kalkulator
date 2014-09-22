import java.io.*;
import java.util.Scanner;

public class persegi{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int a,b,j;
		System.out.print(" | Panjang sisi pertama : ");
		a = in.nextInt();
		System.out.print(" | panjang sisi kedua   : ");
		b = in.nextInt();
		j = a*b;
		System.out.print(" | Luas : "+j);
	}
}