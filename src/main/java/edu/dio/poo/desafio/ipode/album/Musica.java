package edu.dio.poo.desafio.ipode.album;

import javax.xml.crypto.Data;

/**
 *
 * @author SandroAmânciodeSá
 */
public class Musica 
{
    private String nomeMusica;
    private Album album;
    private String Genero;
    private Data duracao;
    private boolean favorita;
    private int estrela;

    public Musica(String nomeMusica, Album album, String Genero, Data duracao, boolean favorita, int estrela) {
        this.nomeMusica = nomeMusica;
        this.album = album;
        this.Genero = Genero;
        this.duracao = duracao;
        this.favorita = favorita;
        this.estrela = estrela;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public Data getDuracao() {
        return duracao;
    }

    public void setDuracao(Data duracao) {
        this.duracao = duracao;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public int getEstrela() {
        return estrela;
    }

    public void setEstrela(int estrela) {
        this.estrela = estrela;
    }
    
    
}
