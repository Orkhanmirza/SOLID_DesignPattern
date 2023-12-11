package design_pattern.factory;

public class Voleyball implements Game{


    @Override
    public void printGameInfo(GameCategory category) {
        System.out.println(category+" is a game.");
    }
}
