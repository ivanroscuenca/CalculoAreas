import javax.swing.*;
import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");

        int figura = entrada.nextInt();

        switch (figura) {
            case 1 -> {
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado:"));
                System.out.println("El área del cuadrado es: " + Math.pow(lado, 2));
            }
            case 2 -> {
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura:"));
                System.out.println("El área del rectangulo es: " + base * altura);
            }
            case 3 -> {
                int base2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
                int altura2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura:"));
                System.out.println("El área del triángulo es: " + (base2 * altura2 / 2));
            }
            case 4 -> {
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio:"));
                System.out.println("El área del rectangulo es: " + Math.PI * radio);
            }
            default -> System.out.println("La opción elegida " + figura + " no es correcta");
        }
    }
}