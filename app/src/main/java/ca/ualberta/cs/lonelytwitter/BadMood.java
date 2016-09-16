package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by phillip2 on 9/15/16.
 */
public class BadMood extends Mood {
    public BadMood(Date date) {
        super(date);
        this.setMood("Bad");
    }
    public BadMood() {
        super();
        this.setMood("Bad");
    }

    public String returnMood() {
        return this.getMood();
    }
}
