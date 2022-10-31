package persistencia;

import Utilidades.Archivo;

import java.util.ArrayList;

public class DAOUbiJugador {

    private String Ruta = "ProyectoPruebaGUI\\src\\Utilidades\\datosUbicacion.txt";

    public ArrayList<String> obtenerUbicaciones() {

        ArrayList<String> lista = new ArrayList<String>();
        ArrayList<String> DatosArchivo = new Archivo().ContenidoArchivo(Ruta);

        for (int i = 0; i < DatosArchivo.size(); i++) {

            String Linea = DatosArchivo.get(i);
            String [] lineaSeparada = Linea.split(",");

            String ubi = lineaSeparada[0];

            lista.add(ubi);

        }

        return lista;

    }

}
