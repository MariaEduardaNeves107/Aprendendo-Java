class No {

    private String conteudo;
    private No prox;

    public No(String conteudo) {
        this.conteudo = conteudo;
        this.prox = null;
    }

    public String getConteudo() {
        return conteudo;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}

public class ListaDinamica {

    private No primeiro;
    private int quantidadeElementos = 0; 

    public ListaDinamica(String conteudo) {

        this.primeiro = new No(conteudo);
        quantidadeElementos++;
    }

    public void inserirValor(String conteudo) {

        No novoNo = new No(conteudo);
        if (estaVazio()) {
            this.primeiro = novoNo;
        } else {
            No aux = this.primeiro;
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }

            aux.setProx(novoNo);
        }
        quantidadeElementos++;
    }

    public boolean estaVazio() {
        return primeiro == null;
    }

    public int contarElementos() {
        return quantidadeElementos;
    }

    public void verLista() {
        
        No aux = primeiro;
        System.out.println("Elementos na lista:");
        while (aux != null) {
            System.out.println(aux.getConteudo());
            aux = aux.getProx();
        }
        System.out.println("Quantidade de elementos adicionados: " + quantidadeElementos);
    }
}
