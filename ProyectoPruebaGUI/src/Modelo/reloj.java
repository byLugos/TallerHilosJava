package Modelo;

import javax.swing.*;
import java.time.LocalTime;
import java.util.*;

public class reloj implements Runnable{

    String hora, minutos, segundos;
    JLabel jlHora;
    Calendar calendario = Calendar.getInstance();

    String zona ;

    public reloj(String zona,JLabel jlHora) {
        this.jlHora = jlHora;
        this.zona = zona;
    }

    @Override
    public void run() {

        while (true){

            LocalTime hour = LocalTime.now();
            //calendario.setTimeZone(TimeZone.getTimeZone(zona));
            jlHora.setText(hour.getHour()+":"+hour.getMinute()+":"+hour.getSecond());
            //System.out.println("Hora: " + getHoraFormato(calendario));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public String getHoraFormato(Calendar cal){
        hora = cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND);
        return hora;
    }
}
