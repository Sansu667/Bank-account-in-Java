import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldoDisponible = 1599.99;
        boolean esSalir = false;
        Scanner teclado = new Scanner(System.in);

        System.out.println("********************************");
        System.out.println("\nNombre del cliente: "+nombre);
        System.out.println("Tipo de cuenta: "+tipoCuenta);
        System.out.println("Saldo disponible: $"+saldoDisponible);


        while (esSalir == false) {
            System.out.println("\n********************************");
            System.out.println("""
                **Escriba el número de la opción deseada**
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """);

            int opcion = teclado.nextInt();
            if (opcion == 1){
                System.out.println("Su saldo es: $"+saldoDisponible);
            } else if (opcion == 2) {
                System.out.println("¿Cuánto dinero quiere retirar?");
                double valorUsuario = teclado.nextDouble();
                if (valorUsuario > saldoDisponible || valorUsuario <= 0){
                    System.out.println("Saldo insuficiente");
                } else {
                    saldoDisponible = saldoDisponible - valorUsuario;
                    System.out.println("Retiro exitoso. Saldo restante: $"+ saldoDisponible);
                }
            } else if (opcion == 3) {
                System.out.println("¿Cuánto dinero quiere depositar?");
                double valorUsuarioDeposito = teclado.nextDouble();
                if (valorUsuarioDeposito <= 0){
                    System.out.println("Depósito incorrecto. Realice un depósito superior a $0");
                } else {
                    saldoDisponible = saldoDisponible + valorUsuarioDeposito;
                    System.out.println("Depósito exitoso. Saldo actual: $"+ saldoDisponible);
                }
            } else if (opcion == 9) {
                System.out.println("¡Gracias por utilizar Sansu Bank!");
                esSalir = true;
            } else {
                System.out.println("Opción incorrecta");
            }
        }
    }
}