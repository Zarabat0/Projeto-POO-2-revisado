package eventos.model;

import eventos.model.Local;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Evento
{
    private String id;
    private String nome;
    private String tipo;
    private Local local;
    private LocalDateTime dataHora;
    private int capacidade;
    private List<String> participantes;

    public Evento(String id, String nome, String tipo, Local local, LocalDateTime dataHora, int capacidade)
    {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.local = local;
        this.dataHora = dataHora;
        this.capacidade = capacidade;
        this.participantes = new ArrayList<>();
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public Local getLocal()
    {
        return local;
    }

    public void setLocal(Local local)
    {
        this.local = local;
    }

    public LocalDateTime getDataHora()
    {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora)
    {
        this.dataHora = dataHora;
    }

    public int getCapacidade()
    {
        return capacidade;
    }

    public void setCapacidade(int capacidade)
    {
        this.capacidade = capacidade;
    }

    public List<String> getParticipantes()
    {
        return participantes;
    }

    public void addParticipante(String participanteId)
    {
        if (participantes.size() < capacidade)
        {
            participantes.add(participanteId);
        }
    }

    public boolean removeParticipante(String participanteId)
    {
        return participantes.remove(participanteId);
    }
}