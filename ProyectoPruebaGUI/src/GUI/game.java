package GUI;

import Control.Control;
import Modelo.Juego;
import Modelo.Jugador;
import Modelo.reloj;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class game extends JFrame {
    private Juego jUno;
    private Juego jDos;
    private Juego jTres;
    private Juego jCuatro;
    private Juego jCinco;
    GridBagConstraints gbc = new GridBagConstraints();

    private JPanel jpIndex;
    private JLabel jlTittle;
    private JPanel jpJugadores;
    private JButton btnStart;
    private JLabel jlPlayerOne;
    private JLabel jlPlayerTwo;
    private JLabel jlPlayerThree;
    private JLabel jlPlayerFour;
    private JLabel jlPlayerFive;
    private ImageIcon imgLogo;
    JProgressBar jpbPuntajeOne = new JProgressBar();
    //JProgressBar jpbPuntajeTwo = new JProgressBar();
    //JProgressBar jpbPuntajeThree = new JProgressBar();
    //JProgressBar jpbPuntajeFour = new JProgressBar();
    //JProgressBar jpbPuntajeFive = new JProgressBar();
    private JLabel jlName1;
    private JLabel jlName2;
    private JLabel jlName3;
    private JLabel jlName4;
    private JLabel jlName5;

    private JLabel jlUbicacion1;
    private JLabel jlUbicacion2;
    private JLabel jlUbicacion3;
    private JLabel jlUbicacion4;
    private JLabel jlUbicacion5;

    private JLabel jlHour1;
    private JLabel jlHour2;
    private JLabel jlHour3;
    private JLabel jlHour4;
    private JLabel jlHour5;

    private JLabel jlNumberGames1;
    private JLabel jlNumberGames2;
    private JLabel jlNumberGames3;
    private JLabel jlNumberGames4;
    private JLabel jlNumberGames5;

    private JLabel jlNumberPiches1;
    private JLabel jlNumberPiches2;
    private JLabel jlNumberPiches3;
    private JLabel jlNumberPiches4;
    private JLabel jlNumberPiches5;

    private JLabel jlPichesScores1;
    private JLabel jlPichesScores2;
    private JLabel jlPichesScores3;
    private JLabel jlPichesScores4;
    private JLabel jlPichesScores5;
    private JLabel jlProgressOne;
    private JLabel jlProgressFive;
    private JLabel jlProgress1;
    private JLabel jlProgress2;
    private JLabel jlProgress3;
    private JLabel jlProgress4;
    private JLabel jlProgress5;

    private Control control = new Control();

    public game() {

        setTitle("Rapidos y Furiosos");
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(500,500,500,500);
        //add(panelJuego());

        imgLogo = new ImageIcon("ProyectoPruebaGUI\\src\\Recursos\\rapidosFuriosos.png");
        setIconImage(imgLogo.getImage());
        beguinJugadores();
    }

    private void beguinJugadores() {

        //-------------------------------------------------------------------------------

        jlTittle = new JLabel("Rapidos y Furiosos");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 10;
        add(jlTittle, gbc);

        //JUGADOR 1------------------------------------------------------------------

        jlPlayerOne = new JLabel("JUGADOR 1");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        add(jlPlayerOne, gbc);

        JLabel jlNameOne = new JLabel("Nombre: ");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(jlNameOne, gbc);

        jlName1 = new JLabel();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(jlName1, gbc);

        JLabel jlUbicacionOne = new JLabel("Ubicacion: ");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        add(jlUbicacionOne, gbc);

        jlUbicacion1 = new JLabel();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        add(jlUbicacion1, gbc);

        JLabel jlHourOne = new JLabel("Hora: ");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        add(jlHourOne, gbc);

        jlHour1 = new JLabel();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        add(jlHour1, gbc);

        JLabel jlNumberGamesOne = new JLabel("Numero partida: ");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        add(jlNumberGamesOne, gbc);

        jlNumberGames1 = new JLabel();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        add(jlNumberGames1, gbc);

        JLabel jlNumberPichesOne = new JLabel("Puntaje lanzamiento:");
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        add(jlNumberPichesOne, gbc);

        jlNumberPiches1 = new JLabel();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        add(jlNumberPiches1, gbc);

        JLabel jlPichesScoresOne = new JLabel("Puntaje acumulado");
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        add(jlPichesScoresOne, gbc);

        jlPichesScores1 = new JLabel();
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        add(jlPichesScores1, gbc);


        jlProgressOne = new JLabel("Puntaje restante");
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        add(jlProgressOne, gbc);

        jlProgress1 = new JLabel();
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        add(jlProgress1, gbc);

        //-----------------------------------------------------------------------------------------------

        Jugador playerUno = new Jugador(control.seleccionNombre(), control.seleccionUbicacion());
        jUno = new Juego(playerUno, jlName1, jlUbicacion1, jlNumberPiches1,
                jlPichesScores1, jlProgress1);
        Thread th1 = new Thread(jUno);
        //th1.start();

        reloj r1 = new reloj(playerUno.getUbicacion(), jlHour1);
        Thread th11 = new Thread(r1);
        th11.start();

        // JUGADOR 2 -------------------------------------------------------------------

        jlPlayerTwo = new JLabel("JUGADOR 2");
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        add(jlPlayerTwo, gbc);

        JLabel jlNameTwo = new JLabel("Nombre: ");
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(jlNameTwo, gbc);

        jlName2 = new JLabel();
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(jlName2, gbc);

        JLabel jlUbicacionTwo = new JLabel("Ubicacion: ");
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        add(jlUbicacionTwo, gbc);

        jlUbicacion2 = new JLabel();
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        add(jlUbicacion2, gbc);

        JLabel jlHourTwo = new JLabel("Hora: ");
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        add(jlHourTwo, gbc);

        jlHour2 = new JLabel();
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        add(jlHour2, gbc);

        JLabel jlNumberGamesTwo = new JLabel("Numero partida: ");
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        add(jlNumberGamesTwo, gbc);

        jlNumberGames2 = new JLabel();
        gbc.gridx = 3;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        add(jlNumberGames2, gbc);

        JLabel jlNumberPichesTwo = new JLabel("Puntaje lanzamiento:");
        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        add(jlNumberPichesTwo, gbc);

        jlNumberPiches2 = new JLabel();
        gbc.gridx = 3;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        add(jlNumberPiches2, gbc);

        JLabel jlPichesScoresTwo = new JLabel("Puntaje acumulado");
        gbc.gridx = 2;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        add(jlPichesScoresTwo, gbc);

        jlPichesScores2 = new JLabel();
        gbc.gridx = 3;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        add(jlPichesScores2, gbc);


        JLabel jlProgressTwo = new JLabel("Puntaje restante");
        gbc.gridx = 2;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        add(jlProgressTwo, gbc);

        jlProgress2 = new JLabel();
        gbc.gridx = 3;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        add(jlProgress2, gbc);

        //-----------------------------------------------------------------------------------------------

        Jugador playerTwo = new Jugador(control.seleccionNombre(), control.seleccionUbicacion());
        jDos = new Juego(playerTwo, jlName2, jlUbicacion2,
                jlNumberPiches2, jlPichesScores2, jlProgress2);
        Thread th2 = new Thread(jDos);
        //th2.start();


        reloj r2 = new reloj(playerTwo.getUbicacion(), jlHour2);
        Thread th22 = new Thread(r2);
        th22.start();

        //JUGADOR 3------------------------------------------------------------------------

        jlPlayerThree = new JLabel("JUGADOR 3");
        gbc.gridx = 4;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        add(jlPlayerThree, gbc);

        JLabel jlNameThree = new JLabel("Nombre: ");
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(jlNameThree, gbc);

        jlName3 = new JLabel();
        gbc.gridx = 5;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(jlName3, gbc);

        JLabel jlUbicacionThree = new JLabel("Ubicacion: ");
        gbc.gridx = 4;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        add(jlUbicacionThree, gbc);

        jlUbicacion3 = new JLabel();
        gbc.gridx = 5;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        add(jlUbicacion3, gbc);

        JLabel jlHourThree = new JLabel("Hora: ");
        gbc.gridx = 4;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        add(jlHourThree, gbc);

        jlHour3 = new JLabel();
        gbc.gridx = 5;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        add(jlHour3, gbc);

        JLabel jlNumberGamesThree = new JLabel("Numero partida: ");
        gbc.gridx = 4;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        add(jlNumberGamesThree, gbc);

        jlNumberGames3 = new JLabel();
        gbc.gridx = 5;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        add(jlNumberGames3, gbc);

        JLabel jlNumberPichesThree = new JLabel("Puntaje lanzamiento:");
        gbc.gridx = 4;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        add(jlNumberPichesThree, gbc);

        jlNumberPiches3 = new JLabel();
        gbc.gridx = 5;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        add(jlNumberPiches3, gbc);

        JLabel jlPichesScoresThree = new JLabel("Puntaje acumulado");
        gbc.gridx = 4;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        add(jlPichesScoresThree, gbc);

        jlPichesScores3 = new JLabel();
        gbc.gridx = 5;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        add(jlPichesScores3, gbc);


        JLabel jlProgressThree = new JLabel("Puntaje restante");
        gbc.gridx = 4;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        add(jlProgressThree, gbc);

        jlProgress3 = new JLabel();
        gbc.gridx = 5;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        add(jlProgress3, gbc);

        //-----------------------------------------------------------------------------------------------

        Jugador playerThree = new Jugador(control.seleccionNombre(), control.seleccionUbicacion());
        jTres = new Juego(playerThree, jlName3, jlUbicacion3,
                jlNumberPiches3, jlPichesScores3, jlProgress3);
        Thread th3 = new Thread(jTres);
        //th3.start();

        reloj r3 = new reloj(playerThree.getUbicacion(), jlHour3);
        Thread th33 = new Thread(r3);
        th33.start();


        //JUGADOR 4-----------------------------------------------------------------------------

        jlPlayerFour = new JLabel("JUGADOR 4");
        gbc.gridx = 6;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        add(jlPlayerFour, gbc);

        JLabel jlNameFour = new JLabel("Nombre: ");
        gbc.gridx = 6;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(jlNameFour, gbc);

        jlName4 = new JLabel();
        gbc.gridx = 7;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(jlName4, gbc);

        JLabel jlUbicacionFour = new JLabel("Ubicacion: ");
        gbc.gridx = 6;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        add(jlUbicacionFour, gbc);

        jlUbicacion4 = new JLabel();
        gbc.gridx = 7;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        add(jlUbicacion4, gbc);

        JLabel jlHourFour = new JLabel("Hora: ");
        gbc.gridx = 6;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        add(jlHourFour, gbc);

        jlHour4 = new JLabel();
        gbc.gridx = 7;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        add(jlHour4, gbc);

        JLabel jlNumberGamesFour = new JLabel("Numero partida: ");
        gbc.gridx = 6;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        add(jlNumberGamesFour, gbc);

        jlNumberGames4 = new JLabel();
        gbc.gridx = 7;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        add(jlNumberGames4, gbc);

        JLabel jlNumberPichesFour = new JLabel("Puntaje lanzamiento:");
        gbc.gridx = 6;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        add(jlNumberPichesFour, gbc);

        jlNumberPiches4 = new JLabel();
        gbc.gridx = 7;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        add(jlNumberPiches4, gbc);

        JLabel jlPichesScoresFour = new JLabel("Puntaje acumulado");
        gbc.gridx = 6;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        add(jlPichesScoresFour, gbc);

        jlPichesScores4 = new JLabel();
        gbc.gridx = 7;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        add(jlPichesScores4, gbc);

        JLabel jlProgressFour = new JLabel("Puntaje restante");
        gbc.gridx = 6;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        add(jlProgressFour, gbc);

        jlProgress4 = new JLabel();
        gbc.gridx = 7;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        add(jlProgress4, gbc);

        //-----------------------------------------------------------------------------------------------

        Jugador playerFour = new Jugador(control.seleccionNombre(), control.seleccionUbicacion());
        jCuatro = new Juego(playerFour, jlName4, jlUbicacion4,
                jlNumberPiches4, jlPichesScores4, jlProgress4);
        Thread th4 = new Thread(jCuatro);
        //th4.start();

        reloj r4 = new reloj(playerFour.getUbicacion(), jlHour4);
        Thread th44 = new Thread(r4);
        th44.start();


        //JUGADOR 5 -----------------------------------------------------------------------------

        jlPlayerFive = new JLabel("JUGADOR 5");
        gbc.gridx = 8;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        add(jlPlayerFive, gbc);

        JLabel jlNameFive = new JLabel("Nombre: ");
        gbc.gridx = 8;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(jlNameFive, gbc);

        jlName5 = new JLabel();
        gbc.gridx = 9;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(jlName5, gbc);

        JLabel jlUbicacionFive = new JLabel("Ubicacion: ");
        gbc.gridx = 8;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        add(jlUbicacionFive, gbc);

        jlUbicacion5 = new JLabel();
        gbc.gridx = 9;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        add(jlUbicacion5, gbc);

        JLabel jlHourFive = new JLabel("Hora: ");
        gbc.gridx = 8;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        add(jlHourFive, gbc);

        jlHour5 = new JLabel();
        gbc.gridx = 9;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        add(jlHour5, gbc);

        JLabel jlNumberGamesFive = new JLabel("Numero partida: ");
        gbc.gridx = 8;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        add(jlNumberGamesFive, gbc);

        jlNumberGames5 = new JLabel();
        gbc.gridx = 9;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        add(jlNumberGames5, gbc);

        JLabel jlNumberPichesFive = new JLabel("Puntaje lanzamiento:");
        gbc.gridx = 8;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        add(jlNumberPichesFive, gbc);

        jlNumberPiches5 = new JLabel();
        gbc.gridx = 9;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        add(jlNumberPiches5, gbc);

        JLabel jlPichesScoresFive = new JLabel("Puntaje acumulado");
        gbc.gridx = 8;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        add(jlPichesScoresFive, gbc);

        jlPichesScores5 = new JLabel();
        gbc.gridx = 9;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        add(jlPichesScores5, gbc);

        jlProgressFive = new JLabel("Puntaje restante");
        gbc.gridx = 8;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        add(jlProgressFive, gbc);

        jlProgress5 = new JLabel();
        gbc.gridx = 9;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        add(jlProgress5, gbc);

        //-----------------------------------------------------------------------------------------------

        Jugador playerFive = new Jugador(control.seleccionNombre(), control.seleccionUbicacion());
        jCinco = new Juego(playerFive, jlName5, jlUbicacion5,
                jlNumberPiches5, jlPichesScores5, jlProgress5);
        Thread th5 = new Thread(jCinco);
        //th5.start();

        reloj r5 = new reloj(playerFive.getUbicacion(), jlHour5);
        Thread th55 = new Thread(r5);
        th55.start();

        //Boton start-----------------------------------------------------------------------------------------------------

        btnStart = new JButton("Start");
        gbc.gridx = 8;
        gbc.gridy = 10;
        gbc.gridwidth = 2;
        btnStart.addActionListener((e)->{
            th1.start();
            th2.start();
            th3.start();
            th4.start();
            th5.start();
        });
        add( btnStart, gbc);

    }

}
