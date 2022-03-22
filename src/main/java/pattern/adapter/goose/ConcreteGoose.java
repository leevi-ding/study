package pattern.adapter.goose;

import pattern.adapter.Goose;

public class ConcreteGoose implements Goose {
    @Override
    public void run() {
        System.out.println("goose is running");
    }

    @Override
    public void honk() {
        System.out.println("goose is honking");
    }
}
