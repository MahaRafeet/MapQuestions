import java.util.HashMap;
import java.util.Map;

class Scoreboard {
    public static void main(String[] args) {
        Map<String,Integer>scores=new HashMap<>();
        scores.put("Maha", 25);
        scores.put("hanin",8);
        scores.put("manal",2);
        System.out.println(findTopPlayer(scores));
    }
    public static String findTopPlayer(Map<String, Integer> scores) {
        if (scores == null || scores.isEmpty()) {
            return null;
        }

        String topPlayer = null;
        int maxScore = -1; // Assuming scores are non-negative

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            if (entry.getValue() > maxScore) {
                topPlayer = entry.getKey();     // ✅ assign new top player
                maxScore = entry.getValue();
            }
        }
        return topPlayer;


    }
}