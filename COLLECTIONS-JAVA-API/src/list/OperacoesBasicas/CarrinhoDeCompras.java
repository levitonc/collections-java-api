package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
        }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);

    }
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()){
            for(Item i : itemList){
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        }else {
            System.out.println("A LISTA TA VAZIA");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        for(Item item : itemList) {
            double valorItem = item.getPreco() * item.getQuant();
            valorTotal += valorItem;
            
        }
        return valorTotal;
        
    } 
    

    public void exibirItens(){
        if(!itemList.isEmpty()){
            System.out.println(this.itemList);
        }else{
            System.out.println("Lista empty");
        }
    }

    @Override
    public String toString(){
        return "CarrinhoDeComprpas{" + "itens=" + itemList + '}';
    }
    public static void main(String[] args) {
        // Criando o carrinho de compras... 
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
    
        // Adicionando os itens pra ver se da certo 
        carrinhoDeCompras.adicionarItem("Sofá", 2d, 3);
        carrinhoDeCompras.adicionarItem("Sofá", 2d, 3);
        carrinhoDeCompras.adicionarItem("Poltrona", 35d, 1);
        carrinhoDeCompras.adicionarItem("Quadro", 20d, 5);


    
        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();
    
        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Poltrona");
    
        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();
    
        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
      }
    }

