import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Digite a media: ");
        double notaMinima = scr.nextDouble();

        System.out.print("Digite a nota da AC1: ");
        double ac1 = scr.nextDouble();
        System.out.print("Digite a nota da AC2: ");
        double ac2 = scr.nextDouble();
        System.out.print("Digite a nota da AF: ");
        double af = scr.nextDouble();

        verificarNota("AC1", ac1, notaMinima);
        verificarNota("AC2", ac2, notaMinima);
        verificarNota("AF", af, notaMinima);

        double media = (ac1 + ac2 + af) / 3;
        System.out.printf("\nMedia final: %.2f\n", media);

        if (media >= notaMinima) {
            System.out.println("Resultado: Aprovado!");
        } else {
            System.out.println("Resultado: Reprovado!");
        }

    }

    public static void verificarNota(String nomeNota, double nota, double notaMinima) {
        System.out.printf("%s = %.1f, ", nomeNota, nota);
        if (nota >= notaMinima) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
