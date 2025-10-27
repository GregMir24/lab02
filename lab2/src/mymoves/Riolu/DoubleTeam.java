package mymoves.Riolu;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }


    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.EVASION, 1);
        p.addEffect(e);
    }


    @Override
    protected String describe(){
        String[] pcs = this.getClass().toString().split("\\.");
        return "совершил " + pcs[pcs.length - 1];
    }


}
