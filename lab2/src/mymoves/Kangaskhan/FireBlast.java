package mymoves.Kangaskhan;

import lab2.prog;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class FireBlast extends SpecialMove {
    public FireBlast(double pow, double acc){
        super(Type.FIRE, pow, acc);
    }

   @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        if (prog.chance(0.1)){
            Effect.burn(p);
        }

    }
    @Override
    protected String describe() {
        String[] pcs = this.getClass().toString().split("\\.");
        return "совершил " + pcs[pcs.length - 1];
    }
}
