import java.io.*;
import java.util.Scanner;

public class persegiPanjang{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int a,b,j;
		System.out.print(" | input panjang : ");
		a = in.nextInt();
		System.out.print(" | input lebar   : ");
		b = in.nextInt();
		j = a*b;
		System.out.print(" | Luas : "+j);
	}
}