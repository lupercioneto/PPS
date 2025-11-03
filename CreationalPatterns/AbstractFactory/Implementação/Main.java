import factories.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = null;
        Sala sala1;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o tipo de móvel desejado (Ex: VITORIANO/MODERNO): ");
        String type = scan.nextLine().toUpperCase();

        if (type.equals("VITORIANO")) {
            factory = new VictorianFactory();
        } else if (type.equals("MODERNO")) {
            factory = new ModernFactory();
        }

        sala1 = new Sala(factory);

        scan.close();

        sala1.showSurface();
    }
}