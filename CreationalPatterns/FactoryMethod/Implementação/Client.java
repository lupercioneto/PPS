import java.util.Scanner;

public class Client {
    private static Logis logistica;

    static void configureLogis() {
        Scanner scan = new Scanner(System.in);
        
        try {
            
            int response = scan.nextInt();    
            
            if (response == 0) {
                logistica = new LogisRoad();
            } else if (response == 1) {
                logistica = new LogisSea();
            } 
        } catch (Exception e) {
            System.out.println("ERROR! Digite apenas os números 0 ou 1.");
        }

        scan.close();
    }

    static void startBusinessLogic() {
        logistica.createTransport(); 
        System.out.println("Your product will arrive soon!");
        logistica.initializeTravel();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Selecione o tipo de transportadora que deseja: ");
        System.out.println("0 - Caminhão (Terrestre)\n1 - Navio (Marítimo)");

        
        configureLogis();
        startBusinessLogic();
        
        scan.close();
    }

        
}
