package automotora;
public class testAutomotora {

    
    public static void main(String[] args) {
        Propietario duenio1=new Propietario("12345678-9", "jose perez","pasaje ejemplo", 25);
        
        Motocicleta motito= new Motocicleta(66, "Harley-Davidson", "choper", 2018, 5000000,'N', duenio1);
        
        Automotora arreglin=new Automotora(4);
    }  
}