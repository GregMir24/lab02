package mypokemons;

import mymoves.Litwick.Confide;
import mymoves.Litwick.WillOWisp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Litwick extends Pokemon {
    public Litwick(String name, int lvl){
        super(name, lvl);
        super.setType(Type.GHOST, Type.FIRE);
        super.setStats(50, 30, 55 , 65, 55, 20);

        WillOWisp willOWisp = new WillOWisp(0, 85);
        Confide confide = new Confide(0,0);

        setMove(willOWisp, confide);
    }
}
