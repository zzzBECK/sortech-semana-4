import java.lang.invoke.SwitchPoint;
import java.util.Calendar;

public class Main {

    static void printHeader(){
        System.out.println("*".repeat(20));
        System.out.println("Bem vindo ao Comex");
        System.out.println("*".repeat(20));
        System.out.println();
    }

    static void printLine(){
        System.out.println("-".repeat(20));
    }

    public static String getCategoria(String ano){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - Integer.parseInt(ano);

        if (age <= 13)
            return "ADOLESCENTE";
        else if (age >= 17 && age <= 29)
            return "JOVEM";
        else if (age >= 30 && age <= 59)
            return "ADULTO";
        return "IDOSO";
    }

    public static void main(String[] args) {

        printHeader();

        // 4) Crie uma listagem de clientes utilizando variáveis primitivas
        String[] nome = {"Fulano", "Sicrano"}, ano = {"1980", "2000"};

        System.out.println("Listagem dos Clientes");
        for (int i = 0; i < nome.length; i++){
            printLine();
            System.out.println("Nome: " + nome[i]);
            System.out.println("Data de Nascimento: " + ano[i]);
            System.out.println("Caracterísitca Etária: " + getCategoria(ano[i]));
        }

        printLine();
        System.out.println();


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
