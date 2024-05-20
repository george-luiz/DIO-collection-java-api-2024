package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap); // TreeMap: já ordena automaticamente
        System.out.println("Exibindo agenda: " + eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate proximaData = null;
        Evento proximoEvento = null;
       LocalDate dataAtual = LocalDate.now(); // pegando a data atual
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap); // TreeMap: já ordena automaticamente
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 20), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 9), "Evento 2", "Atração 2");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}

