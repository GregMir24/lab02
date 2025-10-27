package mymoves.Kangaskhan;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ShadowClaw extends PhysicalMove {
    public ShadowClaw(double pow, double acc){

        super(Type.GHOST, pow, acc);
    }


    @Override
    protected double calcCriticalHit(Pokemon var1, Pokemon var2){
        super.calcCriticalHit(var1, var2);
        if ((3*(var1.getStat(Stat.SPEED) / 512.0) > Math.random())){
            System.out.println("critical");
            return 2.0;
        } else {
            return 1.0;
        }
    }

    @Override
    protected String describe() {
        String[] pcs = this.getClass().toString().split("\\.");
        return "совершил " + pcs[pcs.length - 1];
    }
}
