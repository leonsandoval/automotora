package automotora;
public class Automotora {
    
    private Motocicleta motito[];//=new Motocicleta[4];
    private int tamanio;

    public Automotora() {
    }

    public Automotora( int tamanio) {
        motito=new Motocicleta[getTamanio()];
        this.tamanio = tamanio;
    }

    public void setMotito(Motocicleta[] motito) {
        this.motito = motito;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public Motocicleta[] getMotito() {
        return motito;
    }

    public int getTamanio() {
        return tamanio;
    }
    
    //metodo agregar
    
    public boolean agregarMotocicleta(Motocicleta objetomoto)
    {
        motito[0]=objetomoto; 
        return true;
    }
}
