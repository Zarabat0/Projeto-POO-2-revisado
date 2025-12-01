package clinica.service;

import clinica.model.*;
import java.util.*;

public class ClinicaService
{
    private List<Paciente> pacientes = new ArrayList<>();
    private List<Medico> medicos = new ArrayList<>();

    public void addPaciente(Paciente paciente)
    {
        pacientes.add(paciente);
    }

    // Métodos para integração

    public List<Paciente> getPacientes()
    {
        return new ArrayList<>(pacientes);
    }

    public boolean isPaciente(String pessoaId)
    {
        for (Paciente p : pacientes)
        {
            if (p.getId().equals(pessoaId))
            {
                return true;
            }
        }
        return false;
    }

    public List<Paciente> getPacientesComDesconto()
    {
        List<Paciente> comDesconto = new ArrayList<>();
        for (Paciente p : pacientes)
        {
            if (p.isTemDesconto())
            {
                comDesconto.add(p);
            }
        }
        return comDesconto;
    }
}