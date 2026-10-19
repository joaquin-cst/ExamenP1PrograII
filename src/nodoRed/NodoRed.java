package nodoRed;

public class NodoRed {
    private int id;
    private int capacidadMax;
    private int conexionesActv;
    private static int cont=0;

    public int getId() {
        return id;
    }
    private void setId(int id){
        if (id>0){
            this.id=id;
        } else {
            System.out.println("El ID solo admite valores positivos");
        }
    }

    public int getCapacidadMax (){
        return capacidadMax;
    }
    public void setCapacidadMax (int capacidadMax) {
        if (capacidadMax>0){
            this.capacidadMax=capacidadMax;
        } else {
            System.out.println("La capacidad máxima debe ser mayor a 0");
        }
    }

    public int getConexionesActv() {
        return conexionesActv;
    }

    public static int getTotalCreados () {
        return cont;
    }

    public boolean conectar () {
        if (conexionesActv<capacidadMax){
            conexionesActv++;
            System.out.println("Nueva conexión realizada!");
            return true;
        } else {
            System.out.println("ERROR: Nodo lleno");
            return false;
        }
    }

    public boolean desconectar () {
        if (conexionesActv>0){
            conexionesActv--;
            System.out.println("Desconexión exitosa");
            return true;
        } else {
            System.out.println("ERROR: El nodo no tiene conexiones activas");
            return false;
        }
    }

    public void mostrarInfo(){
        System.out.println("ID: "+id);
        System.out.println("Capacidad Máxima: "+capacidadMax);
        System.out.println("Conexiones Activas: "+conexionesActv);
    }

    public NodoRed (int id, int capacidadMax) {
        if (id>0){
            setId(id);
        }
        if (capacidadMax>0){
            setCapacidadMax(capacidadMax);
        }
        this.conexionesActv=0;
        cont++;
    }
}
