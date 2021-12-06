import java.util.Scanner;

public class CalculoSalario {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double salario, imposto;
	System.out.println("Por favor, informe seu salário:");
	salario = entrada.nextDouble();
	if (salario < 1000) {
		System.out.println("Seu salário esse mês foi de:" + salario);
		System.out.println("Você não precisa pagar impostos, visto que seu salário foi menor que 1000");
}
	else if (salario >= 1000 && salario < 2500) {
		System.out.println("Esse mês, você recebeu:" + salario);
		imposto = 12.5 * salario / 100;
		System.out.println("Então, você terá que pagar um pequeno imposto de:" + imposto);
}
	else if (salario >= 2500 && salario < 5000) {
		System.out.println("Esse mês você recebeu:" + salario);
		imposto = 25 * salario / 100;
		System.out.println("VOcê então deverá pagar imposto igual a:" + imposto);
}
	else {
		imposto = salario - 1300;
		System.out.println("Esse mês você deverá pagar o valor de:" + imposto);
}
}
}
