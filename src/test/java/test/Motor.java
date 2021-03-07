package test;

public class Motor {
    int numeroCilindros;
    String tipo;
    public int registro;

    public void cambiarRegistro(int registroCambio){
        registro = registroCambio;
    }

    public void asignarTipo(String tipoMotor){
        if (tipoMotor.equals("electrico") || tipoMotor.equals("gasolina")){
            tipo = tipoMotor;
        }
    }
}
