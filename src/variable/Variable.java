package variable; // Asegúrate de que la clase esté en el paquete correcto
import java.util.Scanner; // Importa la clase Scanner

public class Variable { // Nombre de la clase debe coincidir con el nombre del archivo
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Define la variable scanner

        int numero = 0;

        do {
            System.out.print("Ingresa un número (Ingresa 20 para salir): ");
            numero = scanner.nextInt();
        } while (numero != 20);
        
        System.out.println("¡Has ingresado el número 20! El programa ha finalizado.");
    }
}

