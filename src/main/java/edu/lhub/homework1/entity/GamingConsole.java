package edu.lhub.homework1.entity;

import edu.lhub.homework1.*;

/**
 * Created by Ярослав on 05.06.2017.
 */
public class GamingConsole extends HomeElectronic implements Small, ForMen,ForWomen {
    @Override
    public Brand getBrand() {
        return super.getBrand();
    }

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
        return "GamingConsole{} " + super.toString();
    }
}
