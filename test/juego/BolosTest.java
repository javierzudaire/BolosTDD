/*
 *  Javier Zudaire
 */
package juego;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BolosTest {

    private Bolos b;

    private void tirarVarios(int n, int numBolos) {

        for (int i = 0; i < n; i++) {

            b.tirar(numBolos);
        }

    }

    @Before
    public void setUp() {
        b = new Bolos();
    }

    @Test
    public void sePuedenTirarTodo1s() {

        tirarVarios(20, 1);
        assertEquals(20, b.score());

    }

    @Test
    public void sePuedenTirarTodo4s() {

        tirarVarios(20, 4);
        assertEquals(80, b.score());

    }

    @Test
    public void sePuedenTirarUnSpare() {

        b.tirar(5);
        b.tirar(5);
        b.tirar(3);
        tirarVarios(17, 1);
        assertEquals(33, b.score());

    }

    @Test
    public void sePuedenTirarUnStrike() {

        b.tirar(10);
        b.tirar(5);
        b.tirar(3);
        tirarVarios(16, 1);
        assertEquals(42, b.score());

    }

    @Test
    public void sePuedenTirarUnSpare2() {

        b.tirar(3);
        b.tirar(5);
        b.tirar(5);
        b.tirar(5);
        tirarVarios(16, 1);
        assertEquals(35, b.score());

    }

    @Test
    public void sePuedenTirarUnStrike2() {

        b.tirar(3);
        b.tirar(5);
        b.tirar(10);
        tirarVarios(16, 1);
        assertEquals(36, b.score());

    }

    @Test
    public void sePuedenTodoSpares() {

        tirarVarios(21, 5);
        assertEquals(150, b.score());

    }

    @Test
    public void sePuedenTirarTodoStrikes() {

        tirarVarios(12, 10);
        assertEquals(300, b.score());

    }

    @Test
    public void sePuedeTirarUnStrikeYUnSpare() {

        b.tirar(5);
        b.tirar(5);
        b.tirar(3);
        b.tirar(4);
        b.tirar(10);
        b.tirar(2);
        b.tirar(3);
        tirarVarios(12, 0);
        assertEquals(40, b.score());
    }

    @Test
    public void sePuedeTirarDosStrikesYDosSpares() {

        b.tirar(3);
        b.tirar(5);
        b.tirar(6);
        b.tirar(4);
        b.tirar(10);
        b.tirar(7);
        b.tirar(2);
        tirarVarios(12, 1);
        assertEquals(68, b.score());
    }

}
