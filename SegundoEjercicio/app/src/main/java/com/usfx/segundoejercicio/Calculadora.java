package com.usfx.segundoejercicio;


//Aplicar pilas mostrar 5 + 6 - 9, borrar y mostrar resultado
//Arboles
public class Calculadora {
    private int var1;
    private int var2;

    public Calculadora(){};

    public Calculadora(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    public String Suma(){

        int sum = this.var1 + this.var2;

        return ""+sum;
    }

    public String Resta(){

        int res = this.var1 - this.var2;

        return ""+res;
    }

    public String Multiplicar(){

        int mul = this.var1 * this.var2;

        return ""+mul;
    }

    public String Dividir(){

        int y = this.var2;

        if(y == 0){

            return "Error No se puede dividir entre 0";
        }else{
            int div = this.var1 / this.var2;

            return ""+div;

        }

    }
}
