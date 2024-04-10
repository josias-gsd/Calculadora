import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Por favor, informe qual a tabuada que deseja visualizar: ");
		int A=in.nextInt();
		for(int i=0;i<13;i++) {
			System.out.println(A+"x"+i+"="+A*i);
		}
	}

}
