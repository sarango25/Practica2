package com.example.practica2;

public class Pregunta {

    //Atributos
    private int operandoA;
    private int operandoB;
    private String operador;
    private String [] operadores = { "+","-","x","/"};

    //Constructor
    public Pregunta(){
        this.operandoA = (int)(Math.random() * 11);
        this.operandoB = (int)(Math.random() * 11);

        int posicion = (int)(Math.random() * 4);
        this.operador = operadores[posicion];

}
    //Métodos
    public String getPregunta(){
        return operandoA + " " + operador + " " + operandoB;
    }
    public int getRespuesta() {
        int respuesta = 0;
        switch (operador) {
            case "+":
                respuesta = this.operandoA + this.operandoB;
                break;
            case "-":
                respuesta = this.operandoA - this.operandoB;
                break;
            case "x":
                respuesta = this.operandoA * this.operandoB;
                break;
            case "/":
                respuesta = this.operandoA / this.operandoB;
                break;
        }

        return respuesta;

    }
}

