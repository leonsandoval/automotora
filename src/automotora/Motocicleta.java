package automotora;
public class Motocicleta {
    private String marca,modelo;
    private int cod_moto,año,precio;
    private char estado;
    private Propietario dueño1;

    public Motocicleta() {
        Propietario dueño1= new Propietario();
    }

    public Motocicleta(int cod_moto, String marca, String modelo, int año, int precio, char estado, Propietario dueño1) {
        setCod_moto(cod_moto);
        setMarca(marca);
        setModelo(modelo);
        setAño(año);
        setPrecio(precio);
        setEstado(estado);
        setDueño1(dueño1);
    }

    public void setCod_moto(int cod_moto) {
        //this.cod_moto = cod_moto;
        if(cod_moto>=10){
            this.cod_moto = cod_moto;
        }
        else{
            System.out.println("error,debe ser de dos digitos");
            
        }    
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setEstado(char estado) {
        if (estado=='U'|| estado=='N') {
            this.estado = estado;
        }
        else{
            System.err.println("Error, Ingrese un estado Valido (U=Usado) o (N=nueva)");
        }
    } //MetodoEstadoMoto

    public void setDueño1(Propietario dueño1) {
        this.dueño1 = dueño1;
    }

    public int getCod_moto() {
        return cod_moto;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    public int getAño() {
        return año;
    }

    public int getPrecio() {
        return precio;
    }

    public char getEstado() {
        return estado;
    }

    public Propietario getDueño1() {
        return dueño1;
    }
    //metodo cantidadMotosUsadas
    public void mostrarDatoMoto(){
        
    }
    
    //metodo cantidadMotosNuevas
}
