package mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Sample_moves extends PhysicalMove {
    public Sample_moves(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }


    @Override
    protected String describe(){
        String[] pcs = this.getClass().toString().split("//.");
        return "совершил" + pcs[pcs.length - 1];
    }


}
