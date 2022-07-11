import java.util.Scanner;

public class Padaria {
    private String [] paes = new String[3];
    private String[] bebidas = new String[3];

    public Padaria() {

    }
    public void cadastar() {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < this.paes.length; i++) {
            System.out.print("Digite o tipo do pão: ");
            this.paes[i] = scanner.nextLine();
            System.out.println("Digite a bebida: ");
            this.bebidas[i] = scanner.nextLine();
    }

}

    public void consultar() {
        for(int i = 0; i < this.bebidas.length; i++) {
            if(this.bebidas[i] == null) {
                System.out.println("Não existe registro: ");
                break;
            }else {
                System.out.println();
                System.out.println("Pão: " + this.paes[i]);
                System.out.println("Bebida: " + this.bebidas[i]);
                System.out.println();
            }

        }

   }

}