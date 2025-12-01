package restaurante.model;

import java.util.ArrayList;
import java.util.List;

public class Combo
{
    private String id;
    private String nome;
    private String descricao;
    private List<ItemCardapio> itens;
    private double precoOriginal;
    private double precoCombo;
    private boolean isEspecial;

    public Combo(String id, String nome, String descricao, boolean isEspecial)
    {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.itens = new ArrayList<>();
        this.precoOriginal = 0.0;
        this.precoCombo = 0.0;
        this.isEspecial = isEspecial;
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

    public List<ItemCardapio> getItens()
    {
        return itens;
    }

    public void addItem(ItemCardapio item)
    {
        this.itens.add(item);
        this.precoOriginal += item.getPreco();
        calcularPrecoCombo();
    }

    public double getPrecoOriginal()
    {
        return precoOriginal;
    }

    public double getPrecoCombo()
    {
        return precoCombo;
    }

    public void setPrecoCombo(double precoCombo)
    {
        this.precoCombo = precoCombo;
    }

    public boolean isEspecial()
    {
        return isEspecial;
    }

    public void setEspecial(boolean especial)
    {
        isEspecial = especial;
    }

    private void calcularPrecoCombo()
    {
        if (isEspecial)
        {
            this.precoCombo = precoOriginal * 0.8; // 20% de desconto para combos especiais
        }
        else
        {
            this.precoCombo = precoOriginal * 0.9; // 10% de desconto para combos normais
        }
    }

    public double calcularEconomia()
    {
        return precoOriginal - precoCombo;
    }
}