public class ValueOrReference{

     public static void main(String []args){
         int num=1;
         pasarPorValor(num);
         System.out.println("Fuera Num vale: " + num);
         String cadena[]= new String[10];
         cadena[0]="hola";
         pasarPorValor(cadena);
         System.out.println("Fuera la cadena vale: " + cadena[0]);
     }
     
     public static void pasarPorValor(int numero){
         numero++;
          System.out.println("Dentro del metodo numero vale: " + numero);
     }
     
     public static void pasarPorValor(String[] cadena){
         cadena[0]="adios";
          System.out.println("Dentro del metodo cadena de 0 vale: " + cadena[0]);
     }
}
