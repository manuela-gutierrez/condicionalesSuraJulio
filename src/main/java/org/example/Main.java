package org.example;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner entradaTeclado=new Scanner(System.in);

        int anioNacimientoCliente;
        int anioActual;
        String nombresCompletosCliente;
        double salarioCliente;
        String licorFavoritoCLiente;
        String cantanteFavoritoCliente;
        double valorIva;
        byte numeroMesa;
        double valorDescuento;

        //ASIGNANDO VARIABLES
        System.out.print("Digita tus nombres y apellidos: ");
        nombresCompletosCliente=entradaTeclado.nextLine();

        System.out.print("Digita tu licor favorito: ");
        licorFavoritoCLiente=entradaTeclado.nextLine();

        System.out.print("Digita tu cantante favorito: ");
        cantanteFavoritoCliente=entradaTeclado.nextLine();


        System.out.print("Digite su año de nacimiento: ");
        anioNacimientoCliente=entradaTeclado.nextInt();

        System.out.print("Digite el año actual: ");
        anioActual=entradaTeclado.nextInt();

        System.out.print("Digita el salario del cliente: ");
        salarioCliente=entradaTeclado.nextInt();

        System.out.print("Valor del IVA: ");
        valorIva=entradaTeclado.nextDouble();

        System.out.print("valor del descuento: ");
        valorDescuento=entradaTeclado.nextDouble();

        System.out.print("Numero de la mesa del cliente: ");
        numeroMesa=entradaTeclado.nextByte();

        //PROCESOS DEL ALGORITMO

        //1.CLACULAR LA EDAD DEL USUARIO
        int edadUsuario=anioActual-anioNacimientoCliente;

        System.out.println("Apreciado "+nombresCompletosCliente+" usted tiene "+edadUsuario+" años");

        //2.COMPARAR Y DECIDIR SOBRE EL SALARIO
        final double valorSalarioMinimo=1300000;

      double numerosalarios=salarioCliente/valorSalarioMinimo;
        System.out.println("Usted gana "+salarioCliente+" SMLV");

        //redondear las cifras decimales
        //PRIMERA FORMA
       DecimalFormatSymbols simbolo=new DecimalFormatSymbols();
       simbolo.setDecimalSeparator('.');
       DecimalFormat formato = new DecimalFormat("0.00",simbolo);
       String numeroSalarioFormato= formato.format(numerosalarios);
       System.out.println("usted gana: "+numeroSalarioFormato+"SMLV");
        //SEGUNDA FORMA
        String formatoDos=String.format("%,2f",numerosalarios);
        System.out.println("usted gana: "+formatoDos+" SMLV");

        //CONDICION LOGICA PARA VALIDAR SI TIENE PLATA
        if (numerosalarios>=3.0){
            //camino de verdad
            System.out.println("Bienvenido patrón");
        }else{
            //camino negacion
            System.out.println("Chao arrastrado");
        }
        
    }

}