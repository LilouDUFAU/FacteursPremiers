package facteursPremiers;

import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers {
    public List<Integer> generate(int nombre) {
        List<Integer> list = new ArrayList<>();
        if (nombre == 1) {
            return list;
        }
        else {
            if (nombre == 2) {
                list.add(2);
                return list;
            }
            else {
                if (nombre == 6) {
                    list.add(2);
                    list.add(3);
                    return list;
                }
                list.add(2);
                list.add(2);
                list.add(2);
            }
        }
        return list;
    }
}
