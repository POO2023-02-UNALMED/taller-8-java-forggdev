package futbol;

public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;

    //Constructors
    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal){
        super(nombre, edad, "Portero" );
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    //Instance methods
    public String toString(){
        return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos;
    }

    //Implementing abstract methods
    public int compareTo(Portero p){
        return Math.abs(this.golesRecibidos-p.golesRecibidos);
    }
    public boolean jugarConLasManos(){return true;}
}
