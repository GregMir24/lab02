package mymoves;

import ru.ifmo.se.pokemon.*;

public class MySelfPhysicalMove extends PhysicalMove {
    public MySelfPhysicalMove(double pow, double acc){
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
}
