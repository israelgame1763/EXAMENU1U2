/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        import java.util.Scanner;

public class CalculadoraGananciaInstrumentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Precios de venta de los tres instrumentos
        double precioVentaCapo = 1250.45;
        double precioVentaCuerdasDeBajo = 3743.00;
        double precioVentaCuerdasParesGuitarra = 2683.78;

        // Solicitar al usuario el nombre del instrumento y el precio de compra
        System.out.print("Ingrese el nombre del instrumento (Capo, CuerdasDeBajo o CuerdasParesGuitarra): ");
        String nombreInstrumento = sc.nextLine();

        double precioCompra;

        // Validar que el nombre del instrumento sea válido
        switch (nombreInstrumento) {
            case "Capo":
                precioCompra = solicitarPrecioCompra(sc);
                calcularGanancia(nombreInstrumento, precioVentaCapo, precioCompra);
                break;
            case "CuerdasDeBajo":
                precioCompra = solicitarPrecioCompra(sc);
                calcularGanancia(nombreInstrumento, precioVentaCuerdasDeBajo, precioCompra);
                break;
            case "CuerdasParesGuitarra":
                precioCompra = solicitarPrecioCompra(sc);
                calcularGanancia(nombreInstrumento, precioVentaCuerdasParesGuitarra, precioCompra);
                break;
            default:
     
   
}
