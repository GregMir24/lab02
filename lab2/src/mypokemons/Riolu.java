package mypokemons;

import mymoves.Riolu.Bulldoze;
import mymoves.Riolu.DoubleTeam;
import mymoves.Riolu.ShadowClaw;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Riolu extends Pokemon {
    public Riolu(String name, int lvl){
        super(name, lvl);
        setType(Type.FIGHTING);
        setStats(40, 70, 40, 35, 40, 60);

        Bulldoze bulldoze = new Bulldoze(60,100);
        DoubleTeam doubleTeam = new DoubleTeam(0,0);
        ShadowClaw shadowClaw = new ShadowClaw(70, 100);

        setMove(bulldoze, doubleTeam, shadowClaw);
    }
}
