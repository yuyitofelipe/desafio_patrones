import java.util.Scanner;
public class Patrones {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar al usuario el número de caracteres
            System.out.println("Ingrese el número de caracteres para cada patrón:");
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

            scanner.close();
        }

        // Método Patrón 1
        public static void patron1(int n) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
        }

        // Método Patrón 2
        public static void patron2(int n) {
            for (int i = 1; i <= n; i++) {
                int num;
                if (i % 4 == 0) {
                    num = 4;
                } else {
                    num = i % 4;
                }
                System.out.print(num);
            }
        }

    //Método Patrón 3
        public static void patron3(int n) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    System.out.print("||");
                } else {
                    System.out.print("*");
                }
            }
        }

    }
