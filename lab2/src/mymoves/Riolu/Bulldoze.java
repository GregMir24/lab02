package mymoves.Riolu;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze(double pow, double acc){
        super(Type.GROUND, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.SPEED, -1);
        p.addEffect(e);
    }


    @Override
    protected String describe() {
        String[] pcs = this.getClass().toString().split("\\.");
        return "совершил " + pcs[pcs.length - 1];
    }
}
