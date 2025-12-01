package eventos.model;

import eventos.model.Local;
import java.time.LocalDateTime;

public class Palestra extends Evento
{
    private String palestrante;
    private String tema;
    private int duracaoMinutos;

    public Palestra(String id, String nome, Local local, LocalDateTime dataHora, int capacidade, String palestrante, String tema, int duracaoMinutos)
    {
        super(id, nome, "PALESTRA", local, dataHora, capacidade);
        this.palestrante = palestrante;
        this.tema = tema;
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getPalestrante()
    {
        return palestrante;
    }

    public void setPalestrante(String palestrante)
    {
        this.palestrante = palestrante;
    }

    public String getTema()
    {
        return tema;
    }

    public void setTema(String tema)
    {
        this.tema = tema;
    }

    public int getDuracaoMinutos()
    {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos)
    {
        this.duracaoMinutos = duracaoMinutos;
    }
}