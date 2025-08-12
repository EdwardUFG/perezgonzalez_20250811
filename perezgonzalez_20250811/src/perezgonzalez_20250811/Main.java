/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perezgonzalez_20250811;

/**
 *
 * Edward Perez
 */
public class Main {

    /**
     * 
     */// VARIABLES GLOBALES
    public static int horasEnUnDia =24;
    public static int segundosEnUnaHora = 3600;
    public static int segundosEnUnMinuto = 60;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //VARIABLE local
        int segundosTotales = 91111;
        //se asigna valor de dias a la variable
        int dias = calcularDias(segundosTotales);
        //se asgina el valor de los segundos excedentes o resntaes despues de haber calculador los dias
        int segundosRestantesDespuesDeExtraerDias = obtenerSegundosRestantesDespuesDeExtraerDias(segundosTotales);
        //se asgina el valoor de las horas a partir de los segundos excdentes del calculo de dias 
        int horas = calcularHoras(segundosRestantesDespuesDeExtraerDias);
        //se asigna el valor de los segundos excedentes a partir del calculo de horas
        int segundosRestantesDespuesDeExtraerHoras = obtenerSegundosResntantesDespuesDeExtraerHoras(segundosRestantesDespuesDeExtraerDias);
        //se asigna el valor de los minutos a partir de los segundos resntates del calculo de horas
        int minutos = calcularMinutos(segundosRestantesDespuesDeExtraerHoras);
        //los segundos que quedan despues de haber realizado los calculos anteriores
        int segundosFinales = obtenerSegundosRestantesDespuesDeExtraerMinutos(segundosRestantesDespuesDeExtraerHoras);
        
        
        System.out.println("usted ha solicitado calcular los dias, horas, minutos y segundos a partir de un numero mayor a 86400");
        System.out.println("Usted ha indicado el valor de segundos como: "+ segundosTotales);
        System.out.println("dias:"+ dias);
        System.out.println("Horas:"+ horas);
        System.out.println("Minutos:"+minutos);
        System.out.println("Segundos:"+ segundosFinales);        
        
    }
    //modulo para calcular dias
 public static int calcularDias(int segundosTotales) {
     return segundosTotales/(Main.horasEnUnDia*Main.segundosEnUnaHora); 
  } //modulo para calcular los segundos restantes despues de extraer los dias 
 public static int obtenerSegundosRestantesDespuesDeExtraerDias(int segundosTotales) {
         return segundosTotales % (Main.horasEnUnDia*Main.segundosEnUnaHora);
  
 }
 //modulo para calcular horas
 public static int calcularHoras(int segundosRestantes){
     return segundosRestantes/Main.segundosEnUnaHora;
 }
 //modulo para calcular los segundos restantes despues de extraer las horas
 public static int obtenerSegundosResntantesDespuesDeExtraerHoras(int segundosRestantes) {
     return segundosRestantes % Main.segundosEnUnaHora;
 }
 //modulo para calcular la cantidad de minutos a partir de los segundos restantes 
 public static int calcularMinutos(int segundosRestantes){
     return segundosRestantes/Main.segundosEnUnMinuto;
 }
 //modulo para calcular segundos restantes de todo el programa 
 public static int obtenerSegundosRestantesDespuesDeExtraerMinutos(int segundosRestantes){
   return segundosRestantes % Main.segundosEnUnMinuto;
}
 
 
}
