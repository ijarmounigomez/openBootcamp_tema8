public class Main {
    public static void main(String[] args) {
        Persona miPersona = new Persona();
        miPersona.setEdad(89);
        miPersona.setNombre("Juanito");
        miPersona.setTelefono(18123123);
        System.out.println(miPersona.getEdad());
        System.out.println(miPersona.getNombre());
        System.out.println(miPersona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono() {
        return this.telefono;
    }
    public void setTelefono(int telefono) {
         this.telefono = telefono;
    }
}