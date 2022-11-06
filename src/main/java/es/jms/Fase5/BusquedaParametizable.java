package es.jms.Fase5;

import es.jms.Fase4.Persona;
import es.jms.Fase4.PersonaUniversitaria;

import java.io.*;
import java.util.Scanner;

public class BusquedaParametizable {

    public static void lecturaObjetos(Scanner scanner) {

        int seleccion = 0;
        boolean salir= false;
        int codigo=0;
        String nombre="";
        int edad=0;
        int universidadId=0;
        String correo="";

        do
        {
            System.out.println("Seleccione un parametro de busqueda ");
            System.out.println("1 -> Codigo");
            System.out.println("2 -> Nombre: ");
            System.out.println("3 -> Edad : ");
            System.out.println("4 -> ID Universidad");
            System.out.println("5 -> Correo: ");
            System.out.println("0 -> Salir ");

            seleccion = Integer.parseInt(scanner.nextLine());



            switch (seleccion)
            {
                case 1:

                    System.out.println("Introduzca Codigo:  ");
                    codigo=Integer.parseInt(scanner.nextLine());
                    busquedaCodigo(codigo);
                    break;

                case 2:

                    System.out.println("Introduzca Nombre:  ");
                    nombre=scanner.nextLine();
                    busquedaNombre(nombre);
                    break;

                case 3:

                    System.out.println("Introduzca Edad:  ");
                    edad=Integer.parseInt(scanner.nextLine());
                    busquedaEdad(edad);
                    break;

                case 4:

                    System.out.println("Introduzca ID Universidad:  ");
                    universidadId=Integer.parseInt(scanner.nextLine());
                    busquedaUniversidadID(universidadId);
                    break;

                case 5:

                    System.out.println("Introduzca Correo:  ");
                    correo=scanner.nextLine();
                    busquedaCorreo(correo);
                    break;

                case 0:
                    salir= true;
                    System.out.println("Adiuuus");

            }
        }
        while(!salir);


    }

    public static void busquedaCodigo(int codigo){

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;


        try {

            fileInputStream = new FileInputStream("Objetos.obj");
            objectInputStream = new ObjectInputStream(fileInputStream);

            while (true) {

                Persona persona = (Persona) objectInputStream.readObject();


                if(persona instanceof PersonaUniversitaria){

                    if(persona.getCodigo()==codigo){

                        System.out.println("Codigo: "+persona.getCodigo()+" ,Nombre: "+persona.getNombre()+ " ,Edad: "+
                                persona.getEdad()+" ,ID Universidad: "+((PersonaUniversitaria) persona).getUniversidadId()+" ,Correo: "+
                                ((PersonaUniversitaria) persona).getCorreo());
                    }

                }else {

                    if(persona.getCodigo()==codigo){

                        System.out.println("Codigo: "+persona.getCodigo()+" ,Nombre: "+persona.getNombre()+ " ,Edad: "+
                                persona.getEdad());

                    }

                }
            }
        }
        catch (EOFException eofException)
        {
            System.out.println("\nFin alumnos");
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException ioException)
        {
            ioException.printStackTrace();
        }
        catch(ClassNotFoundException classNotFoundException)
        {
            classNotFoundException.printStackTrace();
        }
        finally
        {

            if(objectInputStream != null)
            {
                try
                {
                    objectInputStream.close();
                }
                catch (IOException ioException)
                {
                    ioException.printStackTrace();
                }

            }

            if(fileInputStream != null)
            {
                try
                {
                    fileInputStream.close();
                }
                catch (IOException ioException)
                {
                    ioException.printStackTrace();
                }
            }
        }

    }

    public static void busquedaNombre(String nombre){

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;


        try {

            fileInputStream = new FileInputStream("Objetos.obj");
            objectInputStream = new ObjectInputStream(fileInputStream);

            while (true) {

                Persona persona = (Persona) objectInputStream.readObject();


                if(persona instanceof PersonaUniversitaria){

                    if(persona.getNombre().equals(nombre)){

                        System.out.println("Codigo: "+persona.getCodigo()+" ,Nombre: "+persona.getNombre()+ " ,Edad: "+
                                persona.getEdad()+" ,ID Universidad: "+((PersonaUniversitaria) persona).getUniversidadId()+" ,Correo: "+
                                ((PersonaUniversitaria) persona).getCorreo());

                    }

                }else {

                    if(persona.getNombre().equals(nombre)){

                        System.out.println("Codigo: "+persona.getCodigo()+" ,Nombre: "+persona.getNombre()+ " ,Edad: "+
                                persona.getEdad());

                    }

                }
            }
        }
        catch (EOFException eofException)
        {
            System.out.println("\nFin alumnos");
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException ioException)
        {
            ioException.printStackTrace();
        }
        catch(ClassNotFoundException classNotFoundException)
        {
            classNotFoundException.printStackTrace();
        }
        finally
        {

            if(objectInputStream != null)
            {
                try
                {
                    objectInputStream.close();
                }
                catch (IOException ioException)
                {
                    ioException.printStackTrace();
                }

            }

            if(fileInputStream != null)
            {
                try
                {
                    fileInputStream.close();
                }
                catch (IOException ioException)
                {
                    ioException.printStackTrace();
                }
            }
        }

    }

    public static void busquedaEdad(int edad){

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;


        try {

            fileInputStream = new FileInputStream("Objetos.obj");
            objectInputStream = new ObjectInputStream(fileInputStream);

            while (true) {

                Persona persona = (Persona) objectInputStream.readObject();


                if(persona instanceof PersonaUniversitaria){

                    if(persona.getEdad()==edad){

                        System.out.println("Codigo: "+persona.getCodigo()+" ,Nombre: "+persona.getNombre()+ " ,Edad: "+
                                persona.getEdad()+" ,ID Universidad: "+((PersonaUniversitaria) persona).getUniversidadId()+" ,Correo: "+
                                ((PersonaUniversitaria) persona).getCorreo());

                    }

                }else {

                    if(persona.getEdad()==edad){

                        System.out.println("Codigo: "+persona.getCodigo()+" ,Nombre: "+persona.getNombre()+ " ,Edad: "+
                                persona.getEdad());

                    }

                }
            }
        }
        catch (EOFException eofException)
        {
            System.out.println("\nFin alumnos");
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException ioException)
        {
            ioException.printStackTrace();
        }
        catch(ClassNotFoundException classNotFoundException)
        {
            classNotFoundException.printStackTrace();
        }
        finally
        {

            if(objectInputStream != null)
            {
                try
                {
                    objectInputStream.close();
                }
                catch (IOException ioException)
                {
                    ioException.printStackTrace();
                }

            }

            if(fileInputStream != null)
            {
                try
                {
                    fileInputStream.close();
                }
                catch (IOException ioException)
                {
                    ioException.printStackTrace();
                }
            }
        }

    }

    public static void busquedaUniversidadID(int universidadID){

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;


        try {

            fileInputStream = new FileInputStream("Objetos.obj");
            objectInputStream = new ObjectInputStream(fileInputStream);

            while (true) {

                Persona persona = (Persona) objectInputStream.readObject();


                if(persona instanceof PersonaUniversitaria){

                    if(((PersonaUniversitaria) persona).getUniversidadId()==universidadID){

                        System.out.println("Codigo: "+persona.getCodigo()+" ,Nombre: "+persona.getNombre()+ " ,Edad: "+
                                persona.getEdad()+" ,ID Universidad: "+((PersonaUniversitaria) persona).getUniversidadId()+" ,Correo: "+
                                ((PersonaUniversitaria) persona).getCorreo());

                    }
                }
            }
        }
        catch (EOFException eofException)
        {
            System.out.println("\nFin alumnos");
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException ioException)
        {
            ioException.printStackTrace();
        }
        catch(ClassNotFoundException classNotFoundException)
        {
            classNotFoundException.printStackTrace();
        }
        finally
        {

            if(objectInputStream != null)
            {
                try
                {
                    objectInputStream.close();
                }
                catch (IOException ioException)
                {
                    ioException.printStackTrace();
                }

            }

            if(fileInputStream != null)
            {
                try
                {
                    fileInputStream.close();
                }
                catch (IOException ioException)
                {
                    ioException.printStackTrace();
                }
            }
        }

    }

    public static void busquedaCorreo(String correo){

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;


        try {

            fileInputStream = new FileInputStream("Objetos.obj");
            objectInputStream = new ObjectInputStream(fileInputStream);

            while (true) {

                Persona persona = (Persona) objectInputStream.readObject();


                if(persona instanceof PersonaUniversitaria){

                    if(((PersonaUniversitaria) persona).getCorreo().equals(correo)){

                        System.out.println("Codigo: "+persona.getCodigo()+" ,Nombre: "+persona.getNombre()+ " ,Edad: "+
                                persona.getEdad()+" ,ID Universidad: "+((PersonaUniversitaria) persona).getUniversidadId()+" ,Correo: "+
                                ((PersonaUniversitaria) persona).getCorreo());

                    }
                }
            }
        }
        catch (EOFException eofException)
        {
            System.out.println("\nFin alumnos");
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException ioException)
        {
            ioException.printStackTrace();
        }
        catch(ClassNotFoundException classNotFoundException)
        {
            classNotFoundException.printStackTrace();
        }
        finally
        {

            if(objectInputStream != null)
            {
                try
                {
                    objectInputStream.close();
                }
                catch (IOException ioException)
                {
                    ioException.printStackTrace();
                }

            }

            if(fileInputStream != null)
            {
                try
                {
                    fileInputStream.close();
                }
                catch (IOException ioException)
                {
                    ioException.printStackTrace();
                }
            }
        }

    }

}
