import java.util.Scanner;

public class Pessoa {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int idade;
	System.out.println("Por favor, digite sua idade:");
	idade = entrada.nextInt();
	if (idade >= 18 && idade < 65) {
		System.out.println("Você é maior de idade!");
}
	else if (idade < 18) {
		System.out.println("Oh, você ainda é menor de idade");
}
	else {
		System.out.println("Oh, você é um "senhor);
}
}
}
