package clinica.model;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa
{
    private String historicoMedico;
    private List<Consulta> consultas;
    private List<CheckUp> checkUps;
    private boolean temDesconto;

    public Paciente(String id, String nome, String email, String telefone, int idade)
    {
        super(id, nome, email, telefone, idade);
        this.historicoMedico = "";
        this.consultas = new ArrayList<>();
        this.checkUps = new ArrayList<>();
        this.temDesconto = false;
    }

    public String getHistoricoMedico()
    {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico)
    {
        this.historicoMedico = historicoMedico;
    }

    public List<Consulta> getConsultas()
    {
        return consultas;
    }

    public void addConsulta(Consulta consulta)
    {
        this.consultas.add(consulta);
    }

    public List<CheckUp> getCheckUps()
    {
        return checkUps;
    }

    public void addCheckUp(CheckUp checkUp)
    {
        this.checkUps.add(checkUp);
    }

    public boolean isTemDesconto()
    {
        return temDesconto;
    }

    public void setTemDesconto(boolean temDesconto)
    {
        this.temDesconto = temDesconto;
    }
}