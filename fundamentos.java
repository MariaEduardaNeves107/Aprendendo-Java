public class fundamentos { //define uma classe chamada fundamentos
    public static void main(String[] args) //define o método principal
    {
        System.out.println("olá mundo"); //imprime uma mensagem no console

        int idade = 18;

        if (idade <=18){ //se idade for maior ou igual a 18
            System.out.println("você é maior de idade");
        } else{ //se não for
            System.out.println("você é menor de idade");
        }
        for(int i = 1; i <= 5; i++) { // O for repete i = 1 até i = 5, imprimindo os números
            System.out.println("Número: " + i);
        }
        int contador = 1;
        while (contador <= 5) { //Enquanto contador for menor ou igual a 5, imprime e incrementa 'contador'
            System.out.println("contador: " + contador);
            contador++;
        }
        int num = 1;
        do { 
            System.out.println("numero: " + num);
            num++;
        } while(num<=5); //garante que o código execute pelo menos uma vez
    }
}


