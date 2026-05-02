import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca el número desde donde quiere iniciar la cuenta atrás");
            int superior = sc.nextInt();
            System.out.println("Intruduzca el número donde quiere que se detenga la cuenta atrásssss");
            int bajo = sc.nextInt();//
            for (int i = superior; i >=bajo ; i--) {
                System.out.println(i);

            }
        }

    }
