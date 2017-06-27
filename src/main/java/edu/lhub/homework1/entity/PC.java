package edu.lhub.homework1.entity;

import edu.lhub.homework1.ForMen;
import edu.lhub.homework1.ForWomen;
import edu.lhub.homework1.HomeElectronic;
import edu.lhub.homework1.Small;

/**
 * Created by Ярослав on 05.06.2017.
 */
public class PC extends HomeElectronic implements Small, ForMen, ForWomen {
    @Override
    public void easyMove() {

    }

    @Override
    public void DORepair() {

    }

    @Override
    public void DoHousework() {

    }

    @Override
    public void relax() {

    }

    @Override
    public String toString() {
        return "PC{} " + super.toString();
    }
}
