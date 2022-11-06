package es.jms.Fase2;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class PintarFichero
{
    public static void pintarPersonas(Scanner scanner)  {
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        try
        {
            File myFile = new File("TextoLegible.txt");

            fileWriter = new FileWriter(myFile);

            printWriter = new PrintWriter(fileWriter);

            //printWriter.println("\tCodigo\tNombre\tEdad\tuniversidadId\tCorreo\t");

            String codigo;
            String nombre;
            String edad;
            String universidadId;
            String correo;
            String eleccion;

            boolean salir= false;

            do
            {
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


                if(eleccion.equals("1"))
                {
                    System.out.println("Introduzca :");
                    universidadId = scanner.nextLine();
                    System.out.println("Introduzca :");
                    correo = scanner.nextLine();

                    printWriter.println("  "+codigo+"  "+nombre+"  "+edad+"  "+universidadId+"  "+correo+"  ");

                }else{

                    printWriter.println("  "+codigo+"  "+nombre+"  "+edad+"  ");

                }




                System.out.println("Quiere crear mas personas?:");
                System.out.println("1 --> SI");
                System.out.println("2 --> NO");
                eleccion=scanner.nextLine();

                if(eleccion.equals("2")){

                    salir=true;

                }

                printWriter.flush();

            }while(!salir);




        }
        catch(FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException ioException)
        {
            ioException.printStackTrace();

        }
        finally
        {

        }




    }
}
