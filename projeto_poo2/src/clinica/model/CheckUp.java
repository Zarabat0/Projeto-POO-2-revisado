package clinica.model;

import java.time.LocalDateTime;

public class CheckUp
{
    private String id;
    private String pacienteId;
    private LocalDateTime dataHora;
    private double peso;
    private double altura;
    private double pressaoArterial;
    private double temperatura;
    private String observacoes;
    private boolean completo;

    public CheckUp(String id, String pacienteId, LocalDateTime dataHora)
    {
        this.id = id;
        this.pacienteId = pacienteId;
        this.dataHora = dataHora;
        this.peso = 0.0;
        this.altura = 0.0;
        this.pressaoArterial = 0.0;
        this.temperatura = 0.0;
        this.observacoes = "";
        this.completo = false;
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

    public LocalDateTime getDataHora()
    {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora)
    {
        this.dataHora = dataHora;
    }

    public double getPeso()
    {
        return peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public double getPressaoArterial()
    {
        return pressaoArterial;
    }

    public void setPressaoArterial(double pressaoArterial)
    {
        this.pressaoArterial = pressaoArterial;
    }

    public double getTemperatura()
    {
        return temperatura;
    }

    public void setTemperatura(double temperatura)
    {
        this.temperatura = temperatura;
    }

    public String getObservacoes()
    {
        return observacoes;
    }

    public void setObservacoes(String observacoes)
    {
        this.observacoes = observacoes;
    }

    public boolean isCompleto()
    {
        return completo;
    }

    public void setCompleto(boolean completo)
    {
        this.completo = completo;
    }

    public double calcularIMC()
    {
        if (altura > 0)
        {
            return peso / (altura * altura);
        }
        return 0.0;
    }

    public void completarCheckUp(double peso, double altura, double pressaoArterial, double temperatura, String observacoes)
    {
        this.peso = peso;
        this.altura = altura;
        this.pressaoArterial = pressaoArterial;
        this.temperatura = temperatura;
        this.observacoes = observacoes;
        this.completo = true;
    }
}