import java.util.Scanner;

public class EntendendoLoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/
		int idade;
		double media =0;
		int quantidadeAlunos = 0;
		Scanner leitor = new Scanner(System.in);
		
		
		while(quantidadeAlunos <5) {
			System.out.println("Informe a idade do " + (quantidadeAlunos + 1)+"� aluno");
			idade = leitor.nextInt();
			media = media + idade;
			quantidadeAlunos = quantidadeAlunos + 1;
			//quantidadeAlunos += 1;
			//quantidadeAlunos ++; "++" = somar 1
		}
		
		media = media/5.0;
		System.out.println("A m�dia das idades � " + media);
	}


	}

