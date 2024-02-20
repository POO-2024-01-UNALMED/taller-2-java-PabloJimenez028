package test;

public class Auto{
    String modelo;
    int precio;
    Asiento [] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    public int cantidadAsientos() {
        int cantidad = 0;
        for (int i = 0; i < this.asientos.length; i++) {
            if (this.asientos[i] != null) {
                cantidadCreados++;
            }
        }

    return cantidadCreados;
    }

    public String verificarIntegridad(){
        for(int i = 0; i < this.asientos.length; i++){
            if(this.asientos[i] != null) {
                if (this.registro != this.asientos[i].registro || this.motor.registro != this.asientos[i].registro) {
                    return "Las piezas no son originales";
                }
            }
        }

        return "Auto original";
    }
}
