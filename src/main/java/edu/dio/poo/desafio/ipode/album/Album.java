package edu.dio.poo.desafio.ipode.album;

import java.util.List;
import javax.xml.crypto.Data;

/**
 *
 * @author SandroAmânciodeSá
 */
public class Album {
    
    private String nomeAlbum;
    private Data dataGravacao;
    private String gravador;
    private List<Musica> musicas;
    
    public Album(String nomeAlbum, Data dataGravacao, String gravador, List<Musica> musicas) {
        this.nomeAlbum = nomeAlbum;
        this.dataGravacao = dataGravacao;
        this.gravador = gravador;
        this.musicas = musicas;
    }

    public Album(String nomeAlbum, Data dataGravacao, String gravador) {
        this.nomeAlbum = nomeAlbum;
        this.dataGravacao = dataGravacao;
        this.gravador = gravador;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public Data getDataGravacao() {
        return dataGravacao;
    }

    public void setDataGravacao(Data dataGravacao) {
        this.dataGravacao = dataGravacao;
    }

    public String getGravador() {
        return gravador;
    }

    public void setGravador(String gravador) {
        this.gravador = gravador;
    }
    
    
}
