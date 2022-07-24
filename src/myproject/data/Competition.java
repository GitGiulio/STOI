package myproject.data;

import javax.xml.stream.Location;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Competition {
    private String name;
    private Date startingDate;
    private Date finishDate;
    private String location;
    // Location location; //TODO chose
    private HashMap<Integer,Skater> competitors;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getStartingDate() {
        return startingDate;
    }
    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }
    public Date getFinishDate() {
        return finishDate;
    }
    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public void  addCompetitor(Integer number,Skater competitor){
        competitors.put(number,competitor);
    }
}
