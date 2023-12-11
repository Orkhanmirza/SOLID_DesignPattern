package design_pattern.factory;

import static design_pattern.factory.GameCategory.VOLEYBALL;

public class Main {

    public static void main(String[] args) {
        GameFactory gameFactory = getGameFactory(VOLEYBALL);
        Game game= gameFactory.createGame();
         game.printGameInfo(VOLEYBALL);
    }

    private static GameFactory getGameFactory(GameCategory category){
      return switch (category){
          case FOOTBALL -> new FootballFactory();
          case VOLEYBALL -> new VoleyballFactory();
      };
    }
}
