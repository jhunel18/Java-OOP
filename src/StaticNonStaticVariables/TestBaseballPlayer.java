package StaticNonStaticVariables;

public class TestBaseballPlayer {
    public static void main(String[] args) {
        BaseballPlayer aCatcher = new BaseballPlayer(12, .218);

        BaseballPlayer aShortstop = new BaseballPlayer(31,.385);


        BaseballPlayer anOutFielder = new BaseballPlayer(44, .505);
        anOutFielder.showPlayer();
        aCatcher.showPlayer();
        aCatcher.showPlayer();

        BaseballPlayer testPlayer = new BaseballPlayer(100, .75);
        testPlayer.showPlayer();
    }
}
