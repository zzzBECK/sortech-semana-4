public class Main {

    static void printLine(){
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {

        //4) Crie uma listagem de clientes utilizando variáveis primitivas
        String[] nome = {"Fulano", "Sicrano"}, idade = {"1980", "2000"};

        System.out.println("Listagem dos Clientes");
        for (int i = 0; i < nome.length; i++){
            printLine();
            System.out.println("Nome: " + nome[i]);
            System.out.println("Data de Nascimento: " + idade[i]);
        }


    }
}
