package fundamentos.oo.relacionamentoNParaN;

public class AlunoTeste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Bruno");
		Aluno a2 = new Aluno("Carlos");
		Aluno a3 = new Aluno("Ana");
		
		Curso c1 = new Curso("Java");
		Curso c2 = new Curso("Python");
		Curso c3 = new Curso("C#");
		
		a1.adicionarCurso(c2);
		a3.adicionarCurso(c3);
		
		c1.adicionarAluno(a1);
		c1.adicionarAluno(a2);
		
		for(Aluno aluno: c1.alunos) {
			System.out.println(aluno.nome);
		}
		
		System.out.println("-".repeat(30));
		for(Curso cursos: a1.cursos) {
			System.out.println(cursos.nome);
		}
	}
}
