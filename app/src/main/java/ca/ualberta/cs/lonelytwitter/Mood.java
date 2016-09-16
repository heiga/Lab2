package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by phillip2 on 9/15/16.
 */
public abstract class Mood implements Moodable{
    private String mood;
    private Date date;

    public Mood(){
        this.date = new Date();
    }

    public Mood(Date inputtedDate){
        this.date = inputtedDate;
    }

    public String getMood() {
        return mood;
    }

    public Date getDate() {
        return date;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
