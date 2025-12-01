package eventos.service;

import eventos.model.*;
import java.util.*;

public class EventoService
{
    private List<Evento> eventos = new ArrayList<>();

    public void addEvento(Evento evento)
    {
        eventos.add(evento);
    }


    // Métodos para integração

    public boolean participouDeEvento(String pessoaId)
    {
        for (Evento evento : eventos)
        {
            if (evento.getParticipantes().contains(pessoaId))
            {
                return true;
            }
        }
        return false;
    }

    public List<Evento> getEventos()
    {
        return new ArrayList<>(eventos);
    }

    public Evento getEventoById(String id)
    {
        for (Evento evento : eventos)
        {
            if (evento.getId().equals(id))
            {
                return evento;
            }
        }
        return null;
    }
}