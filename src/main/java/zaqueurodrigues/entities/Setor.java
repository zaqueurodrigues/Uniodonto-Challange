package zaqueurodrigues.entities;

import java.util.ArrayList;
import java.util.List;

public class Setor {
	
	private String codigo;
	private String descricao;
	private List<Funcionario> funcionarios;
	
	public Setor(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.funcionarios = new ArrayList<>();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	public Integer getTotalFuncionarios() {
		return this.getFuncionarios().size();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Setor other = (Setor) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Setor [codigo=" + codigo + ", descricao=" + descricao + "]";
	}
	
}
