package com.example.sebas.formulario;


public class User {
    private String Nombre, Apellido, ID,City, Hobby, Sex;
    private int dateMonth,dateDay,dateYear;

    public int getDateDay() {
        return dateDay;
    }
    public void setDateDay(int dateDay) {
        this.dateDay = dateDay;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        City = city;
    }
    public String getHobby() {
        return Hobby;
    }
    public void setHobby(String hobby) {
        Hobby = hobby;
    }
    public String getSex() {
        return Sex;
    }
    public void setSex(String sex) {
        Sex = sex;
    }
    public int getDateMonth() {
        return dateMonth;
    }
    public void setDateMonth(int dateMonth) {
        this.dateMonth = dateMonth;
    }
    public int getDateYear() {
        return dateYear;
    }
    public void setDateYear(int dateYear) {
        this.dateYear = dateYear;
    }
}
