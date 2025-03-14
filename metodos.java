//definindo e chamando métodos

public class metodos { //public class Calculadora
    //método que soma dois números
    public static int somar(int a, int b) { //método que recebe dois inteiros e retorna a soma
        return a +b; // retorna o resultado
    }

    public static void main(String[] args) {
        int resultado = somar(7, 22); // Chama o método e imprime 29
        System.out.println("resultado da soma: " + resultado);
     }

        //métodos sem retorno(void)
     public static void imprimirMensagem(){
        System.out.println("esse método é sem retorno");
     }
     //public static void main(String[] args){
        //imprimirMensagem();
     //}
     }
//void significa que o método não retorna um valor
