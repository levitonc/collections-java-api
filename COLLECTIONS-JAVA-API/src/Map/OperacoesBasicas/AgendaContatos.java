package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()) {
          numeroPorNome = agendaContatosMap.get(nome);
          if (numeroPorNome == null) {
            System.out.println("Contato não encontrado na agenda.");
          }
        } else {
          System.out.println("A agenda de contatos está vazia.");
        }
        return numeroPorNome;
      }

 public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    // ADICIONANDO CONTATOS 
    agendaContatos.adicionarContato("Camila", 123456);
    agendaContatos.adicionarContato("João", 5665);
    agendaContatos.adicionarContato("Carlos", 1111111);
    agendaContatos.adicionarContato("Ana", 654987);
    agendaContatos.adicionarContato("Maria", 1111111);
    agendaContatos.adicionarContato("Camila", 44444);

    // NO MAP COM A MESMA CHAVE ELE ATUALIZA A INFORMAÇÃO. JA NO SET CONSIDERA O PRIMEIRO 

    agendaContatos.exibirContatos();

    // Remover um contato
    agendaContatos.removerContato("Maria");
    agendaContatos.exibirContatos();

    // Pesquisar número por nome
    String nomePesquisa = "Camila";
    Integer numeroPesquisa = agendaContatos.pesquisarPorNome("Camila");
    System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

    String nomePesquisaNaoExistente = "Paula";
    Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
    System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
  }
}