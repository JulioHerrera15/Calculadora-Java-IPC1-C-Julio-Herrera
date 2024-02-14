import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        
        System.out.print("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingresa la operacion que deseas realizar (1. Suma, 2. Resta, 3. Multiplicacion, 4. Division): ");
        int operacion = scanner.nextInt();

        switch(operacion){
            case 1:
                System.out.println("El resultado de la suma es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicacion es: " + (num1 * num2));
                break;
            case 4:
                System.out.println("El resultado de la division es: " + (num1 / num2));
                break;
            default:
                System.out.println("Operacion no valida");
        }


        
    }
}
