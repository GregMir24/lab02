package mymoves.Kangaskhan;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double dam) {
        super.applyOppDamage(p, dam);

        if (p.getCondition() == Status.BURN | p.getCondition() == Status.PARALYZE | p.getCondition() == Status.POISON) {
            super.applyOppDamage(p, dam * 2);
        }
    }


    @Override
    protected String describe() {
        String[] pcs = this.getClass().toString().split("\\.");
        return "совершил " + pcs[pcs.length - 1];
    }
}