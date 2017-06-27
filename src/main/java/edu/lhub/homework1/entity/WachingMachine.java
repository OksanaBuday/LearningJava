package edu.lhub.homework1.entity;

import edu.lhub.homework1.Big;
import edu.lhub.homework1.ForWomen;
import edu.lhub.homework1.HomeElectronic;

/**
 * Created by Ярослав on 15.06.2017.
 */
public class WachingMachine extends HomeElectronic implements Big, ForWomen {


    @Override
    public void hardMove(double a) {

    }

    @Override
    public String toString() {
        return "WachingMachine{} " + super.toString();
    }

    @Override
    public void DoHousework() {

    }

    @Override
    public void relax() {

    }
}
