import java.util.Scanner;

public class desafio {

    public static void main(String[] args) {
        String nombre = " Sofia Ramirez";
        String tipoDeCuenta = "Corriente";
        Double saldo = 1599.99;
        int opcion = 0;

        System.out.println("****************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("su saldo disponible es: " + saldo);
        System.out.println("\n**************************************");

        String menu = """
                *** Escribe el numero de la opcion deseada ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es : " + saldo);
                    break;
                case 2:
                    System.out.println("¿Cual es el valor que desea retirar?");
                    double valorAretirar = teclado.nextDouble();
                    if ( valorAretirar > saldo){
                        System.out.println("Saldo insuficiente");

                    }else {
                     saldo = saldo - valorAretirar;
                        System.out.println("El saldo actualizado es : " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("¿Cual es el valor que desea depositar?");
                    double valorAdepositar = teclado.nextDouble();
                    saldo = saldo + valorAdepositar;
                    System.out.println("El saldo actualizado es : " + saldo);
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servivios");
                    break;
                default:
                    System.out.println("opcion no valida");

            }
        }
    }
}
