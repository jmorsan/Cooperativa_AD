package es.jms.Fase4;

import java.io.*;
import java.util.StringTokenizer;

public class WriteObjects {

    public static void guardarObjetos ()  {

        File file = null;
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        MyObjectOutputStream myObjectOutputStream = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        StringTokenizer stringTokenizer = null;

        String palabra="";
        int codigo=0;
        String nombre="";
        int edad=0;
        int universidadId=0;
        String correo="";
        int contador=0;


        try
        {
            file = new File("TextoLegible.txt");



            fileOutputStream = new FileOutputStream("Objetos.obj" ,true);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            fileReader = new FileReader("TextoLegible.txt");
            bufferedReader = new BufferedReader(fileReader);

            String frase = bufferedReader.readLine();

            while(frase !=null)
            {
                stringTokenizer = new StringTokenizer(frase);

                if(stringTokenizer.countTokens()>3){

                    contador=0;

                    while (stringTokenizer.hasMoreTokens())
                    {

                        palabra=stringTokenizer.nextToken();

                        if(contador==0)
                        {
                            codigo=Integer.parseInt(palabra);

                        }else if(contador==1) {

                            nombre = palabra;
                        }else if(contador==2) {

                            edad = Integer.parseInt(palabra);

                        }else if(contador==3) {

                            universidadId = Integer.parseInt(palabra);

                        }else if(contador==4) {

                            correo = palabra;

                        }


                        contador++;

                    }

                    PersonaUniversitaria personaUniversitaria = new PersonaUniversitaria(codigo,nombre,edad,universidadId,correo);
                    objectOutputStream.writeObject(personaUniversitaria);

                    objectOutputStream.flush();

                }else{

                    contador=0;

                    while (stringTokenizer.hasMoreTokens())
                    {

                        palabra=stringTokenizer.nextToken();

                        if(contador==0)
                        {
                            codigo=Integer.parseInt(palabra);

                        }else if(contador==1) {

                            nombre = palabra;
                        }else if(contador==2) {

                            edad = Integer.parseInt(palabra);

                        }


                        contador++;

                    }

                    Persona persona = new Persona(codigo,nombre,edad);
                    objectOutputStream.writeObject(persona);

                    objectOutputStream.flush();

                }

                frase = bufferedReader.readLine();
            }



        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException ioException)
        {
            ioException.printStackTrace();
        }
        finally
        {

            if(objectOutputStream != null)
            {
                try
                {
                    objectOutputStream.close();
                }
                catch (IOException ioException)
                {
                    ioException.printStackTrace();
                }

            }

            if(fileOutputStream != null)
            {
                try
                {
                    fileOutputStream.close();
                }
                catch (IOException ioException)
                {
                    ioException.printStackTrace();
                }
            }
        }
    }
}
