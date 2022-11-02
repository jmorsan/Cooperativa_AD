package es.jms;

import es.jms.Fase2.PintarFichero;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    static Scanner scanner;

    public App()
    {
        this.scanner = new Scanner(System.in);;
    }

    public static void main( String[] args )
    {
        PintarFichero.pintarPersonas(scanner);
    }
}
