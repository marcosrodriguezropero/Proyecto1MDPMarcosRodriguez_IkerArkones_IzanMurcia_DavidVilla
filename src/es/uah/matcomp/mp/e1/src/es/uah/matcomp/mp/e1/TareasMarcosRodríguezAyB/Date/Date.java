package es.uah.matcomp.mp.e1.Date;
//Clase pública Date
public class Date {
    //Creamos variables privadas
    private int day;
    private int month;
    private int year;

    //Funciones públicas
    //Creamos la función día con todas las variables
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Función pública que devuelve el valor de Day
    public int getDay() {
        return day;
    }

    //Función pública que devuelve el valor de Month
    public int getMonth() {
        return month;
    }

    //Función pública que devuelve el valor de Year
    public int getYear() {
        return year;
    }

    //Función para establecer el valor "Day" de una variable en otra
    public void setDay(int day) {
        this.day = day;
    }

    //Función para establecer el valor "Month" de una variable en otra
    public void setMonth(int month) {
        this.month = month;
    }

    //Función para establecer el valor "Year" de una variable en otra
    public void setYear(int year) {
        this.year = year;
    }

    //Función para establecer la fecha
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Función para escribir la fecha de una determinada forma
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
