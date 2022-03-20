package pattern.command.industry;

public class Television {
    private int channel = 1;

    public void on() {
        System.out.println("television on");
    }

    public void off() {
        System.out.println("television off");
    }

    public void channelUp() {
        System.out.println("television channel up");
    }

    public void channelDown() {
        System.out.println("television channel down");
    }
}
