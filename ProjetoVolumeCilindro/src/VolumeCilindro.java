import java.util.Scanner;

public class VolumeCilindro {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double pi = 3.14, altura, raio, resultado;
	System.out.println("Por favor, digite o valor do raio do cilindro:");
	raio = entrada.nextDouble();
	System.out.println("Por favor, digite o valor da altura do cilindro:");
	altura = entrada.nextDouble();
	System.out.println("O valor do raio do cilindro é:" + raio);
	System.out.println("O valor da altura do cilindro é:" + altura);
	resultado = pi * raio * raio * altura;
	System.out.println("O volume do cilindro é:" + resultado);
}
}
