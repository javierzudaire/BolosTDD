/*
 *  Javier Zudaire
 */
package juego;

public class Bolos {

    private int puntos;
    private int[] tirada = new int[21];
    private int numTirada = 0;

    public void tirar(int numBolos) {

        tirada[numTirada] = numBolos;
        numTirada++;
    }

    public int score() {

        int i = 0;

        for (int juego = 0; juego < 10; juego++) {
            if (tirada[i] + tirada[i + 1] == 10) {
                puntos += 10 + tirada[i + 2];
                i += 2;

            } else if (tirada[i] == 10) {
                puntos += 10 + tirada[i + 1] + tirada[i + 2];
                i += 1;

            } else {
                puntos += tirada[i] + tirada[i + 1];
                i += 2;
            }

        }

        return puntos;

    }
}
