package es.uah.matcomp.mp.e1.Time;
//Clase Pública Time
public class Time {
    //Creamos las variables privadas
    private int hour;
    private int minute;
    private int second;

    //Funciones públicas
    //Función "Time" con todas las variables definidas
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //Función que devuelve el valor de la hora
    public int getHour() {
        return hour;
    }

    //Función que devuelve el valor del minuto
    public int getMinute() {
        return minute;
    }

    //Función que devuelve el valor del segundo
    public int getSecond() {
        return second;
    }

    //Función que define la variable "Hour" donde se establece el valor
    public void setHour(int hour) {
        this.hour = hour;
    }

    //Función que define la variable "minute" donde se establece el valor
    public void setMinute(int minute) {
        this.minute = minute;
    }

    //Función que define la variable "second" donde se establece el valor
    public void setSecond(int second) {
        this.second = second;
    }

    //Función que insta el valor de las variables en las previas funciones
    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    //Función que determina con escribir la salida
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    // Avanza un segundo y retorna la misma instancia
    public Time nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    // Retrocede un segundo y retorna la misma instancia
    public Time previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }
}
