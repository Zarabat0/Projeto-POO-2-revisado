package restaurante.model;

import java.util.ArrayList;
import java.util.List;

public class Cardapio
{
    private String id;
    private String nome;
    private String descricao;
    private List<ItemCardapio> itens;
    private List<Combo> combos;

    public Cardapio(String id, String nome, String descricao)
    {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.itens = new ArrayList<>();
        this.combos = new ArrayList<>();
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
    }

    public List<Combo> getCombos()
    {
        return combos;
    }

    public void addCombo(Combo combo)
    {
        this.combos.add(combo);
    }

    public List<ItemCardapio> getItensFuncionais()
    {
        List<ItemCardapio> funcionais = new ArrayList<>();
        for (ItemCardapio item : itens)
        {
            if (item.isFuncional())
            {
                funcionais.add(item);
            }
        }
        return funcionais;
    }
}