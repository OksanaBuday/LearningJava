package edu.lhub.homework1;

/**
 * Created by Ярослав on 10.06.2017.
 */
public interface Big {
     default void hardMove(double a) {
          System.out.println(a*10);
     }


}
