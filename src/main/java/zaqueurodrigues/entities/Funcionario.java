package zaqueurodrigues.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Funcionario {
	
	private String nome;
	private LocalDate nascimento;
	private Integer matricula;
	private Setor setor;
	
	List<Dependente> dependentes;
	
	public Funcionario(String nome, LocalDate nascimento, Integer matricula, Setor setor) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.matricula = matricula;
		this.setor = setor;
		this.dependentes = new ArrayList<>();
	}
	
	public static String listaUsuariosPorSetor(Setor setor) {
		return setor.getFuncionarios().stream()
				.sorted((a, b) -> a.getNome().compareTo(b.getNome()))
				.map(Funcionario::toString).collect(Collectors.joining("\n\n"));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public List<Dependente> getDependentes() {
		return dependentes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", nascimento=" + nascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyy")) + ", matricula=" + matricula + ", setor="
				+ setor + ", dependentes=" + dependentes + "]";
	}
	
}
