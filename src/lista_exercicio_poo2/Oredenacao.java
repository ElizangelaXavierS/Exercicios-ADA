package lista_exercicio_poo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Oredenacao {
    public static void main(String[] args) {
        List<String> ListaString = new ArrayList<>(List.of("z", "a", "f"));

        Collections.sort(ListaString);

        System.out.println(ListaString);
    }
}




