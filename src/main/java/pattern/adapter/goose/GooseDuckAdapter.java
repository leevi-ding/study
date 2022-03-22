package pattern.adapter.goose;

import pattern.adapter.Goose;
import pattern.strategy.designed.Duck;

public class GooseDuckAdapter implements Duck {

    private Goose goose;

    public GooseDuckAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void fly() {
        goose.run();
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
