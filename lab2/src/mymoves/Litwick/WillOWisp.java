package mymoves.Litwick;

import ru.ifmo.se.pokemon.*;

import java.lang.module.ModuleReference;

public class WillOWisp extends StatusMove {
    public WillOWisp(double pow, double acc){
        super(Type.FIRE, pow, acc);
    }


    @Override
    protected void applyOppEffects(Pokemon p){
        if (!p.hasType(Type.FIRE)) {
            Effect var1 = (new Effect()).condition(Status.BURN).turns(-1);
            var1.stat(Stat.ATTACK, -3).stat(Stat.HP, (int)p.getStat(Stat.HP) / 8);
            p.setCondition(var1);
            }
    }

    @Override
    protected String describe() {
        String[] pcs = this.getClass().toString().split("\\.");
        return "совершил " + pcs[pcs.length - 1];
    }
}
