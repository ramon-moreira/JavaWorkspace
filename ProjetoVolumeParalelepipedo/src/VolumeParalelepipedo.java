import java.util.Scanner;

public class VolumeParalelepipedo {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double altura, largura, profundidade, resultado;
	System.out.println("Por favor, digite o valor da altura do paralelep�pedo:");
	altura = entrada.nextDouble();
	System.out.println("Por favor, digite o valor da largura do paralelep�pedo:");
	largura = entrada.nextDouble();
	System.out.println("Por favor, digite o valor da profundidade do paralelep�pedo:");
	profundidade = entrada.nextDouble();
	System.out.println("O valor da altura do paralelep�pedo �:" + altura);
	System.out.println("O valor da largura do paralelep�pedo �:" + largura);
	System.out.println("O valor da profundidade do paralelep�pedo �:" + profundidade);
	resultado = altura * largura * profundidade;
	System.out.println("O volume do paralelep�pedo �:" + resultado);
	
}
}
