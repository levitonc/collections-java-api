package set.OperacoesBasicas;



public class Convidado {

    private String nome;
    private int codigoConvite;
    

            //O CONSTRUTOR 
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

        // OS GETTERS 
    public String getNome(){
        return nome;
    }
    public int getCodigoConvite(){
        return codigoConvite;
    }

    @Override
    public String toString() {
      return "Convidado{" +
          "nome='" + nome + '\'' +
          ", codigoConvite=" + codigoConvite +
          '}';
    }

}
