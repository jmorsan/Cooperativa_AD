package es.jms.Fase3;

import java.io.*;
import java.util.StringTokenizer;

public class TipoPrimitivos {


    public static void ficheroTipoPrimitivos()
    {
        File myFile = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        StringTokenizer stringTokenizer = null;
        FileOutputStream fileOutputStream = null;
        DataOutputStream dataOutputStream = null;
        String palabra = "";


        try
        {
            myFile = new File("TextoLegible.txt");

            if(myFile.exists())
            {
                fileReader = new FileReader(myFile);
                bufferedReader = new BufferedReader(fileReader);
                fileOutputStream = new FileOutputStream("tipoPrimitivos.txt");
                dataOutputStream = new DataOutputStream(fileOutputStream);

                String frase = bufferedReader.readLine();

                while(frase !=null)
                {
                    stringTokenizer = new StringTokenizer(frase);

                    while (stringTokenizer.hasMoreTokens())
                    {
                        palabra=stringTokenizer.nextToken();

                        dataOutputStream.writeUTF(palabra);

                    }



                    frase = bufferedReader.readLine();
                }

                dataOutputStream.flush();


            }
            else
            {

                System.out.println("El fichero no existe");

            }


        }
        catch (IOException ioException)
        {

            System.out.println("Error en lectura del fichero");

        }
        finally
        {
            if( dataOutputStream != null )
            {
                try
                {
                    dataOutputStream.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }

            if(fileOutputStream != null)
            {
                try
                {
                    fileOutputStream.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }

            if(bufferedReader!=null)
            {
                try {

                    bufferedReader.close();

                }
                catch (Exception exception)
                {
                    exception.printStackTrace();
                }
            }
            if(fileReader!=null)
            {
                try {

                    fileReader.close();

                }
                catch (IOException ioException)
                {
                    ioException.printStackTrace();
                }
            }
        }

    }
}
