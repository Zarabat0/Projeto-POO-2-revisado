# 1. Quantos pacientes da clínica participaram de eventos?
  O método percorre a lista de pacientes retornada pelo ClinicaService.
  Para cada paciente, chama participouDeEvento(id) no EventoService.
  Se o paciente aparece em algum evento, incrementa o contador.
  No final, retorna a quantidade total.
  É um laço O(n) que cruza dados da clínica e dos eventos baseando-se no ID do paciente.
# 2. Quantos vouchers foram usados no restaurante?
  Obtém todos os vouchers cadastrados no RestauranteService.
  Cada voucher possui um atributo booleano utilizado.
  O método apenas conta quantos vouchers foram marcados como usados (true).
  É uma simples iteração sobre a lista de vouchers.
# 3. Quantos pacientes comeram no restaurante?
  O método percorre a lista de pacientes da clínica e consulta no RestauranteService se o paciente consumiu
  no restaurante através do método utilizouRestaurante(id).
  Cada paciente que utilizou gera um incremento no contador.
  No fim, retorna o total.
# 4. Quais pacientes fizeram os 3 serviços: consulta, evento e restaurante?
  Um paciente “completo” deve atender 3 condições simultaneamente:

    1.possuir ao menos uma consulta

    2.ter participado de algum evento

    3.ter utilizado o restaurante

  O método verifica cada condição separadamente e, se todas forem verdadeiras, adiciona o nome do paciente na lista final.
  No retorno temos somente os pacientes que usaram todo o sistema.
# 5. Quantas consultas pertencem aos pacientes que participaram de eventos?
  O método combina informações da clínica e dos eventos:

    1.Ele verifica cada paciente:
    2.se participou de algum evento, então soma todas as consultas desse paciente ao acumulador.

  Assim, o valor final representa a soma total de consultas somente dos pacientes que também frequentaram eventos.
# 6. Qual paciente gastou mais no restaurante?
  Cada paciente pode ter gastos registrados no restaurante.
  O método chama getGastoTotal(id) e:

    1.rastreia o paciente com maior valor gasto

    2.atualiza o maior gasto sempre que encontra um valor superior

    3.retorna o nome do paciente e o valor formatado

    4.Se ninguém usou o restaurante, retorna uma mensagem adequada.
# 7. Quantos pacientes usaram pelo menos 2 serviços?
  Todos os pacientes usam o serviço da clínica (consultas), então ele já conta 1 serviço.
  Depois:
    +1 se participou de eventos
    +1 se usou o restaurante
  Se o total for 2 ou mais, significa que o paciente utilizou no mínimo dois serviços do sistema.
