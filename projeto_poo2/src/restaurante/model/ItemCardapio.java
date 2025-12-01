package restaurante.model;

public class ItemCardapio
{
    private String id;
    private String nome;
    private String descricao;
    private double preco;
    private String categoria;
    private boolean isFuncional;
    private int calorias;
    private String restricoes;

    public ItemCardapio(String id, String nome, String descricao, double preco, String categoria, boolean isFuncional, int calorias, String restricoes)
    {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.isFuncional = isFuncional;
        this.calorias = calorias;
        this.restricoes = restricoes;
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

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public double getPreco()
    {
        return preco;
    }

    public void setPreco(double preco)
    {
        this.preco = preco;
    }

    public String getCategoria()
    {
        return categoria;
    }

    public void setCategoria(String categoria)
    {
        this.categoria = categoria;
    }

    public boolean isFuncional()
    {
        return isFuncional;
    }

    public void setFuncional(boolean funcional)
    {
        isFuncional = funcional;
    }

    public int getCalorias()
    {
        return calorias;
    }

    public void setCalorias(int calorias)
    {
        this.calorias = calorias;
    }

    public String getRestricoes()
    {
        return restricoes;
    }

    public void setRestricoes(String restricoes)
    {
        this.restricoes = restricoes;
    }

    public double aplicarDesconto(double percentualDesconto)
    {
        double desconto = preco * (percentualDesconto / 100);
        return preco - desconto;
    }
}