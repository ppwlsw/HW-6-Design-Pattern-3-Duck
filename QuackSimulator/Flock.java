//6510450658 Pinapwat Limsuwat
package QuackSimulator;

import Duck.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }
    public void quack() {
        for (int i = 0 ; i < quackers.size() ; i++){
            if(i == 0) {
                quackers.get(i).quack();
                quackers.get(i).quack();
                quackers.get(i).quack();
            }
            else {
                quackers.get(i).quack();
            }
        }
    }
}
