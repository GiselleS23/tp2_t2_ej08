/* 8.- Hacer un programa que permita ingresar una fecha para luego mostrarla. Se debe validar que la fecha ingresada sea anterior a la fecha actual, en caso de que no cumplan con dicha condición se deberá mostrar un mensaje de error. Sacchetti Maria Giselle C2 */


 import java.util.Scanner;  
public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese una fecha (dd/mm/aaaa): ");
    String fecha = sc.nextLine();
    String[] partes = fecha.split("/");
    int dia = Integer.parseInt(partes[0]);
    int mes = Integer.parseInt(partes[1]);
    int anio = Integer.parseInt(partes[2]);
    if (anio < 2022) {
      System.out.println("La fecha ingresada es anterior a la fecha actual.");
    } else {
      System.out.println("La fecha ingresada no es anterior a la fecha actual.");
    }
    sc.close();
    
  }

}