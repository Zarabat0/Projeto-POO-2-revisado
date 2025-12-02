# Sistema Integrado – Clínica, Eventos e Restaurante  
Projeto de Programação Orientada a Objetos (POO) – Java

Este projeto simula um sistema integrado composto por **três módulos principais**:  
- **Clínica médica**  
- **Eventos**  
- **Restaurante**  

Cada módulo possui suas próprias entidades e regras internas, mas todos interagem através de uma classe de serviços centralizada, permitindo consultas cruzadas, estatísticas e tomada de decisões.

---

##  Objetivos do Projeto
- Praticar **Programação Orientada a Objetos (POO) em Java**  
- Trabalhar com **pacotes**, **encapsulamento**, **composição**, **listas**, **métodos de serviço** e **camadas lógicas**  
- Integrar vários módulos diferentes em um único sistema  
- Implementar um conjunto de métodos de análise (TD)

---

##  Estrutura do Projeto (Pacotes)

```
src/
 ├── clinica/
 │    ├── model/        → Paciente, Consulta
 │    └── service/      → ClinicaService
 │
 ├── eventos/
 │    ├── model/        → Evento, Participante
 │    └── service/      → EventoService
 │
 ├── restaurante/
 │    ├── model/        → Voucher, Consumo
 │    └── service/      → RestauranteService
 │
 └── decisoes/
      └── service/      → MetodosService (classe principal da TD)
```

Cada módulo é responsável pelo seu próprio domínio, respeitando o princípio de **responsabilidade única**.

---

##  Classe Principal da TD: `MetodosService`

A classe `MetodosService` reúne métodos que combinam informações de todos os módulos, respondendo perguntas como:

- Quantos pacientes participaram de eventos?  
- Quantos vouchers foram usados?  
- Quem gastou mais no restaurante?  
- Quais pacientes usaram todos os serviços?  
- Etc.

Isso demonstra **integração entre serviços** e uso correto de **POO + regras de negócios**.

---

##  Como Executar o Projeto

###  Pré-requisitos
- **Java 17** ou superior  
- Qualquer IDE Java (IntelliJ, Eclipse, VS Code)  

###  Executar via IDE
1. Abrir o projeto  
2. Garantir que o SDK está configurado  
3. Rodar a classe `Main` ou os serviços para testes

###  Executar via terminal
```bash
javac -d bin $(find src -name "*.java")
java -cp bin Main
```

---

##  Exemplos de Uso

### Consultar quantos pacientes foram a eventos:
```java
MetodosService m = new MetodosService(cService, eService, rService);
System.out.println(m.contarPacientesEmEventos());
```

### Ver quem gastou mais:
```java
System.out.println(m.pacienteMaiorGastoRestaurante());
```

---

##  Conceitos de POO Utilizados
- **Encapsulamento** (atributos privados + getters/setters)  
- **Composição** (Paciente contém Consultas, Evento contém Participantes…)  
- **Modularização com pacotes**  
- **Serviços como camada de regras de negócio**  
- **Iterações, filtros, busca por ID, sumarizações**

---

##  Autor
Desenvolvido por **Nicolas Ferreira**  e **Leonardo Cireno**
Projeto para a disciplina de **Programação Orientada a Objetos (POO)**.
