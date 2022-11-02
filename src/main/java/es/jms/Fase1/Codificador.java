package es.jms.Fase1;


import java.io.*;


public class Codificador {

    public void codificacion()
    {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;


        try
        {

            fileReader = new FileReader("Información cifrada.txt");
            bufferedReader = new BufferedReader(fileReader);



            String frase = bufferedReader.readLine();

            while(frase !=null)
            {
                int decodificador;
                if(frase.charAt(0) == '+')
                {
                   decodificador=0;
                    for(int i=1; i<frase.length();i++)
                    {
                        if(Character.isDigit(frase.charAt(i)))
                        {
                            String numero =""+ frase.charAt(i);
                            decodificador += Integer.parseInt(numero);
                        }
                    }

                    decodificarLinea(decodificador , frase);

                }
                else
                {
                    decodificador = 1;
                    for(int i=1; i<frase.length();i++)
                    {
                        if(Character.isDigit(frase.charAt(i)))
                        {
                            String numero =""+ frase.charAt(i);
                            decodificador *= Integer.parseInt(numero);

                        }
                    }

                    decodificarLinea(decodificador , frase);
                }

                frase = bufferedReader.readLine();

            }

        }
        catch (IOException ioException)
        {

            System.out.println("Error en lectura del fichero");

        }
        finally
        {
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

    private static void decodificarLinea(int decodificador, String frase) {
        for(int i=1;i<frase.length();i++)
        {
            if(!Character.isDigit(frase.charAt(i)))
                System.out.print((char)((int)frase.charAt(i)-decodificador));
        }
        System.out.println();
    }
}
