//6510450658 Pinapwat Limsuwat
package QuackSimulator.Factory;

import Duck.*;
import QuackSimulator.QuackPolitely;

public class PoliteDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackPolitely(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackPolitely(new RedHeadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackPolitely(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackPolitely(new RubberDuck());
    }
}
