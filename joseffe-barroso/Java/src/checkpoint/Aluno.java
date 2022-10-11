package checkpoint;

public class Aluno {
	private int id;
	private String rm;
	private String nome;
	private Curso curso;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRm() {
		return rm;
	}

	public void setRm(String rm) {
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Aluno () {
		
	}

	public Aluno (int id, String rm, String nome, Curso curso) {
		this.id = id;
		this.rm = rm;
		this.nome = nome;
		this.curso = curso;
	}
}
