package zaqueurodrigues.configuracao;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Random;

import zaqueurodrigues.entities.Dependente;
import zaqueurodrigues.entities.Empresa;
import zaqueurodrigues.entities.Funcionario;
import zaqueurodrigues.entities.Setor;

public class Config {
	
	public static void cargaDadosInicial() {
		
		Setor s1 = new Setor("001", "Recursos Humanos");
		Setor s2 = new Setor("002", "Marketing");
		Setor s3 = new Setor("003", "Financeiro");
		Setor s4 = new Setor("004", "Suporte");
		Setor s5 = new Setor("005", "Desenvolvimento");
		Setor s6 = new Setor("006", "Comercial");
		
		Dependente d1 = new Dependente("João Carvalho", geraDataNascimento());
		Dependente d2 = new Dependente("Breno Moura", geraDataNascimento());
		Dependente d3 = new Dependente("Luiz Henrique", geraDataNascimento());
		Dependente d4 = new Dependente("Pablo Nobrega", geraDataNascimento());
		Dependente d5 = new Dependente("Matheus Fernandes", geraDataNascimento());
		Dependente d6 = new Dependente("Romulo Souza", geraDataNascimento());
		Dependente d7 = new Dependente("Felipe Henrique", geraDataNascimento());
		Dependente d8 = new Dependente("Maria Eduarda", geraDataNascimento());
		Dependente d9 = new Dependente("Viviane Soares", geraDataNascimento());
		Dependente d10 = new Dependente("Denis Oliveira", geraDataNascimento());
		Dependente d11 = new Dependente("Ana Beatriz", geraDataNascimento());
		Dependente d12 = new Dependente("Milena Santos", geraDataNascimento());
		
		Funcionario f1 = new Funcionario("Ricardo Oliveira", geraDataNascimento(), 0001, s1);
		Funcionario f2 = new Funcionario("Renato Nascimento", geraDataNascimento(), 0002, s6);
		Funcionario f3 = new Funcionario("Otavio Silva", geraDataNascimento(), 0030, s4);
		Funcionario f4 = new Funcionario("Daniela Rodrigues", geraDataNascimento(), 0022, s1);
		Funcionario f5 = new Funcionario("Lucas Costa", geraDataNascimento(), 0034, s1);
		Funcionario f6 = new Funcionario("Matheus Sampaio", geraDataNascimento(), 0006, s4);
		Funcionario f7 = new Funcionario("Brenda Silva", geraDataNascimento(), 0007, s2);
		Funcionario f8 = new Funcionario("Raquel Pereira", geraDataNascimento(), 0020, s6);
		Funcionario f9 = new Funcionario("Ivan Souza", geraDataNascimento(), 0025, s2);
		Funcionario f10 = new Funcionario("Carlos Eduardo", geraDataNascimento(), 0010, s4);
		Funcionario f11 = new Funcionario("Jose Jailson", geraDataNascimento(), 0011, s3);
		Funcionario f12 = new Funcionario("Jonathas Maciel", geraDataNascimento(), 0012, s5);
		Funcionario f13 = new Funcionario("Rayane Silva", geraDataNascimento(), 0015, s5);
		Funcionario f14 = new Funcionario("Sara Barbosa", geraDataNascimento(), 0017, s3);
		Funcionario f15 = new Funcionario("Amanda Martins", geraDataNascimento(), 0015, s5);
		Funcionario f16 = new Funcionario("Daniel Vilar", geraDataNascimento(), 0016, s5);
		Funcionario f17 = new Funcionario("Moises Rabelo", geraDataNascimento(), 0047, s4);
		
		s1.getFuncionarios().addAll(Arrays.asList(f1, f4, f5));
		s2.getFuncionarios().addAll(Arrays.asList(f7, f9));
		s3.getFuncionarios().addAll(Arrays.asList(f11, f14));
		s4.getFuncionarios().addAll(Arrays.asList(f3, f6, f10, f17));
		s5.getFuncionarios().addAll(Arrays.asList(f12, f13, f15, f16));
		s6.getFuncionarios().addAll(Arrays.asList(f2, f8));
		
		f1.getDependentes().add(d1);
		f1.getDependentes().add(d2);
		f2.getDependentes().add(d3);
		f3.getDependentes().add(d4);
		f6.getDependentes().add(d5);
		f7.getDependentes().add(d6);
		f7.getDependentes().add(d7);
		f7.getDependentes().add(d8);
		f9.getDependentes().add(d9);
		f12.getDependentes().add(d10);
		f15.getDependentes().add(d11);
		f17.getDependentes().add(d12);
		
		Empresa.getInstance().getSetores().addAll(Arrays.asList(s1, s2, s3, s4, s5, s6));
		
	}

	public static LocalDate geraDataNascimento() {
		LocalDate inicio = LocalDate.of(1960, Month.JANUARY, 1);
	    long dias = ChronoUnit.DAYS.between(inicio, LocalDate.now());
	    return inicio.plusDays(new Random().nextInt((int) dias + 1));
	}
	
	
}
