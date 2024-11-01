import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n\n   Preciso de um elevador para um prédio fictício, e você irá definir os limitadores do elevador e do prédio.");
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        System.out.print("Quantos andares terá o prédio? ");
        int maximoAndares = entrada.nextInt();
        System.out.print("Quanto de peso ele será capaz de carregar? ");
        int maximoPeso = entrada.nextInt();
        System.out.print("Quantas pessoas ele poderá carregar simultaneamente? ");
        int maximoPessoas = entrada.nextInt();

        Elevador elevador = new Elevador(maximoPeso, maximoAndares, maximoPessoas);

        Thread.sleep(2000);
        System.out.println();
        System.out.println(elevador.toString());

        boolean executando = true;
        while (executando) {
            Thread.sleep(3000);
            System.out.println("\nEscolha uma ação para o elevador:");
            System.out.println("1 - Entrar uma pessoa");
            System.out.println("2 - Sair uma pessoa");
            System.out.println("3 - Subir um andar");
            System.out.println("4 - Descer um andar");
            System.out.println("0 - Sair do programa");
            Thread.sleep(1000);
            System.out.print("\nDigite a sua escolha: ");

            int escolha = entrada.nextInt();

            String mensagem = ""; // variável para armazenar a mensagem de retorno

            switch (escolha) {
                case 1:
                    mensagem = elevador.entra();
                    break;
                case 2:
                    mensagem = elevador.sai();
                    break;
                case 3:
                    mensagem = elevador.sobe();
                    break;
                case 4:
                    mensagem = elevador.desce();
                    break;
                case 0:
                    executando = false;
                    mensagem = "\nEncerrando o sistema do elevador...";
                    break;
                default:
                    mensagem = "\nOpção inválida. Por favor, escolha uma opção válida.";
                    break;
            }


            System.out.println("\n" + mensagem);
        }

        entrada.close();
    }
}
