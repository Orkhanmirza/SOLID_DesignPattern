package design_pattern.factory;

public class VoleyballFactory implements GameFactory{
    @Override
    public Game createGame() {
        return new Voleyball();
    }
}
