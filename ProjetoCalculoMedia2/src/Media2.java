import java.util.Scanner;

public class Media2 {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double nota1, nota2, media;
	System.out.println("Por favor, digite a nota1:");
	nota1 = teclado.nextDouble();
	System.out.println("Por favor, digite a nota2:");
	nota2 = teclado.nextDouble();
	media = (nota1 + nota2)/2;
	System.out.println("Sua nota final foi:" + media);
	if (media >=8 && media <= 10 ) {
		System.out.println("Aprovado com louvor! Parab�ns!");
}
	else if (media >= 6 && media <8 ) {
		System.out.println("Voc� foi aprovado.");
}
	else if (media >=5 && media <6) {
		System.out.println("Sinto muito, mas voc� ficou de recupera��o.");
}
	else {
		System.out.println("�, n�o foi dessa vez... Voc� foi reprovado.");
}
}
}
