package com.example.myapplication;

public class Complejo {

    private double real, imaginario;

    public Complejo(double real, double imaginario){

        this.real = real;
        this.imaginario = imaginario;
    }

    public Complejo suma (Complejo v, Complejo w){
        return new Complejo (v.real + w.real, v.imaginario + w.imaginario);
    }

    public Complejo suma2 (Complejo v){
        return new Complejo (v.real + this.real, v.imaginario + this.imaginario);
    }

    public void suma3 (Complejo v){
        this.real = v.real + this.real;
        this.imaginario = v.imaginario + this.imaginario;
    }

}
