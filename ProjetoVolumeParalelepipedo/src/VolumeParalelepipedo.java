import java.util.Scanner;

public class VolumeParalelepipedo {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double altura, largura, profundidade, resultado;
	System.out.println("Por favor, digite o valor da altura do paralelepípedo:");
	altura = entrada.nextDouble();
	System.out.println("Por favor, digite o valor da largura do paralelepípedo:");
	largura = entrada.nextDouble();
	System.out.println("Por favor, digite o valor da profundidade do paralelepípedo:");
	profundidade = entrada.nextDouble();
	System.out.println("O valor da altura do paralelepípedo é:" + altura);
	System.out.println("O valor da largura do paralelepípedo é:" + largura);
	System.out.println("O valor da profundidade do paralelepípedo é:" + profundidade);
	resultado = altura * largura * profundidade;
	System.out.println("O volume do paralelepípedo é:" + resultado);
	
}
}
