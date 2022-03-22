package pattern.adapter;

import lombok.Getter;
import lombok.Setter;
import pattern.adapter.goose.ConcreteGoose;
import pattern.adapter.goose.GooseDuckAdapter;
import pattern.strategy.designed.Duck;
import pattern.strategy.designed.duck.DuckA;
import pattern.strategy.designed.duck.DuckB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

    @Setter
    private List<Duck> ducks;

    public static void main(String[] args) {
        Client client = new Client();
        GooseDuckAdapter gooseA = new GooseDuckAdapter(new ConcreteGoose());
        DuckA duckA = new DuckA();
        DuckB duckB = new DuckB();
        List<Duck> ducks = Arrays.asList(gooseA, duckA, duckB);
        client.execute(ducks);
    }

    public void fly(){
        ducks.forEach(Duck::fly);
    }
    public void quack(){
        ducks.forEach(Duck::quack);
    }

    private void execute(List<Duck> ducks){
        Client client = new Client();
        client.setDucks(ducks);
        client.fly();
        client.quack();
    }

}
