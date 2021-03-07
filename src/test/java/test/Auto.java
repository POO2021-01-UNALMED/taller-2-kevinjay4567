<<<<<<< HEAD
package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos = new Asiento[cantidadAsientos()];
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    public int cantidadAsientos(){
        return asientos.length;
    }
    public String verificarIntegridad(){
        if (this.registro == motor.registro){
            for (Asiento asiento : asientos){
                if (this.registro != asiento.registro){
                    return "Las piezas no son originales";
                }
            }
        } else {
            return "Las piezas no son originales";
        }
        return "Auto original";
    }
}
=======
package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    public int cantidadAsientos(){
        return asientos.length;
    }
    public String verificarIntegridad(){
        if (this.registro == motor.registro){
            for (Asiento asiento : asientos){
                if (this.registro != asiento.registro){
                    return "Las piezas no son originales";
                }
            }
        } else {
            return "Las piezas no son originales";
        }
        return "Auto original";
    }
}
>>>>>>> master
