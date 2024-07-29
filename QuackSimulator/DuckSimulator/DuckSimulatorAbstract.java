//6510450658 Pinapwat Limsuwat
package QuackSimulator.DuckSimulator;

import Duck.*;
import Goose.*;
import QuackSimulator.Factory.*;
import QuackSimulator.*;

public class DuckSimulatorAbstract {
    public static void main(String[] args) {
        DuckSimulatorAbstract simulator = new DuckSimulatorAbstract();
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory abstractDuckFactory = new CountingDuckFactory();
        AbstractDuckFactory politeDuckFactory = new PoliteDuckFactory();
        System.out.println("\nDuck Simulator: With Abstract Factory");
        simulator.simulate(duckFactory);
        System.out.println("\nDuck Simulator: With Abstract Factory and Counting Decorator");
        simulator.simulate(abstractDuckFactory);
        System.out.println("\nDuck Simulator: With Abstract Factory, Polite and Counting Decorator");
        simulator.simulate(politeDuckFactory);
    }
    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() + " times");

    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
