package unioeste.geral.bo.pessoa;

import java.io.Serializable;

public class CPF implements Serializable{
    
    private int numeroCPF;
    private String nroCPFFormatado;
    
    public int getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(int numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    public String getNroCPFFormatado() {
        return nroCPFFormatado;
    }

    public void setNroCPFFormatado(String nroCPFFormatado) {
        this.nroCPFFormatado = nroCPFFormatado;
    }

}
