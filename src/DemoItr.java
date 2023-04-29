import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
@autor Iván Yanni Borgez Bautista
@email borgezyanni@gmail.com
@descripción práctica de listas enlazadas de guía telefónica
*/

public class DemoItr {
    public static void  main(String args[]){
        LinkedList<EntradaTelefono> agenda = new LinkedList<EntradaTelefono>();

        agenda.add(new EntradaTelefono("Ernesto","555-3456"));
        agenda.add(new EntradaTelefono("Carlos","555-3976"));
        agenda.add(new EntradaTelefono("Karen","555-1010"));

        Iterator<EntradaTelefono> itr = agenda.iterator();

        EntradaTelefono et;
        System.out.println("Itera en la lista en " + "direccion hacia delante: ");

        while(itr.hasNext()){
            et = itr.next();
            System.out.println(et.nombre + ": " + et.numero);
        }

        System.out.println();

        ListIterator<EntradaTelefono> litr = agenda.listIterator(agenda.size());

        System.out.println("Itera en la lista en " + "direccion inversa: ");

        while(litr.hasPrevious()){
            et = litr.previous();
            System.out.println(et.nombre + ": " + et.numero);
        }
    }
}
