//6510450658 Pinapwat Limsuwat
package QuackSimulator.DuckSimulator;

import Duck.*;
import Goose.*;
import Pigeon.*;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate(){
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedHeadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonDuck = new PigeonAdapter(new Pigeon());

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeonDuck);


    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
