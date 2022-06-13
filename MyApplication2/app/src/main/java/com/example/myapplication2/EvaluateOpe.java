package com.example.myapplication2;

import java.util.regex.Pattern;

public class EvaluateOpe {
    String Exercise;
    String as = "+";

    public EvaluateOpe(String excersice) {
        this.Exercise = excersice;
    }

    public String getExercise() {
        return Exercise;
    }

    public void setExercise(String exercise) {
        Exercise = exercise;
    }
    public String Evaluate(){
        if(Exercise.contains("+")){
            String[] sumaParts = Exercise.split( Pattern.quote("+"));
            float part1 = Float.valueOf(sumaParts[0]);
            float part2 = Float.valueOf(sumaParts[1]);
            Operaciones operaciones = new Operaciones(part1,part2);
            return String.valueOf(operaciones.suma());
        }else if(Exercise.contains("-")){
            String[] sumaParts = Exercise.split( Pattern.quote("-"));
            float part1 = Float.valueOf(sumaParts[0]);
            float part2 = Float.valueOf(sumaParts[1]);
            Operaciones operaciones = new Operaciones(part1,part2);
            return String.valueOf(operaciones.resta());
            //return "Resta";
        }else if(Exercise.contains("*")){
            String[] sumaParts = Exercise.split( Pattern.quote("*"));
            float part1 = Float.valueOf(sumaParts[0]);
            float part2 = Float.valueOf(sumaParts[1]);
            Operaciones operaciones = new Operaciones(part1,part2);
            return String.valueOf(operaciones.multiplicacion());
            //return "Multiplicacion";
        }else if(Exercise.contains("/")){
            String[] sumaParts = Exercise.split( Pattern.quote("/"));
            float part1 = Float.valueOf(sumaParts[0]);
            float part2 = Float.valueOf(sumaParts[1]);
            Operaciones operaciones = new Operaciones(part1,part2);
            return operaciones.divicion();
        }

        return "Error";
    }
}
