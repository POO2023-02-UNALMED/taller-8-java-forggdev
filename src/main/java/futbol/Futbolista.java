package futbol;

public abstract class Futbolista implements Comparable<Object> {
    private String nombre;
    private int edad;
    private final String posicion;

    //Constructors
    public Futbolista(String nombre, int edad, String posicion){
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }
    public Futbolista(){
        this("Maradona",30,"delantero");
    }

    //Instance methods
    public boolean equals(Futbolista f){
        return this == f;
    }

    public String toString(){
        return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion();
    }

    //Implement abstract methods
    public int compareTo(Object o){
        return 0;
    }

    //Abstract methods
    public abstract boolean jugarConLasManos();

    //Get and set methods
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }
}
