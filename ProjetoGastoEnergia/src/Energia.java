import java.util.Scanner;

public class Energia {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double salario, unidade, reais, desconto, consumidos;
	System.out.println("Por favor, informe o sal�rio m�nimo:");
	salario = entrada.nextDouble();
	System.out.println("Por favor, informe quantos kw foram consumidos");
	consumidos = entrada.nextDouble();
	unidade = salario / 700;
	reais = unidade * consumidos;
	desconto = reais * 0.9;
	System.out.println("O valor de kada kw �:" + unidade);
	System.out.println("O valor a ser pago em reais � de:" + reais);
	System.out.println("O total a pagar com desconto � de:" + desconto);
}
}
