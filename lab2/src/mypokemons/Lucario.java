package mypokemons;

import mymoves.Lucario.HealPulse;
import mymoves.Riolu.Bulldoze;
import mymoves.Riolu.DoubleTeam;
import mymoves.Riolu.ShadowClaw;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Lucario extends Pokemon {
    public Lucario(String name, int lvl){
        super(name, lvl);
        super.addType(Type.STEEL);
        super.setStats(70, 110, 70, 115, 70, 90);

        HealPulse healPulse = new HealPulse(0,0);

        addMove(healPulse);
    }

}
