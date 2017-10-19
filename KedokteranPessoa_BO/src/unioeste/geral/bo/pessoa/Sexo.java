package unioeste.geral.bo.pessoa;

import java.io.Serializable;

public class Sexo implements Serializable {
        int idSexo;
        private String nomeSexo;
	private char siglaSexo;

    public int getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(int idSexo) {
        this.idSexo = idSexo;
    }

    public String getNomeSexo() {
        return nomeSexo;
    }

    public void setNomeSexo(String nomeSexo) {
        this.nomeSexo = nomeSexo;
    }

    public char getSiglaSexo() {
        return siglaSexo;
    }

    public void setSiglaSexo(char siglaSexo) {
        this.siglaSexo = siglaSexo;
    }
        
}
