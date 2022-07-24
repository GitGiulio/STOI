package myproject.data;

import java.time.Duration;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Date;

public class Skater {
    private String name;
    private String surname;
    private String nation;
    private String UPIDCode;
    private gender gender;
    private Date birthdate;
    private char category;
    private String club;
    private ArrayList<Record> records;
    private Career career;

    private int superPrestigePoints;

    public Skater(String name,String surname,String nation,gender gender, Date birthdate,char category,String club){
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.nation = nation;
        this.gender = gender;
        this.club = club;
        superPrestigePoints = 0;
        this.category = category;
        this.setUPIDCode();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getNation() {
        return nation;
    }
    public void setNation(String nation) {
        this.nation = nation;
    }
    public String getUPIDCode() {
        return UPIDCode;
    }
    public void setUPIDCode() {
        this.UPIDCode = "UPIDCode"; // TODO make a UPIDCode
    }
    public Skater.gender getGender() {
        return gender;
    }
    public void setGender(Skater.gender gender) {
        this.gender = gender;
    }
    public Date getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public char getCategory() {
        return category;
    }
    public void setCategory(char category) {
        this.category=category;
    }
    public String getClub() {
        return club;
    }
    public void setClub(String club) {
        this.club = club;
    }
    public int getSuperPrestigePoints() {
        return superPrestigePoints;
    }
    public void setSuperPrestigePoints(int superPrestigePoints) {
        this.superPrestigePoints = superPrestigePoints;
    }
    public Career getCareer() {
        return career;
    }
    public void setCareer(Career career) {
        this.career = career;
    }
    public ArrayList<Record> getRecords() {
        return records;
    }
    public void setRecords(ArrayList<Record> records) {
        this.records = records;
    }
    public enum gender{
        MALE,
        FEMALE,
    }
}
