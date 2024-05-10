/* 8.- Hacer un programa que permita ingresar una fecha para luego mostrarla. Se debe validar que la fecha ingresada sea anterior a la fecha actual, en caso de que no cumplan con dicha condición se deberá mostrar un mensaje de error. Sacchetti Maria Giselle C2 */
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese la fecha actual (dd/mm/aaaa): ");
    int diaActual = sc.nextInt();
    int mesActual = sc.nextInt();
    int anioActual = sc.nextInt();

    System.out.println("Ingrese la fecha a validar (dd/mm/aaaa): ");
    int dia = sc.nextInt();
    int mes = sc.nextInt();
    int anio = sc.nextInt();

    if (anio < anioActual || (anio == anioActual && mes < mesActual) || (anio == anioActual && mes == mesActual && dia < diaActual)) {
      System.out.println("La fecha ingresada es anterior a la fecha actual.");
    } else {
      System.out.println("La fecha ingresada no es anterior a la fecha actual.");
    }

    sc.close();
  }
}
