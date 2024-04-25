import java.util.Scanner;

public class Calculadora_main {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		Calculadora_POO calc=new Calculadora_POO();
		
		System.out.print("Digite o primeiro valor: ");
		int num1=in.nextInt();
		System.out.print("Digite o segundo valor: ");
		int num2=in.nextInt();
		calc.menu();		
		int comand=in.nextInt();
		System.out.println("O resultado é:");
	    calc.getResultado(num1, num2, comand);
		
		//calculadora
		
		
		
		
		
		
		
		
		
//		Calculadora_POO num2=new Calculadora_POO();
//		Calculadora_POO resp=new Calculadora_POO();
//		
//		String op="s";
//		while(op.equals("s")||op.equals("S")) {
//		System.out.print("Digite o primeiro valor: ");
//		num1.setValor(in.nextInt());
//		System.out.print("Digite o segundo valor: ");
//		num2.setValor(in.nextInt());
//		
//		resp.setValor(num1.getValor()+num2.getValor());
//		System.out.println("O resultado é de:"+resp.getValor());
//		System.out.println("Deseja fazer outra operação:");
//		op=in.next();
//		
//		}
		
		
	}

}
