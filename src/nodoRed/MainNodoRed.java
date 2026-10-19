package nodoRed;

public class MainNodoRed {
    static void main() {
        System.out.println("Total creados: "+NodoRed.getTotalCreados());
        NodoRed nodo1 = new NodoRed(1, 2);
        System.out.println();

        System.out.println("Total creados: "+NodoRed.getTotalCreados());
        NodoRed nodo2 = new NodoRed(-2, -1);
        System.out.println();

        System.out.println("Total creados: "+NodoRed.getTotalCreados());
        System.out.println();


        System.out.println("Nodo 1 inicial:");
        nodo1.mostrarInfo();
        System.out.println();

        System.out.println(nodo1.conectar());
        nodo1.mostrarInfo();
        System.out.println();

        System.out.println(nodo1.conectar());
        nodo1.mostrarInfo();
        System.out.println();

        System.out.println(nodo1.conectar());
        nodo1.mostrarInfo();
        System.out.println();

        System.out.println(nodo1.desconectar());
        nodo1.mostrarInfo();
        System.out.println();

        System.out.println(nodo1.desconectar());
        nodo1.mostrarInfo();
        System.out.println();

        System.out.println(nodo1.desconectar());
        nodo1.mostrarInfo();

    }

}
