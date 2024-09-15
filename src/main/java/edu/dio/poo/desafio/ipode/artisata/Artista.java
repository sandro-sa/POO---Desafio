package edu.dio.poo.desafio.ipode.artisata;

import edu.dio.poo.desafio.ipode.album.Album;
import edu.dio.poo.desafio.ipode.album.Musica;
import edu.dio.poo.desafio.pessoa.Pessoa;
import java.util.List;

/**
 *
 * @author SandroAmânciodeSá
 */
public class Artista extends Pessoa{
    
    private Pessoa pessoa;
    private List<Musica> musicas;
    private List<Album> albuns;

    public Artista(Pessoa pessoa, List<Musica> musicas, List<Album> albuns, String nome, String sobreNome) {
        super(nome, sobreNome);
        this.pessoa = pessoa;
        this.musicas = musicas;
        this.albuns = albuns;
    }

    public Artista(Pessoa pessoa, List<Musica> musicas, String nome, String sobreNome) {
        super(nome, sobreNome);
        this.pessoa = pessoa;
        this.musicas = musicas;
    }

    public Artista(Pessoa pessoa, String nome, String sobreNome) {
        super(nome, sobreNome);
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public List<Album> getAlbuns() {
        return albuns;
    }

    public void setAlbuns(List<Album> albuns) {
        this.albuns = albuns;
    }
    
}
