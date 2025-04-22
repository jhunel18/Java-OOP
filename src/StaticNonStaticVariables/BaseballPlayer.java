package StaticNonStaticVariables;

public class BaseballPlayer {
    private static int count;
    private  int playerId;
    private double battingAvg;

    public BaseballPlayer(int id, double avg){
        playerId = id;
        battingAvg = avg;
        count = count + 1;
    }

    public void showPlayer(){
        System.out.println("Player ID " + playerId + " Batting Average " + battingAvg + " Current Number of Players: " + count);
    }
}
