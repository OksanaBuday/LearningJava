package edu.lhub.homework1;

import edu.lhub.homework1.entity.Drill;
import edu.lhub.homework1.entity.Iron;


public class Main {

    public static void main(String[] args) {
        Iron iron = new Iron();
        iron.setBrand(new Brand("Tefal"));
        iron.setPrice(2000);
        iron.setDescription("Hot");
        iron.doWORK();
         iron.DoHousework();
        System.out.println( iron);
        System.out.println("---------------------------------------------------------------------------------------");

        Drill drill = new Drill();
        drill.DORepair();
       drill.setDescription("drrrr");
       drill.setPrice(5000);
       drill.setBrand(new Brand("DrillBrend"));
        System.out.println(drill);
    }
}
