package edu.lhub.homework1.entity;

import edu.lhub.homework1.*;
import lombok.Data;


@Data
public class Kettle extends HomeElectronic implements ForWomen, Small {

    @Override
    public Brand getBrand() {
        return super.getBrand();
    }

    @Override
    public void easyMove() {

    }

    @Override
    public void DoHousework() {

    }

    @Override
    public void relax() {

    }

    @Override
    public String toString() {
        return "Kettle{} " + super.toString();
    }
}
