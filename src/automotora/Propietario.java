package automotora;
public class Propietario {
    private String rut,nombre,domicilio;
    private int edad;;

    public Propietario() {
    }

    public Propietario(String rut, String nombre, String domicilio, int edad) {
        setRut(rut);
        setNombre(nombre);
        setDomicilio(domicilio);
        setEdad(edad);
    }
    public void setRut(String rut) {
        if (rut.length()==10) {
            this.rut = rut;   
            }
        else{
            System.err.println("Error, El rut debe contener 10 digitos");
        }
    }
    public void setNombre(String nombre) {
        if (nombre==" "){
            System.err.println("Error, No puede estar en blanco");
        }
        else{
         this.nombre = nombre;    
        }
        
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public void setEdad(int edad) {
        if(edad <18){
            
            System.err.println("Edad No valida Debe ser mayor de 18 años");
        }
        this.edad = edad;
    }
    public String getRut() {
        return rut;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public int getEdad() {
        return edad;
    }
    @Override
    public String toString() {
        return "Propietario{" + "rut=" + rut + ", nombre=" + nombre + ", domicilio=" + domicilio + ", edad=" + edad + '}';
    } 
    
    
    
    
}