package Modelo;

import Control.Control;
import persistencia.DAOJuego;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Juego implements Runnable{

    private Jugador jugadorsito;
    private int numPartidas ;
    private int puntaje;
    private int puntosLanzamiento;
    private int sumaPuntaje;
    private int puntajeRestante;
    private int dadoUno;
    private int dadoDos;
    int puntajeInicial = 100;
    int puntos = 0;
    private JLabel jlNombre;
    private JLabel jlUbicacion ;
    private JLabel jlPuntosLanzamiento;
    private JLabel jlSumaPuntaje;
    private JLabel jlPuntajeRestante;

    private Control control;
    //private ArrayList<String> nomJugadores;
    //private ArrayList<String> ubicaciones;
    private ArrayList<Jugador> listaJugadores;

    public Juego(Jugador jugador, JLabel nombre, JLabel ubicacion, JLabel puntosLanzamiento, JLabel sumaPuntaje, JLabel puntajeRestante) {

        this.jugadorsito = jugador;
        this.jlNombre = nombre;
        this.jlUbicacion = ubicacion;
        this.jlPuntosLanzamiento = puntosLanzamiento;
        this.jlSumaPuntaje = sumaPuntaje;
        this.jlPuntajeRestante = puntajeRestante;
        control = new Control();
        datosJuego();

    }

    public Juego(Jugador player) {
        control = new Control();
        jugadorsito = new Jugador(control.seleccionNombre(),control.seleccionUbicacion());
        datosJuego();
    }

    private void datosJuego(){

        ArrayList<String> datosjuego = new DAOJuego().obtenerDatosJuego();

        for (int i = 0; i < datosjuego.size(); i++) {

            this.numPartidas = Integer.parseInt(datosjuego.get(0));
            this.puntaje = Integer.parseInt(datosjuego.get(1));

        }

    }

    @Override
    public void run() {
        int restante=100;
        while (sumaPuntaje<puntaje) {
            lanzamientoDados();
            System.out.println("Nombre: " + jugadorsito.getNombre() + " Ubicacion: " + jugadorsito.getUbicacion() + " dado uno " + dadoUno +" dado dos " + dadoDos + " puntaje dados " + puntosLanzamiento + " cumulo puntaje " + sumaPuntaje);
            jlNombre.setText(jugadorsito.getNombre());
            jlUbicacion.setText(jugadorsito.getUbicacion());
            jlPuntosLanzamiento.setText(String.valueOf(puntosLanzamiento));
            jlSumaPuntaje.setText(String.valueOf(sumaPuntaje));
            restante = restante - puntosLanzamiento;
            if (sumaPuntaje>=100){
                sumaPuntaje=puntaje;
                restante=0;
            }
            jlPuntajeRestante.setText(String.valueOf(restante));
            try {
                Thread.sleep((long) (Math.random() * 1000) + 1100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private void lanzamientoDados() {

        dadoUno = (int) (Math.random() * 6 + 1);
        dadoDos = (int) (Math.random() * 6 + 1);
        setPuntosLanzamiento((dadoUno + dadoDos) * 2);
        this.sumaPuntaje = puntos + puntosLanzamiento;
        puntos = sumaPuntaje;

    }

    public Jugador getJugadorsito() {return jugadorsito; }

    public void setJugadorsito(Jugador jugadorsito) {this.jugadorsito = jugadorsito; }

    public int getPuntosLanzamiento() {return puntosLanzamiento;}
    public void setPuntosLanzamiento(int puntosLanzamiento) {this.puntosLanzamiento = puntosLanzamiento;}

    public ArrayList<Jugador> getListaJugadores() {return listaJugadores;}

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {this.listaJugadores = listaJugadores;}

    public int getSumaPuntaje() {return sumaPuntaje;}

    public void setSumaPuntaje(int sumaPuntaje) {this.sumaPuntaje = sumaPuntaje;}

    public int getPuntajeRestante() {return puntajeRestante;}

    public void setPuntajeRestante(int puntajeRestante) {this.puntajeRestante = puntajeRestante;}
}
