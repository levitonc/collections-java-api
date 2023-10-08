package set.OperacoesBasicas.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContato(){
        System.out.println(contatoSet);
    }

        public Set<Contato> pesquisarPorNome(String nome){
            Set<Contato> contatosPorNome = new HashSet<>();
            for(Contato c : contatoSet){
                if(c.getNome().startsWith(nome)){
                    contatosPorNome.add(c);
                }
            }
            return contatosPorNome;
        }

        public Contato atualizarNumeroContato(String nome, int novoNumero){
            Contato contatoAtualizado = null;
            for(Contato c: contatoSet){
                if(c.getNome().equalsIgnoreCase(nome)){
                    c.setNumero(novoNumero);
                    break;
                }
            }
            return contatoAtualizado;}
        public static void main(String[] args) {
    // Criando uma instância da classe AgendaContatos
    AgendaContato agendaContatos = new AgendaContato();

    // Exibindo os contatos no conjunto (deve estar vazio)
    agendaContatos.exibirContato();

    // Adicionando contatos à agenda
    agendaContatos.adicionarContato("Leleuzinho", 991935242);
    agendaContatos.adicionarContato("Leti", 988488244);
    agendaContatos.adicionarContato("Maria Fernandes", 55555555);
    agendaContatos.adicionarContato("Maria Clara", 998351038);
    agendaContatos.adicionarContato("Fernando", 77778888);
    agendaContatos.adicionarContato("Carolina", 55555555);

    // Exibindo os contatos na agenda
    agendaContatos.exibirContato();

    // Pesquisando contatos pelo nome
    System.out.println(agendaContatos.pesquisarPorNome("Maria"));

    // Atualizando o número de um contato
    Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
    System.out.println("Contato atualizado: " + contatoAtualizado);

    // Exibindo os contatos atualizados na agenda
    System.out.println("Contatos na agenda após atualização:");
    agendaContatos.exibirContato();
  }
}