import java.util.Scanner;

public class AreaTrapezio {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double baseMaior, baseMenor, altura, resultado;
	System.out.println("Por favor, digite o valor da base maior do trapézio:");
	baseMaior = entrada.nextDouble();
	System.out.println("Por favor, digite o valor da base menor do trapézio:");
	baseMenor = entrada.nextDouble();
	System.out.println("Por favor, digite o valor da altura do trapézio:");
	altura = entrada.nextDouble();
	System.out.println("A base maior do trapézio é:" + baseMaior);
	System.out.println("A base menor do trapézio é:" + baseMenor);
	System.out.println("A altura do trapézio é:" + altura);
	resultado = (baseMaior + baseMenor) * altura / 2;
	System.out.println("A área do trapézio é:" + resultado);
}
}
