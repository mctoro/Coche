/*
Crear la clase Coche
a) Guardar como información el modelo, su color, si la pintura es metalizada, la matrícula, el
tipo de coche (utilitario, familiar, deportivo), el año de fabricación y la modalidad del
seguro (terceros o todo riesgo).
b) Crear un método que permita imprimir sus datos
 */
package com.cice.coche;

/**
 *
 * @author cice
 */
public class coche {

    //atributos
    String modelo;
    String color;
    String matricula;
    String tipocoche;
    String añofabrica;
    String seguro;
    
    
    //constructores
    public coche(){
    modelo = "SEAT";
    color = "Azul lluvia";
    matricula ="0176DTH";
    tipocoche = "monovolumen";
    añofabrica = "2005";
    seguro = "terceros ampliado";
    
    }
    
    //metodos

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTipocoche(String tipocoche) {
        this.tipocoche = tipocoche;
    }

    public void setAñofabrica(String añofabrica) {
        this.añofabrica = añofabrica;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }


    
    public void pintarinfo(){
    
        System.out.println("modelo " + modelo);
        System.out.println("color " + color);
        System.out.println("matricula " + matricula);
        System.out.println("tipo de coche " + tipocoche);
        System.out.println("año de fabrica " + añofabrica);
        System.out.println("seguro " + seguro);
    }
    
}
