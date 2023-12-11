package design_pattern.factory;

public class FootballFactory implements GameFactory{
    @Override
    public Game createGame() {
        return new Football();
    }
}
