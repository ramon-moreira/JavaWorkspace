import java.util.Scanner;

public class Media {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double nota1, nota2, media;
	System.out.println("Por favor, digite a nota1:");
	nota1 = entrada.nextDouble();
	System.out.println("Por favor, digite a nota2:");
	nota2 = entrada.nextDouble();
	media = (nota1 + nota2)/2;
	System.out.println("Sua nota final foi:" + media);
	if (media >= 6) {
		System.out.println("Parab�ns, voc� foi aprovado!");
}
else {
		System.out.println("�, n�o deu. Nos vemos ent�o novamente, ano que vem.");
}
}
}
