public class Main {

    static void printLine(){
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {

        // 4) Crie uma listagem de clientes utilizando variáveis primitivas
        String[] nome = {"Fulano", "Sicrano"}, idade = {"1980", "2000"};

        System.out.println("Listagem dos Clientes");
        for (int i = 0; i < nome.length; i++){
            printLine();
            System.out.println("Nome: " + nome[i]);
            System.out.println("Data de Nascimento: " + idade[i]);
        }

        printLine();
        printLine();

        // 5) Crie uma listagem de produtos utilizando variáves primitivas
        String[] produtos = {"Livro", "Celular"};
        double[] preco = {49.95, 1470.76};

        System.out.println("Listagem dos Produtos");
        for (int i = 0; i < nome.length; i++){
            printLine();
            System.out.println("Nome: " + produtos[i]);
            System.out.println("Preço: " + preco[i]);
        }


        // 6) Alterar a listagem dos clientes para utilizar o nome dos clientes em variáveis do tipo String
        // Já foi feito
    }
}
