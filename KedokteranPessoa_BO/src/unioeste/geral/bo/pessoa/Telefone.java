package unioeste.geral.bo.pessoa;

import java.io.Serializable;

public class Telefone implements Serializable {
        
        public int numeroTelefone;
	public TipoTelefone tipoTelefone;
        int idusuario;
        int idtelefone;
        int iddd;

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public TipoTelefone getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(TipoTelefone tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdtelefone() {
        return idtelefone;
    }

    public void setIdtelefone(int idtelefone) {
        this.idtelefone = idtelefone;
    }

    public int getIddd() {
        return iddd;
    }

    public void setIddd(int iddd) {
        this.iddd = iddd;
    }
        
}
