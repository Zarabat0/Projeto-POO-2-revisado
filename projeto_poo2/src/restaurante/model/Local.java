package restaurante.model;

public class Local
{
    private String id;
    private String nome;
    private String endereco;
    private int capacidade;
    private String tipo;
    private int mesas;
    private boolean delivery;

    public Local(String id, String nome, String endereco, int capacidade, String tipo, int mesas, boolean delivery)
    {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.capacidade = capacidade;
        this.tipo = tipo;
        this.mesas = mesas;
        this.delivery = delivery;
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

    public String getEndereco()
    {
        return endereco;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public int getCapacidade()
    {
        return capacidade;
    }

    public void setCapacidade(int capacidade)
    {
        this.capacidade = capacidade;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public int getMesas()
    {
        return mesas;
    }

    public void setMesas(int mesas)
    {
        this.mesas = mesas;
    }

    public boolean isDelivery()
    {
        return delivery;
    }

    public void setDelivery(boolean delivery)
    {
        this.delivery = delivery;
    }
}