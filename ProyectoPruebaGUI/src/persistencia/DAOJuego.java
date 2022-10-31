package persistencia;

import Utilidades.Archivo;

import java.util.ArrayList;

public class DAOJuego {

    private String Ruta = "ProyectoPruebaGUI\\src\\Utilidades\\datosJuego.txt";

    public void  GuardarInfoJuego(int numPartidas){

        String linea = "";

        linea = String.valueOf(numPartidas);

        new Archivo().AgregarContenido(Ruta, linea);

    }

public ArrayList<String> obtenerDatosJuego() {

    ArrayList<String> lista = new ArrayList<String>();
    ArrayList<String> DatosArchivo = new Archivo().ContenidoArchivo(Ruta);

    for (int i = 0; i < DatosArchivo.size(); i++) {

        String Linea = DatosArchivo.get(i);
        String [] lineaSeparada = Linea.split(",");

        String numPartidas = lineaSeparada[0];
        String puntaje = lineaSeparada[1];

        lista.add(numPartidas);
        lista.add(puntaje);

    }

    return lista;
}

}
