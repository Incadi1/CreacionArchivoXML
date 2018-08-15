
package modelo;


public class persona {

    private String Nombre;

    private int Edad;

    private String Direccion;


    public String getDireccion() {
        return Direccion;
    }

  
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getEdad() {
        return Edad;
    }


    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public persona(String Nombre, int Edad, String Direccion) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Direccion = Direccion;
    }

    public persona() {
    }

    @Override
    public String toString() {
        return "persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Direccion=" + Direccion + '}';
    }

}
