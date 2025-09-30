package facteursPremiers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;


class FacteursPremiersTest {
    private FacteursPremiers fp;

    @BeforeEach
    void setUp() {
        fp = new FacteursPremiers();
    }

    // Test 1 : Nombre = 1 → renvoie liste vide
    @Test
    void generate_devrait_retourner_liste_vide_pour_nombre_un() {
        // GIVEN
        int nb = 1;

        // WHEN
        List<Integer> lstNbPrem = fp.generate(nb);

        // THEN
        assertThat(lstNbPrem).isEmpty();
        System.out.println("Test 1 ok : Le resultat est " + lstNbPrem + ".");
    }

    // Test 2 : Nombre = premier → renvoie nombre
    @Test
    void generate_devrait_retourner_le_meme_nombre() {
        // GIVEN
        int nb = 2;

        // WHEN
        List<Integer> lstNbPrem = fp.generate(nb);

        // THEN
        assertThat(lstNbPrem).containsExactly(2);
        System.out.println("Test 2 ok : Le resultat est " + lstNbPrem + ".");
    }

    // Test 3 : Nombre = produit de 2 nombres premiers → renvoie les deux nombres
    @Test
    void generate_devrait_retourner_deux_nombres() {
        // GIVEN
        int nb = 6;

        // WHEN
        List<Integer> lstNbPrem = fp.generate(nb);

        // THEN
        assertThat(lstNbPrem).containsExactly(2,3);
        System.out.println("Test 3 ok : Le resultat est " + lstNbPrem + ".");
    }

    // Test 4 : Nombre = meme facteur repete → renvoie le facteur n fois
    @Test
    void generate_devrait_retourner_le_facteur_n_fois() {
        // GIVEN
        int nb = 8;

        // WHEN
        List<Integer> lstNbPrem = fp.generate(nb);

        // THEN
        assertThat(lstNbPrem).containsExactly(2,2,2);
        System.out.println("Test 4 ok : Le resultat est " + lstNbPrem + ".");
    }


}