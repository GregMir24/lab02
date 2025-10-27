package mymoves.Lampent;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class NightShade extends SpecialMove {
    public NightShade(double pow, double acc){
        super(Type.GHOST, pow, acc);
    }

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def){
        return (double)att.getLevel();
    }


    @Override
    protected String describe() {
        String[] pcs = this.getClass().toString().split("\\.");
        return "совершил " + pcs[pcs.length - 1];
    }
}
