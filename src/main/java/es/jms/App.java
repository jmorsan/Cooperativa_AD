package es.jms;

import es.jms.Fase1.Codificador;
import es.jms.Fase2.PintarFichero;
import es.jms.Fase3.TipoPrimitivos;
import es.jms.Fase4.WriteObjects;
import es.jms.Fase5.BusquedaParametizable;

import java.util.Scanner;

/**
 * Tarea Cooperativa
 *
 */
public class App 
{




    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        //Codificador.codificacion();
        //PintarFichero.pintarPersonas(scanner);
        //TipoPrimitivos.ficheroTipoPrimitivos();
        //WriteObjects.guardarObjetos();
        BusquedaParametizable.lecturaObjetos(scanner);

    }


}
