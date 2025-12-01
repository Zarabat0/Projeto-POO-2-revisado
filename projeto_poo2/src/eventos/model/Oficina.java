package eventos.model;

import eventos.model.Local;
import java.time.LocalDateTime;

public class Oficina extends Evento
{
    private String instrutor;
    private String materialNecessario;
    private int duracaoMinutos;
    private int vagasDisponiveis;

    public Oficina(String id, String nome, Local local, LocalDateTime dataHora, int capacidade, String instrutor, String materialNecessario, int duracaoMinutos)
    {
        super(id, nome, "OFICINA", local, dataHora, capacidade);
        this.instrutor = instrutor;
        this.materialNecessario = materialNecessario;
        this.duracaoMinutos = duracaoMinutos;
        this.vagasDisponiveis = capacidade;
    }

    public String getInstrutor()
    {
        return instrutor;
    }

    public void setInstrutor(String instrutor)
    {
        this.instrutor = instrutor;
    }

    public String getMaterialNecessario()
    {
        return materialNecessario;
    }

    public void setMaterialNecessario(String materialNecessario)
    {
        this.materialNecessario = materialNecessario;
    }

    public int getDuracaoMinutos()
    {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos)
    {
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getVagasDisponiveis()
    {
        return vagasDisponiveis;
    }

    public void setVagasDisponiveis(int vagasDisponiveis)
    {
        this.vagasDisponiveis = vagasDisponiveis;
    }
}