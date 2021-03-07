package test;

public class Asiento {
    String color;
    int precio;
    int registro;
    String colores[]  = new String[4];

    public void cambiarColor(String colorcambio){
        int count = 0;
        for (int i = 0; i < colores.length; i++){
            if (colores[i] != colorcambio){
                count ++;
            }
        }
        if (count == colores.length){
            System.out.println("Color no disponible");
        } else {
            color = colorcambio;
            System.out.println("Color cambiado");
        }

    }
}
