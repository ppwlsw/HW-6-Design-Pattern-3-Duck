//6510450658 Pinapwat Limsuwat
package QuackSimulator.DuckSimulator;

import Duck.*;
import Goose.*;
import QuackSimulator.QuackCounter;


public class DuckSimDecorator {
    public static void main(String[] args) {
        DuckSimDecorator simulator = new DuckSimDecorator();
        simulator.simulate();
    }
    void simulate() {

        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedHeadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator: With Decorator");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        System.out.println("The ducks quacked "+
                QuackCounter.getQuacks() + " times");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
