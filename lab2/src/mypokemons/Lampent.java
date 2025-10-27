package mypokemons;

import mymoves.Lampent.NightShade;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Lampent extends Litwick {
    public Lampent(String name, int lvl){
        super(name, lvl);
        super.setStats(60, 40, 60, 95, 60, 55);

        NightShade nightShade = new NightShade(0,100);

        addMove(nightShade);
    }
}
