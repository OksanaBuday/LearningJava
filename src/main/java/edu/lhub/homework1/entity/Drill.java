package edu.lhub.homework1.entity;

import edu.lhub.homework1.*;

/**
 * Created by Ярослав on 05.06.2017.
 */
public class Drill extends HomeElectronic implements Small, ForMen {
    @Override
    public Brand getBrand() {
        return super.getBrand();
    }

    @Override
    public void DORepair() {

    }

    @Override
    public void relax() {

    }

    @Override
    public void easyMove() {

    }

    @Override
    public String toString() {
        return "Drill{} " + super.toString();
    }
}