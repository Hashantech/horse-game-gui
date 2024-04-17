package org.example.course_work;

import javafx.scene.image.Image;

public class Horseinfo {
    private String HorseID;
    private String HorseName;
    private String JockeyName;
    private String Age;
    private String Breed;
    private String RaceRecord;
    private String Group;
    private Image horseImage;

    public Horseinfo(String horseID, String horseName, String jockeyname, String age, String breed, String raceRecord, String group) {
        HorseID = horseID;
        HorseName = horseName;
        JockeyName = jockeyname;
        Age = age;
        Breed = breed;
        RaceRecord = raceRecord;
        Group = group;
    }

    public Horseinfo(String horseID, String horseName, String jockeyname, String age, String breed, String raceRecord, String group, Image horseImage) {
        HorseID = horseID;
        HorseName = horseName;
        JockeyName = jockeyname;
        Age = age;
        Breed = breed;
        RaceRecord = raceRecord;
        Group = group;
        this.horseImage = horseImage;
    }

    public String getHorseID() {
        return HorseID;
    }

    public void setHorseID(String horseID) {
        HorseID = horseID;
    }

    public String getHorseName() {
        return HorseName;
    }

    public void setHorseName(String horseName) {
        HorseName = horseName;
    }

    public String getJockeyName() {
        return JockeyName;
    }

    public void setJockeyName(String jockeyType) {
        JockeyName = jockeyType;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        Group = group;
    }

    public String getRaceRecord() {
        return RaceRecord;
    }

    public void setRaceRecord(String raceRecord) {
        RaceRecord = raceRecord;
    }

    public Image getHorseImage() {
        return horseImage;
    }

    public void setHorseImage(Image horseImage) {
        this.horseImage = horseImage;
    }
}
