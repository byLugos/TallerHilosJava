package persistencia;

import Utilidades.Archivo;

import java.util.ArrayList;

public class DAONameJugadores {

    private String Ruta = "ProyectoPruebaGUI\\src\\Utilidades\\datosNameJugadores.txt";

    public ArrayList<String> obtenerNombreJugador() {

        ArrayList<String> lista = new ArrayList<String>();
        ArrayList<String> DatosArchivo = new Archivo().ContenidoArchivo(Ruta);

        for (int i = 0; i < DatosArchivo.size(); i++) {

            String Linea = DatosArchivo.get(i);
            String [] lineaSeparada = Linea.split(",");

            String nombre = lineaSeparada[0];

            lista.add(nombre);

        }

        return lista;

    }

}
