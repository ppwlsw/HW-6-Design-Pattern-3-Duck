//6510450658 Pinapwat Limsuwat
package QuackSimulator.DuckSimulator;

import Duck.*;
import Goose.*;
import Pigeon.*;
import QuackSimulator.QuackPolitely;

public class DuckPoliteSimulator {
    public static void main(String[] args) {
        DuckPoliteSimulator simulator = new DuckPoliteSimulator();
        simulator.simulate();
    }

    void simulate(){
        Quackable mallardDuck = new QuackPolitely(new MallardDuck());
        Quackable redheadDuck = new RedHeadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new QuackPolitely(new RubberDuck());
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonDuck = new QuackPolitely(new PigeonAdapter(new Pigeon()));

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeonDuck);
        simulate(mallardDuck);
        simulate(mallardDuck);
        simulate(mallardDuck);
        simulate(mallardDuck);
        simulate(mallardDuck);
        simulate(mallardDuck);

        System.out.println("There are " + QuackPolitely.getPoliteCount() + " Polite ducks");

    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
