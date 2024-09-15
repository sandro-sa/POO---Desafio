package edu.dio.poo.desafio;

import edu.dio.poo.desafio.browser.Browser;
import edu.dio.poo.desafio.ipode.Ipode;
import edu.dio.poo.desafio.phone.mensagem.Phone;

/**
 *
 * @author SandroAmânciodeSá
 */
public class Iphone implements Ipode, Phone,Browser{

    @Override
    public void tocar() {
        System.out.println("Tocando musica .....");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica .....");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionado musica .....");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando telefone ....."); 
    }

    @Override
    public void atender() {
       System.out.println("Atendendo telefone .....");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no telefone .....");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina no navegador .....");
    }

    @Override
    public void adicionarNovaAba() {
       System.out.println("Adicionado nova aba no navegador .....");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina no navegador .....");
    }
    
  
}
