import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        System.out.println(tinkerTailor(10, 2));

    }

    public static List<Integer> tinkerTailor(int listLength, int sequence){
        List<Integer> players = new ArrayList<>();
        List<Integer> excludedPlayers = new ArrayList<>();
        for (int i = 1; i < listLength + 1; i++) {
            players.add(i);
        }
        int indexPointer = -1;
        while(players.size() > 1) {
            for (int step = 0; step < sequence; step++) {
                indexPointer++;
                //if indexPointer run over the players List
                if (indexPointer == players.size()) {
                    indexPointer = 0;
                }
            }
            excludedPlayers.add(players.get(indexPointer));
            players.remove(indexPointer);
            indexPointer--;
            if (indexPointer == -1) {
                indexPointer = players.size() - 1;
            }
        }
        return excludedPlayers;
    }
}
