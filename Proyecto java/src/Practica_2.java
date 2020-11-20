import java.util.Scanner;
public class Practica_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 2 números enteros positivos");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int suma= num1+num2;
        int resta= num1-num2;
        int multiplicación= num1*num2;
        int división= num1/num2;
        if(num1<0 || num2<0){
            System.out.println("Números no válidos");
        }else {
            System.out.println("¿Qué quieres hacer con ellos? Introduce el símbolo correspondiente (+,-,*,/)");
            String operación =  sc.next();
            switch (operación) {
                case "+":
                    System.out.println("El resultado es: " + suma);
                    break;
                case "-":
                    System.out.println("El resultado es: " + resta);
                    break;
                case "*":
                    System.out.println("El resultado es: " + multiplicación);
                    break;
                case "/":
                    System.out.println("El resultado es: " + división);
                    break;
                default:
                    System.out.println("El símbolo introducido no corresponde a ninguna operación");
            }
        }

    }
}
