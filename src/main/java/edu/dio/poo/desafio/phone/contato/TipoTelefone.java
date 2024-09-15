
package edu.dio.poo.desafio.phone.contato;

/**
 *
 * @author SandroAmânciodeSá
 */
public class TipoTelefone {
    
    private String tipo;
    private int numero;

    public TipoTelefone(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
