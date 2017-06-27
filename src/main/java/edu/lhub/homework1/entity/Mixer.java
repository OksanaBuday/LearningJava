package edu.lhub.homework1.entity;

import edu.lhub.homework1.*;

/**
 * Created by Ярослав on 05.06.2017.
 */
public class Mixer extends HomeElectronic implements Small, ForWomen{
    @Override
    public Brand getBrand() {
        return super.getBrand();
    }

    @Override
    public void easyMove() {

    }


    @Override
    public String toString() {
        return "Mixer{} " + super.toString();
    }

    @Override
    public void DoHousework() {

    }

    @Override
    public void relax() {

    }
}
