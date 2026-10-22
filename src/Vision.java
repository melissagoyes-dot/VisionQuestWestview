public class Vision {
    private String nombre;
    private String color;
    private int memoria;

    //Principal
    public Vision(String nombre, String color, int memoria){
        this.nombre = nombre;
        this.color = color;
        setMemoria(memoria);
    }

    //Sobrecarga
    public Vision(){
        this("Vision", "Rojo", 100);
    }

    public Vision(String nombre){
        this(nombre, "Rojo", 50);
    }

    //Copia
    public Vision (Vision otro){
        this(otro.nombre, otro.color, otro.memoria);
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemoria() {
        return memoria;
    }

    //Setter Memoria con condiciones
    public void setMemoria(int memoria) {
        if (memoria >= 0 && memoria<=100){
            this.memoria = memoria;
        }else {
            this.memoria = Math.max(0,Math.min(memoria,100));
        }
    }

    //Metodo recordar
    public void recordar(int cantidad){
        setMemoria(memoria+cantidad);
    }

    //Sobrecarga recordar
    public void recordar(int cantidad, int veces){
        recordar(cantidad*veces);
    }

    //Metodo borrar memoria
    public void borrarMemoria(){
        this.memoria =0;
    }

    //Metodo cambiar color
    public void cambiarColor(String color){
        this.color=color;
    }

    //Metodo diferenciar memoria
    public int diferenciarMemoria(Vision otra){
        return Math.max(otra.memoria, memoria) - Math.min(otra.memoria, memoria);
    }

    //Las tres primeras letras del nombre en mayúsculas, un guion y la memoria. Debe funcionar aunque el nombre tenga menos de tres letras.
    public String codigo(){
        return nombre.substring(Math.min(nombre.length(),3)).toUpperCase() + " - " + memoria;
    }

    //Mostrar
    public void mostrar (){
        System.out.println("|Nombre: " + nombre + "\n|Color: " + color + "\n|Memoria: " + memoria);
    }


}