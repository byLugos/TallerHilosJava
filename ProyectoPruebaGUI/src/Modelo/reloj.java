package Modelo;

import javax.swing.*;
import java.time.LocalTime;
import java.util.*;

public class reloj implements Runnable{

    String hora;
    int hour,minute, second;
    JLabel jlHora;
    Calendar calendario = Calendar.getInstance();

    String zona ;

    public reloj(String zona,JLabel jlHora) {
        this.jlHora = jlHora;
        this.zona = zona;
    }

    @Override
    public void run() {

        calendario.setTimeZone(TimeZone.getTimeZone(zona));
        hour = calendario.get(Calendar.HOUR_OF_DAY);
        minute = calendario.get(Calendar.MINUTE);
        second = calendario.get(Calendar.SECOND);

        while (true){

            if (second == 60){
                minute++;
                second=0;
                System.out.println(minute + " " +second);
            }if(minute==60){
                minute=0;
                hour++;
                System.out.println(minute + " " +hour);
            }if(hour==24){
                hour=0;
                System.out.println(hour);
            }
            second++;
            hora = hour+":"+minute+":"+ second;
            jlHora.setText(hora);
            System.out.println("Hora: " + hora);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
