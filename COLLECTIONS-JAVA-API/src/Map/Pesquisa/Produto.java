package Map.Pesquisa;

public class Produto {
    private String nome;   
    public String getNome() {
        return nome;
    }

    private double preco;
    public double getPreco() {
        return preco;
    }

    private int quant;    
     public int getQuant() {
        return quant;
    }

    public Produto(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quant=" + quant + "]";
    }

    
}
