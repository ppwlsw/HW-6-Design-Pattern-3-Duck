//6510450658 Pinapwat Limsuwat
package QuackSimulator;

import Duck.Quackable;

public class QuackPolitely implements Quackable {
    Quackable quacker ;
    String polite = "Ja";
    static int politeCount;


    public QuackPolitely(Quackable quacker) {
        this.quacker = quacker;
        politeCount++;
    }


    @Override
    public void quack() {
        quacker.quack();
        System.out.println(polite);
    }

    public static int getPoliteCount() {
        return politeCount;
    }
}
