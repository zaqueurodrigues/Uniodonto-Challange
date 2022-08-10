package zaqueurodrigues.main;

import zaqueurodrigues.configuracao.Config;
import zaqueurodrigues.entities.Empresa;
import zaqueurodrigues.entities.Funcionario;
import zaqueurodrigues.entities.Setor;

public class Principal {

	public static void main(String[] args) {

		Config.cargaDadosInicial();
		
		Empresa uniodonto = Empresa.getInstance();
		
		Setor setor = uniodonto.getSetores().get(4);
		
		String resultado = Funcionario.listaUsuariosPorSetor(setor);
		
		int numeroDeFuncionarios = setor.getTotalFuncionarios();
		
		System.out.println("Numero de Funcionarios do Setor " +uniodonto.getSetores().get(4).getDescricao() + " = " +numeroDeFuncionarios + "\n");
		
		System.out.println(resultado);
		
	}

}
