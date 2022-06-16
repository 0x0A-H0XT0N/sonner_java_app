import java.util.Scanner;

public class sonner_app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            printMenu();
            int opcao = sc.nextInt();
            if (opcao == 0) {
                break;
            }
            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    excluir();
                    break;

    }}
    }
    public static void printMenu() {
    System.out.println("0 - Sair");
    System.out.println("1 - Cadastrar");
    System.out.println("2 - Listar");
    System.out.println("3 - Excluir");
    }
    public static void cadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do usuário: ");
        String nome = sc.nextLine();
        System.out.println("Digite o idade do usuário: ");
        String idade = sc.nextLine();
        System.out.println("Digite o email do usuário: ");
        String email = sc.nextLine();
    }
    public static void listar() {
        System.out.println("LISTAR USUARIO");
    }
    public static void excluir() {
        System.out.println("EXCLUIR USUARIO");
    }}
