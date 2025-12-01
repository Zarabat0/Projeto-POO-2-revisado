package restaurante.model;

import java.time.LocalDateTime;

public class Voucher
{
    private String id;
    private String eventoId;
    private String pacienteId;
    private double desconto;
    private LocalDateTime dataEmissao;
    private LocalDateTime dataUso;
    private boolean utilizado;
    private double valorMinimo;

    public Voucher(String id, String eventoId, String pacienteId, double desconto, double valorMinimo)
    {
        this.id = id;
        this.eventoId = eventoId;
        this.pacienteId = pacienteId;
        this.desconto = desconto;
        this.valorMinimo = valorMinimo;
        this.dataEmissao = LocalDateTime.now();
        this.utilizado = false;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getEventoId()
    {
        return eventoId;
    }

    public void setEventoId(String eventoId)
    {
        this.eventoId = eventoId;
    }

    public String getPacienteId()
    {
        return pacienteId;
    }

    public void setPacienteId(String pacienteId)
    {
        this.pacienteId = pacienteId;
    }

    public double getDesconto()
    {
        return desconto;
    }

    public void setDesconto(double desconto)
    {
        this.desconto = desconto;
    }

    public LocalDateTime getDataEmissao()
    {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDateTime dataEmissao)
    {
        this.dataEmissao = dataEmissao;
    }

    public LocalDateTime getDataUso()
    {
        return dataUso;
    }

    public void setDataUso(LocalDateTime dataUso)
    {
        this.dataUso = dataUso;
    }

    public boolean isUtilizado()
    {
        return utilizado;
    }

    public void setUtilizado(boolean utilizado)
    {
        this.utilizado = utilizado;
    }

    public double getValorMinimo()
    {
        return valorMinimo;
    }

    public void setValorMinimo(double valorMinimo)
    {
        this.valorMinimo = valorMinimo;
    }

    public void utilizar()
    {
        this.utilizado = true;
        this.dataUso = LocalDateTime.now();
    }

    public boolean isValidoParaUso(double valorCompra)
    {
        return !utilizado && valorCompra >= valorMinimo;
    }

    public double calcularDesconto(double valorCompra)
    {
        if (isValidoParaUso(valorCompra))
        {
            return valorCompra * (desconto / 100);
        }
        return 0.0;
    }
}