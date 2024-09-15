package edu.dio.poo.desafio.phone.contato;

import edu.dio.poo.desafio.pessoa.Pessoa;

/**
 *
 * @author SandroAmânciodeSá
 */
public class Contato extends Pessoa{
    
    private TipoTelefone telefone;

    public Contato(TipoTelefone telefone, String nome, String sobreNome) {
        super(nome, sobreNome);
        this.telefone = telefone;
    }

    public TipoTelefone getTelefone() {
        return telefone;
    }

    public void setTelefone(TipoTelefone telefone) {
        this.telefone = telefone;
    }
    
}
