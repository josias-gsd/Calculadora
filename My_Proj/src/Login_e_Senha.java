import java.util.Scanner;

public class Login_e_Senha {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Qual o seu nome:");
		String a=in.next();
		System.out.print("Digite a sua Senha:");
		int b=in.nextInt();
		if(a=="josias" && b==9960253)  {
			System.out.println("Login feito com sucesso!");
		}else {
			System.out.println("Login Inválido");
		}
		
		

	}

}
