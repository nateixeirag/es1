package unioeste.geral.bo.pessoa;

import java.io.Serializable;

public class Email implements Serializable {
	
    int idemail;
    private String enderecoEmail;

    public int getIdemail() {
        return idemail;
    }

    public void setIdemail(int idemail) {
        this.idemail = idemail;
    }

    public String getEnderecoEmail() {
        return enderecoEmail;
    }

    public void setEnderecoEmail(String enderecoEmail) {
        this.enderecoEmail = enderecoEmail;
    }
    
}
