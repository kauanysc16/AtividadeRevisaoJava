package AtividadeRevisao1;

import java.util.Scanner;

public class ExemplosRevisao {
    Scanner sc = new Scanner(System.in);
    // Criar métodos da Classe

   public void exemplo1(){
    //Criar um projeto para ler 2 notas e a Frequência
    //1. ler a primeira nota
    System.out.println("Informe a primeira nota do aluno");
    int nota1 = sc.nextInt();
    //2. ler a segunda nota
    System.out.println("Informe a segunda nota do aluno");
    int nota2 = sc.nextInt();
    //3. calcular a média das notas
    double media = (nota1+nota2)/2;
    //4. mostrar a média calculada
    System.out.println("A média do Aluno é" + media);
    //5. informar total de aulas
    System.out.println("Professor o total de aulas dadas");
    int aulasDadas = sc.nextInt();
    //Informar quant. de faltas do aluno
    System.out.println("Professsor, informe o n° dde faltas do aluno");
    int nfaltas = sc.nextInt();
    //7. calcular a % de frequencia
    double frequencia = ((aulasDadas-nfaltas)/aulasDadas);
    frequencia *= 100; //transformanfo em %porcentagem
    //8. mostrar a porcentagem de frequencia
    System.out.println("O aluno teve "+ frequencia+"%");
    //9. se (media>=50 e frequencia>=75)
    if (media>=50 && frequencia>=75){
        System.out.println("Aluno Aprovado");
        //se a media for menor q 50 mas a frequencia for maior q 75
    } else if (media<50 && frequencia>=75){
        System.out.println("Aluno de Recuperação");
    }
    else {
        System.out.println("Aluno Reprovado");
    }
    }
}