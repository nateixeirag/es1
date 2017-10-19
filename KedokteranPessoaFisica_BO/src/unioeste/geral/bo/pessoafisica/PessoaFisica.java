package unioeste.geral.bo.pessoafisica;

import java.io.Serializable;
import unioeste.geral.bo.pessoa.CPF;
import unioeste.geral.bo.pessoa.NomePessoa;
import unioeste.geral.bo.pessoa.Pessoa;
import unioeste.geral.bo.pessoa.Sexo;

public abstract class PessoaFisica extends Pessoa implements Serializable {
	private  transient Sexo sexo;
	private CPF cPF;
	private NomePessoa nomePessoa;
}
