package model;

/**
 * A Saboteur osztálya.
 */
public class Saboteur extends Player {

    /**
     * Konstruktor.
     */
    public Saboteur() {
    }

    /**
     * A szabotőr csúszóssá teszi a paraméterben kapott csövet
     * @param p - a cső amit a szabotőr csúszóssá tesz
     */
    public void makeSlippery(Pipe p) {
        p.makeSlippery();
    }
}
