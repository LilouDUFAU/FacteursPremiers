package facteursPremiers;

import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers {
    public List<Integer> generate(int nombre) {
        List<Integer> list = new ArrayList<>();

        // Diviser par 2 jusqu'à ce que ce ne soit plus divisible
        while (nombre % 2 == 0) {
            list.add(2);
            nombre /= 2;
        }

        for (int i = 3; i * i <= nombre; i += 2) {
            while (nombre % i == 0) {
                list.add(i);
                nombre /= i;
            }
        }

        // Si nombre est toujours > 2, alors c'est un nombre premier
        if (nombre > 2) {
            list.add(nombre);
        }

        return list;
    }
}
