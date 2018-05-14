import java.util.Scanner;

public class ListaDeCompras {

    public static void main(String[] args) {

        Lista l1 = new Lista();

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 1 para adicionar iten");
        System.out.println("Digite 2 para remover iten");
        System.out.println("Digite 3 para vizualizar lista");
        System.out.println("Digite 4 para modificar lista");
        System.out.println("Digite 0 para sair....");


        System.out.print("Digite uma opção: ");
        int n = scan.nextInt();

        while(n != 0) {
            switch (n) {
                case 1:
                    System.out.print("Digite o nome do iten a ser adicionado: ");
                    String iten = scan.next();
                    l1.setIten(iten);
                    System.out.print("Digite a opção:  ");
                    n = scan.nextInt();
                    break;
                case 2:
                    System.out.print("Digite o nome do iten a ser removido: ");
                    String iten2 = scan.next();
                    l1.removeIten(iten2);
                    System.out.print("Digite a opção:  ");
                    n = scan.nextInt();
                    break;
                case 3:
                    System.out.println(l1.getLista());
                    System.out.print("Digite a opção:  ");
                    n = scan.nextInt();
                    break;
                case 4:
                    System.out.print("Digite o nome do iten a ser substituido: ");
                    String itenAtual = scan.next();
                    System.out.print("Digite o nome do iten a ser adicionado: ");
                    String itenDesejado = scan.next();
                    l1.modificarLista(itenAtual, itenDesejado);
                    System.out.print("Digite a opção:  ");
                    n = scan.nextInt();
                    break;
                default:
                    System.out.println("Digite uma opção valida");
                    System.out.print("Digite a opção:  ");
                    n = scan.nextInt();
                    break;
            }
        }
    }
}
