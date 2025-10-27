package mymoves.Lucario;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class HealPulse extends PhysicalMove {
    public HealPulse(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);
    }

    //Эффекты не накладываю из-за отсутствия необходимоц логики в исходном джарнике

    @Override
    protected String describe() {
        String[] pcs = this.getClass().toString().split("\\.");
        return "совершил " + pcs[pcs.length - 1];
    }
}
