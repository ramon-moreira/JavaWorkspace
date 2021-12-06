import java.util.Scanner;

public class CalculoSalario {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double salario, imposto;
	System.out.println("Por favor, informe seu sal�rio:");
	salario = entrada.nextDouble();
	if (salario < 1000) {
		System.out.println("Seu sal�rio esse m�s foi de:" + salario);
		System.out.println("Voc� n�o precisa pagar impostos, visto que seu sal�rio foi menor que 1000");
}
	else if (salario >= 1000 && salario < 2500) {
		System.out.println("Esse m�s, voc� recebeu:" + salario);
		imposto = 12.5 * salario / 100;
		System.out.println("Ent�o, voc� ter� que pagar um pequeno imposto de:" + imposto);
}
	else if (salario >= 2500 && salario < 5000) {
		System.out.println("Esse m�s voc� recebeu:" + salario);
		imposto = 25 * salario / 100;
		System.out.println("VOc� ent�o dever� pagar imposto igual a:" + imposto);
}
	else {
		imposto = salario - 1300;
		System.out.println("Esse m�s voc� dever� pagar o valor de:" + imposto);
}
}
}
