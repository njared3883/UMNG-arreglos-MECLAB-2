package matriz;
public class persona {
    private String nombre;
    private String cedula;
    private int estatura;
    private int edad;

    public persona(){
        
    }
    
    public persona(persona Persona){
        this.nombre = Persona.nombre;
        this.cedula = Persona.cedula;
        this.estatura = Persona.estatura;
        this.edad = Persona.edad;
    }
    
    public persona(String nombre, String cedula, int estatura, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.estatura = estatura;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
