import java.util.Scanner;

public class Consumo {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	Double km, litros, media;
	System.out.println("Por favor, digite a dist�ncia em quil�metros percorrido:");
	km = teclado.nextDouble();
	System.out.println("Por favor, digite a quantidade de litros de gazolina usado em todo o percurso:");
	litros = teclado.nextDouble();
	media = km / litros;
	System.out.println("Voc� consumiu em m�dia," + " " + media + " " + "Litros de gasolina em seu percurso");
}
}
