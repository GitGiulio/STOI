package myproject.data;

import javax.xml.datatype.Duration;
import javax.xml.stream.Location;
import java.util.Date;

public class Record {
    private int distance;
    private Duration time;
    private Date date;
    // Location location; TODO chose implementation
    private String location;
    private Competition competition;

    public Record(int distance,Duration time,Date date,Competition competition){
        this.distance = distance;
        this.time = time;
        this.date = date;
        this.location = competition.getLocation();
        this.competition = competition;
    }

    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    public Duration getTime() {
        return time;
    }
    public void setTime(Duration time) {
        this.time = time;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Competition getCompetition() {
        return competition;
    }
    public void setCompetition(Competition competition) {
        this.competition = competition;
    }
}
