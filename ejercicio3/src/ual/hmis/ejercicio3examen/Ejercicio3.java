package ual.hmis.ejercicio3examen;

public class Ejercicio3 {

   
    public String diaSemana(int dia){

        if (dia < 1 || dia >7 ){
            return "error";
        }else {

        }
        switch (dia) {
            case 1:
                return "lunes";
            case 2:
                return "martes";
            case 3:
                return "miercoles";                
            case 4:
                return "jueves";                
            case 5:
                return "viernes";                
            case 6:
                return "sabado";     
            case 7:
                return "domingo";                 
            default:
                return "error";
        }
    }
    
}