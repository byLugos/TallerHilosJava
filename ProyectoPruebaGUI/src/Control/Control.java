package Control;

import persistencia.DAONameJugadores;
import persistencia.DAOUbiJugador;

import java.util.ArrayList;

public class Control {

    private ArrayList<String> nomJugadores;
    private ArrayList<String> ubicaciones;


    public Control() {
        nomJugadores = new DAONameJugadores().obtenerNombreJugador();
        ubicaciones = new DAOUbiJugador().obtenerUbicaciones();
    }

    public String seleccionNombre() {
        int nom = (int) ((Math.random() * nomJugadores.size()));
        String nombre = "";
        for (int i = 0; i < nomJugadores.size(); i++) {
            nombre = nomJugadores.get(nom);
        }
        return nombre;
    }

    public String seleccionUbicacion() {
        int ubi = (int) ((Math.random() * ubicaciones.size()));
        String ubicacion = "";
        for (int i = 0; i < ubicaciones.size(); i++) {
            ubicacion = ubicaciones.get(ubi);
        }
        return ubicacion;
    }


}
