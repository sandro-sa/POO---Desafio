package edu.dio.poo.desafio;

/**
 *
 * @author SandroAmânciodeSá
 */
public class Application {
    
    public static void main(String[] args) {
        Application app = new Application();
        
        Iphone iphone = new Iphone();
        
        System.out.println("Testando interfaces do Iphone");
        System.out.println("");
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        System.out.println("");
        System.out.println("Fim do teste de interfaces do Iphone");
        
        
    }
    
}
