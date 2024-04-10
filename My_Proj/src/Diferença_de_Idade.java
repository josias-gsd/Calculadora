import java.util.Scanner;

public class Diferença_de_Idade {

	public static void main(String args[]) {
		
		Scanner in=new Scanner(System.in);
		System.out.print("Qual a sua idade:");
		int a=in.nextInt();
		System.out.print("Qual a idade da sua Mãe:");
		int b=in.nextInt();
		int c=b-a;
		
		System.out.println("A sua idade é de:"+a);
		System.out.println("A idade da sua Mãe é de:"+b);
		System.out.println("Minha mãe é "+c+" mais velha do que eu.");
		
		
	}

}
