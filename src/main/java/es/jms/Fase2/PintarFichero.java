package es.jms.Fase2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PintarFichero
{
    public static void pintarPersonas(Scanner scanner)  {

        try {
            File myFile = new File("TextoLegible.txt");

            PrintWriter printWriter = new PrintWriter(myFile);
            String codigo;
            String nombre;
            String edad;
            String universidadId;
            String correo;
            String eleccion;

            System.out.println("Introduzca :");
            codigo = scanner.nextLine();
            System.out.println("Introduzca :");
            nombre = scanner.nextLine();
            System.out.println("Introduzca :");
            edad = scanner.nextLine();

            System.out.println("Es usted universitario?:");
            System.out.println("1 --> SI");
            System.out.println("2 --> NO");
            eleccion=scanner.nextLine();


            if(eleccion.equals("1")){
                System.out.println("Introduzca :");
                universidadId = scanner.nextLine();
                System.out.println("Introduzca :");
                correo = scanner.nextLine();
            }


            printWriter.println("\tCodigo\tNombre\tEdad\tuniversidadId\tCorreo\t");

        }
        catch(FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
        finally
        {

        }




    }
}
