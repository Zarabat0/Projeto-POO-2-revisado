package eventos.model;

import eventos.model.Local;
import java.time.LocalDateTime;

public class Show extends Evento
{
    private String artista;
    private String generoMusical;
    private int duracaoMinutos;
    private boolean temOpenBar;

    public Show(String id, String nome, Local local, LocalDateTime dataHora, int capacidade, String artista, String generoMusical, int duracaoMinutos, boolean temOpenBar)
    {
        super(id, nome, "SHOW", local, dataHora, capacidade);
        this.artista = artista;
        this.generoMusical = generoMusical;
        this.duracaoMinutos = duracaoMinutos;
        this.temOpenBar = temOpenBar;
    }

    public String getArtista()
    {
        return artista;
    }

    public void setArtista(String artista)
    {
        this.artista = artista;
    }

    public String getGeneroMusical()
    {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical)
    {
        this.generoMusical = generoMusical;
    }

    public int getDuracaoMinutos()
    {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos)
    {
        this.duracaoMinutos = duracaoMinutos;
    }

    public boolean isTemOpenBar()
    {
        return temOpenBar;
    }

    public void setTemOpenBar(boolean temOpenBar)
    {
        this.temOpenBar = temOpenBar;
    }
}