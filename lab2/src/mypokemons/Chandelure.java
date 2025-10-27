package mypokemons;

import mymoves.Litwick.WillOWisp;

public class Chandelure extends Lampent{
    public Chandelure(String name, int lvl){
        super(name, lvl);
        super.setStats(60,55,90,145,90,80);


        WillOWisp willOWisp2 = new WillOWisp(0,85);
        addMove(willOWisp2);
    }
}
