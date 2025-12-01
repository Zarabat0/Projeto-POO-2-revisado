package clinica.model;

import java.time.LocalDateTime;

public class Consulta
{
    private String id;
    private String pacienteId;
    private String medicoId;
    private LocalDateTime dataHora;
    private String tipo;
    private String resultado;
    private double valor;

    public Consulta(String id, String pacienteId, String medicoId, LocalDateTime dataHora, String tipo, double valor)
    {
        this.id = id;
        this.pacienteId = pacienteId;
        this.medicoId = medicoId;
        this.dataHora = dataHora;
        this.tipo = tipo;
        this.valor = valor;
        this.resultado = "";
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getPacienteId()
    {
        return pacienteId;
    }

    public void setPacienteId(String pacienteId)
    {
        this.pacienteId = pacienteId;
    }

    public String getMedicoId()
    {
        return medicoId;
    }

    public void setMedicoId(String medicoId)
    {
        this.medicoId = medicoId;
    }

    public LocalDateTime getDataHora()
    {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora)
    {
        this.dataHora = dataHora;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public String getResultado()
    {
        return resultado;
    }

    public void setResultado(String resultado)
    {
        this.resultado = resultado;
    }

    public double getValor()
    {
        return valor;
    }

    public void setValor(double valor)
    {
        this.valor = valor;
    }
}