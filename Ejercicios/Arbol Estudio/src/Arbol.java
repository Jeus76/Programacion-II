import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Arbol<E> extends InterfazArbol<E> {

private class Nodo<E> {
    public E info;
    public InterfazArbol<E> izq,der;

    public Nodo(E raiz, InterfazArbol<E> izq, InterfazArbol<E> der) {
        info = raiz;
        this.izq = izq;
        this.der = der;

    }
}
Nodo<E> raiz = null ;

public Arbol(){}

public Arbol(E raiz,InterfazArbol<E> izq, InterfazArbol<E> der ) {
    this.raiz = new Nodo(raiz,izq,der);
}


public E raiz() {
    return raiz.info;
}
public InterfazArbol<E> izq() {
    return raiz.izq;
}
public InterfazArbol<E> der(){
    return raiz.der;
}
public boolean isVacio() {
    return raiz == null;
}

public String recorrerInOrden() {
    if(isVacio()) {
        return "";
    }
return izq().recorrerInOrden()+
        raiz().toString() +
        der().recorrerInOrden();

}
 public String recorreroPostOrden() {
     if (isVacio()) {
         return "";
     }
    return izq().recorrerInOrden()+
             der().recorrerInOrden() +
            raiz().toString();

 }

 public String recorrerPreOrden() {
     if (isVacio()) {
         return "";
     }
    return raiz().toString() +
            izq().recorrerInOrden()+
            der().recorrerInOrden();

 }
 public ArrayList<E> filtrar(Predicate p , ArrayList<E> lista) {
    if (isVacio()) {
        return lista;
    }
    izq().filtrar(p); // REVISAR LOS PARAMETROS DEL METODO QUE NECESITA TENER LISTA PERO ARROJA ERROR
    if (p.test(raiz())){
        lista.add(raiz());
    }
    der().filtrar(p); // AQUI IGUAL PASA
return lista;
 }

    public InterfazArbol<E> aplicar(Consumer c) {
    if (isVacio()) {
        return this;

    }
    izq().aplicar(c);
    c.accept(raiz());
    der().aplicar(c);

    return this;
}
public void dibujarArbol(int nivel) {
    if (!isVacio()) {
        this.der();
        //pintar nivel
    }
    public Arbol(T raiz){
        this.raiz = new Nodo (raiz,null,null);
    }

}
}
