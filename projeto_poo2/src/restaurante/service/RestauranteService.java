package restaurante.service;

import restaurante.model.*;
import java.util.*;

public class RestauranteService
{
    private List<Voucher> vouchers = new ArrayList<>();
    private List<Pagamento> pagamentos = new ArrayList<>();

    public void addVoucher(Voucher voucher)
    {
        vouchers.add(voucher);
    }

    public void addPagamento(Pagamento pagamento)
    {
        pagamentos.add(pagamento);
    }

    // Métodos para integração

    public List<Voucher> getVouchers()
    {
        return new ArrayList<>(vouchers);
    }

    public boolean utilizouRestaurante(String pessoaId)
    {
        for (Pagamento pagamento : pagamentos)
        {
            if (pagamento.getPessoaId().equals(pessoaId) && pagamento.isConfirmado())
            {
                return true;
            }
        }
        return false;
    }

    public double getGastoTotal(String pacienteId)
    {
        double total = 0;

        for (Pagamento pagamento : pagamentos)
        {
            if (pagamento.getPessoaId().equals(pacienteId))
            {
                total += pagamento.getValor();
            }
        }
        return total;
    }
}