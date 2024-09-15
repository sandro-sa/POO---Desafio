package edu.dio.poo.desafio.phone.mensagem;

import edu.dio.poo.desafio.pessoa.Pessoa;
import edu.dio.poo.desafio.phone.TipoDeMensagem;
import edu.dio.poo.desafio.phone.contato.Contato;
import edu.dio.poo.desafio.phone.contato.TipoTelefone;
import java.util.Date;

/**
 *
 * @author SandroAmânciodeSá
 */
public class Mensagem extends Contato{
    
    private TipoDeMensagem tipoDeMendagem;
    private String mensagem;
    private Date data;
    private boolean status;

    public Mensagem(TipoTelefone telefone, String nome, String sobreNome) {
        super(telefone, nome, sobreNome);
    }
  
    public TipoDeMensagem getTipoDeMendagem() {
        return tipoDeMendagem;
    }

    public void setTipoDeMendagem(TipoDeMensagem tipoDeMendagem) {
        this.tipoDeMendagem = tipoDeMendagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
   
}
