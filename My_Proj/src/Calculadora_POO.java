
public class Calculadora_POO {
	private int valor;
	
	public static final int  SOMA=1;
	public static final int  SUB=2;
	public static final int  MULT=3;
	public static final int  DIV=4;
	
	public Calculadora_POO() {
		this.valor=0;
	}
	
	public void setValor(int val) {
		this.valor=val;
	}
	
	public int getValor() {
		return valor;
	}
	//git
	public void menu() {
		System.out.println("Digite um operador {+,*,-,/}: ");
		System.out.println(SOMA+"-SOMA");
		System.out.println(SUB+"-SUBTRAÇÃO");
		System.out.println(MULT+"-MULTIPLICAÇÃO");
		System.out.println(DIV+"-DIVSÃO");
		
	}
	public void getResultado(int valor1,int valor2, int comando) {
		switch(comando) {
		
		case SOMA:System.out.println(aplicarSoma(valor1,valor2)); 
		break;
		
		case SUB:System.out.println(aplicarSub(valor1,valor2));
		break;
		
		case MULT:System.out.println(aplicarMult(valor1,valor2));
		break;
		
		case DIV:System.out.println(aplicarDiv(valor1,valor2));
		break;
		}
		
	}
	public int aplicarSoma(int valor1,int valor2) {
		return valor1+valor2;
	}
	public int aplicarSub(int valor1,int valor2) {
		return valor1-valor2;
	}
	public int aplicarMult(int valor1,int valor2) {
		return valor1*valor2;
	}
	public int aplicarDiv(int valor1,int valor2) {
		return valor1/valor2;
	}

}
