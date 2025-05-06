

public class Principal {
    public static void dibujarArbol(InterfazArbol<Interger> a, int nivel) {
if (!a.isVacio()){

    dibujarArbol(a.der(), nivel + 1);
    for (int i = 0; i < nivel; i++) {
        System.out.print("\t");
    }
    System.out.println(a.raiz());
    dibujarArbol(a.izq(), nivel + 1);
}
    }

    public static void main(String[] args) {
        public arbol<Interger> a1 = new Arbol<>( 1, new Arbol<>(2),null);
        Arbol<Interger>a2 = new Arbol<>(16)

        /**
         * al hacer un arbol ordenado, crearemos un metodo para insertar. el cual cuando le demos un nodo
         * este se ponga a verificar
         * 1. si la raiz esta vacia tendra que volverse la raiz el elemento que estemos insertando
         * 2. si el elemento es mayor a la raiz, que lo mande a la derecha
         * 3. si el elemento es menor a la raiz, que lo mande a la izquierda
         * estas formas de insercion se trabajarian de manera recursiva para asi poder atravesar la totalidad del
         * Arbol
         *
         *
         * #Borrar (A, e)
         *     Si vacio(A [Arbol])
         *      devolver null
         *     Sino
         *      si no es vacio
         *          si n izq = e // quitar la raiz
         *          si izq()
         *          raiz = decrecha()
         *        Sino
         *        si der(.).raiz
         *        raiz= izq().raiz
         *        raiz.info= menor()
         *        der().borrar(der().menor())
         *
         *
         */



    }
}
