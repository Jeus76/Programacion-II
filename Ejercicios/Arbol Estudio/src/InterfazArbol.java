
import java.util.function.*;
import java.util.ArrayList;

public class InterfazArbol<E> {

    public interface InterfazArbol<E> {
        public E raiz();

        public InterfazArbol<E> izq();
        public InterfazArbol<E> der();

        public String recorrerInOrden();

        public String recorrerPostOrden();

        public String recorrerPreOrden();


        public ArrayList<E> filtrar (Predicate p);

        public InterfazArbol<E> aplicar(Consumer c);


    }
}
