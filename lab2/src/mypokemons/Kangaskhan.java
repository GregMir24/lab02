package mypokemons;

import mymoves.Kangaskhan.AerialAce;
import mymoves.Kangaskhan.Facade;
import mymoves.Kangaskhan.FireBlast;
import mymoves.Kangaskhan.ShadowClaw;
import mymoves.Sample_moves;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Kangaskhan extends Pokemon {

    public Kangaskhan(String name, int lvl){

        super(name, lvl);
        super.setType(Type.NORMAL);
        super.setStats(105, 95, 80, 40, 80, 90);


        Facade facade = new Facade(70, 100);
        FireBlast fireBlast = new FireBlast(110, 85);
        ShadowClaw shadowClaw = new ShadowClaw(70, 100);
        AerialAce aerialAce = new AerialAce(60, Double.POSITIVE_INFINITY);

        setMove(facade, fireBlast, shadowClaw, aerialAce);

    }

}
