package myproject.data;

import java.util.HashMap;

public class Career {
    HashMap<String,Competition> career;

    public Career(){
        career = new HashMap<>();
    }

    public void addCompetition(Competition competition){
        career.put(competition.getName(),competition);
    }
}
