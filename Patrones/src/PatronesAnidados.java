import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un numero

        System.out.println("Ingrese el valor de n para los patrones:");
        int n = scanner.nextInt();

        // Patrón 1
        System.out.println("\nPatrón 1:");
        patron1(n);

        // Patrón 2
        System.out.println("\nPatrón 2:");
        patron2(n);

        // Patrón 3
        System.out.println("\nPatrón 3:");
        patron3(n);

        // Patrón 4
        System.out.println("\nPatrón 4:");
        patron4(n);

        scanner.close();
    }

    // Método para el Patrón 1
    public static void patron1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    // Método para el Patrón 2
    public static void patron2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    // Método para el Patrón 3
    public static void patron3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || j == n - i - 1) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    // Método  Patrón 4
    public static void patron4(int n) {
        if (n == 1) {
            System.out.println("*");
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print("*");
        }
        System.out.println();
        if (n == 2) {
            System.out.println(" *");
            return;
        }
        for (int i = 1; i < n - 1; i++) {
            System.out.print(" ");
            for (int j = 1; j < n - 1; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.print(" ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print("*");
        }
        System.out.println("*");
    }
}

