package Arrays;

import java.util.Scanner;

public class ex_1 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		
		int A[]=new int[5];
		int B[]=new int[A.length];
		for(int i=0;i<A.length;i++) {
			System.out.println("Entre com o valor da posição: "+i);
			A[i]=in.nextInt();
			B[i]=A[i];
		}
		for(int i=0;i<A.length;i++)
		System.out.println("Vector A,posição "+i+":"+A[i]);
		
	}
	

}
