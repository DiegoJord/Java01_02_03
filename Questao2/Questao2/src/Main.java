import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite suas 3 notas: ");

        double nota1, nota2, nota3;

        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();

        aluno.somar(nota1, nota2, nota3);
        if (aluno.resultado >=7) {
            System.out.println("Você foi aprovado por média");
        } else if (aluno.resultado >= 4) {
            System.out.println("Você está na final, estude!");
        } else {
            System.out.println("Você foi reprovado por média");
        }


    }

}