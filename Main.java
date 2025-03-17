//classe genérica(abstração)
class Veiculo {
    private String marca;
    private int ano;

    //construtor
    public Veiculo(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }
    //getters e setters(encapsulamento)
    public String getMarca(){
        return marca;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
    //método comum a todos os veículos
    public void fazerBarulho(){
        System.out.println("O veículo faz barulho...");
    }
}

//classe carro herdando de veiculo
class Carro extends Veiculo {
    private int portas;

    //construtor
    public Carro(String marca, int ano, int portas) {
        super(marca, ano); // Chama o construtor da classe pai (Veiculo)
        this.portas = portas;
    }

    // Sobrescrita de método (Polimorfismo)
    @Override
    public void fazerBarulho() {
        System.out.println("O carro faz: Vrum Vrum!");
    }

    public void exibirDetalhes() {
        System.out.println("Carro: " + getMarca() + ", Ano: " + getAno() + ", Portas: " + portas);
    }
}

// Classe principal para testar
public class Main {
    public static void main(String[] args) {
        // Criando um carro (Objeto da classe Carro)
        Carro meuCarro = new Carro("Toyota", 2022, 4);

        // Exibindo detalhes do carro
        meuCarro.exibirDetalhes();

        // Chamando o método polimórfico
        meuCarro.fazerBarulho();
    }
}
