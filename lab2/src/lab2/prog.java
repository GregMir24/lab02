package lab2;

import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class prog {
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p1 = new Riolu("", 1);
        Pokemon p2 = new Lampent("", 1);
        Pokemon p3 = new Kangaskhan("", 1);
        Pokemon p4 = new Litwick( "", 1);
        Pokemon p5 = new Lucario("", 1);
        Pokemon p6 = new Chandelure("", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }

    public static boolean chance(double v){
        return v > Math.random();
    }
}
