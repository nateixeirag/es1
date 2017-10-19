package unioeste.geral.bo.pessoajuridica;

import java.io.Serializable;
import unioeste.geral.bo.pessoa.CNPJ;
import unioeste.geral.bo.pessoa.Pessoa;

public abstract class PessoaJuridica extends Pessoa implements Serializable {

        private String nomeFantasia;
	private String nomeRazaoSocial;
	private CNPJ cNPJ;
}
