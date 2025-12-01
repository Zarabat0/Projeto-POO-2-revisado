package eventos.model;

import java.time.LocalDateTime;

public class Pagamento
{
    private String id;
    private String pessoaId;
    private String servico;
    private double valor;
    private LocalDateTime dataHora;
    private String formaPagamento;
    private boolean confirmado;

    public Pagamento(String id, String pessoaId, String servico, double valor, String formaPagamento)
    {
        this.id = id;
        this.pessoaId = pessoaId;
        this.servico = servico;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.dataHora = LocalDateTime.now();
        this.confirmado = false;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getPessoaId()
    {
        return pessoaId;
    }

    public void setPessoaId(String pessoaId)
    {
        this.pessoaId = pessoaId;
    }

    public String getServico()
    {
        return servico;
    }

    public void setServico(String servico)
    {
        this.servico = servico;
    }

    public double getValor()
    {
        return valor;
    }

    public void setValor(double valor)
    {
        this.valor = valor;
    }

    public LocalDateTime getDataHora()
    {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora)
    {
        this.dataHora = dataHora;
    }

    public String getFormaPagamento()
    {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento)
    {
        this.formaPagamento = formaPagamento;
    }

    public boolean isConfirmado()
    {
        return confirmado;
    }

    public void setConfirmado(boolean confirmado)
    {
        this.confirmado = confirmado;
    }

    public void confirmarPagamento()
    {
        this.confirmado = true;
    }
}