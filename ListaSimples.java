public class ListaSimples {

    private int tamanho;
    private Integer[] lista;
    private int quantidadeElementos = 0; 

    public ListaSimples(int tamanhoEstrutura) {

        this.tamanho = tamanhoEstrutura;
        lista = new Integer[tamanhoEstrutura];
        System.out.println("A lista criada e seu tamanho é: " + tamanhoEstrutura);
    }

    public void inserirValor(int valor) {

        for (int i = 0; i < tamanho; i++) {

            if (lista[i] == null) {
                lista[i] = valor;
                quantidadeElementos++;
                System.out.println("O valor " + valor + " foi inserido");
                return;
            }
        }

        System.out.println("Todas as posições estão preenchidas.");
    }

    public int contarElementos() {

        return quantidadeElementos;
    }

    public void verLista() {

        System.out.println("Elementos na lista:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Lista[" + i + "] = " + lista[i]);
        }
        System.out.println("Elementos adicionados: " + quantidadeElementos);
    }
}
