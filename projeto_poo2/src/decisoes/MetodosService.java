package decisoes.service;

import clinica.service.ClinicaService;
import eventos.service.EventoService;
import restaurante.service.RestauranteService;
import java.util.*;

public class MetodosService
{
    private ClinicaService clinicaService;
    private EventoService eventoService;
    private RestauranteService restauranteService;

    public MetodosService(ClinicaService clinicaService,
                          EventoService eventoService,
                          RestauranteService restauranteService)
    {
        this.clinicaService = clinicaService;
        this.eventoService = eventoService;
        this.restauranteService = restauranteService;
    }

    // 1. Quantos pacientes da clínica participaram de eventos?

    public int contarPacientesEmEventos()
    {
        int count = 0;

        for (clinica.model.Paciente paciente : clinicaService.getPacientes())
        {
            if (eventoService.participouDeEvento(paciente.getId()))
            {
                count++;
            }
        }
        return count;
    }

    // 2. Quantos vouchers foram usados no restaurante?

    public int contarVouchersUtilizados()
    {
        int count = 0;

        for (restaurante.model.Voucher voucher : restauranteService.getVouchers())
        {
            if (voucher.isUtilizado())
            {
                count++;
            }
        }
        return count;
    }

    // 3. Quantos pacientes comeram no restaurante?

    public int contarPacientesNoRestaurante()
    {
        int count = 0;

        for (clinica.model.Paciente paciente : clinicaService.getPacientes())
        {
            if (restauranteService.utilizouRestaurante(paciente.getId()))
            {
                count++;
            }
        }
        return count;
    }

    // 4. Quais pacientes fizeram os 3: consulta, evento e restaurante?

    public List<String> listarPacientesCompletos()
    {
        List<String> pacientes = new ArrayList<>();

        for (clinica.model.Paciente paciente : clinicaService.getPacientes())
        {
            boolean temConsulta = !paciente.getConsultas().isEmpty();
            boolean temEvento = eventoService.participouDeEvento(paciente.getId());
            boolean temRestaurante = restauranteService.utilizouRestaurante(paciente.getId());

            if (temConsulta && temEvento && temRestaurante)
            {
                pacientes.add(paciente.getNome());
            }
        }
        return pacientes;
    }

    // 5. Quantas consultas têm pacientes que foram a eventos?

    public int contarConsultasDeParticipantes()
    {
        int count = 0;

        for (clinica.model.Paciente paciente : clinicaService.getPacientes())
        {
            if (eventoService.participouDeEvento(paciente.getId()))
            {
                count += paciente.getConsultas().size();
            }
        }
        return count;
    }

    // 6. Qual paciente gastou mais no restaurante?

    public String pacienteMaiorGastoRestaurante()
    {
        String pacienteMaiorGasto = null;
        double maiorGasto = 0;

        for (clinica.model.Paciente paciente : clinicaService.getPacientes())
        {
            double gastoPaciente = restauranteService.getGastoTotal(paciente.getId());

            if (gastoPaciente > maiorGasto)
            {
                maiorGasto = gastoPaciente;
                pacienteMaiorGasto = paciente.getNome();
            }
        }

        if (pacienteMaiorGasto == null)
        {
            return "Nenhum paciente usou o restaurante";
        }

        return pacienteMaiorGasto + " (R$ " + String.format("%.2f", maiorGasto) + ")";
    }

    // 7. Quantos pacientes usaram pelo menos 2 serviços?

    public int contarPacientesMultiplosServicos()
    {
        int count = 0;

        for (clinica.model.Paciente paciente : clinicaService.getPacientes())
        {
            int servicosUsados = 0;

            // Clínica (sempre true se é paciente)
            servicosUsados++;

            // Eventos
            if (eventoService.participouDeEvento(paciente.getId()))
            {
                servicosUsados++;
            }

            // Restaurante
            if (restauranteService.utilizouRestaurante(paciente.getId()))
            {
                servicosUsados++;
            }

            if (servicosUsados >= 2)
            {
                count++;
            }
        }
        return count;
    }
}