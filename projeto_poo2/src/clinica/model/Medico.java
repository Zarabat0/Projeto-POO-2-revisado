package clinica.model;

import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa
{
    private String especialidade;
    private String crm;
    private List<String> consultasAgendadas;

    public Medico(String id, String nome, String email, String telefone, int idade, String especialidade, String crm)
    {
        super(id, nome, email, telefone, idade);
        this.especialidade = especialidade;
        this.crm = crm;
        this.consultasAgendadas = new ArrayList<>();
    }

    public String getEspecialidade()
    {
        return especialidade;
    }

    public void setEspecialidade(String especialidade)
    {
        this.especialidade = especialidade;
    }

    public String getCrm()
    {
        return crm;
    }

    public void setCrm(String crm)
    {
        this.crm = crm;
    }

    public List<String> getConsultasAgendadas()
    {
        return consultasAgendadas;
    }

    public void addConsultaAgendada(String consultaId)
    {
        this.consultasAgendadas.add(consultaId);
    }
}