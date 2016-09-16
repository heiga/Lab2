package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by phillip2 on 9/15/16.
 */
public class GoodMood extends Mood {
    public GoodMood(Date date) {
        super(date);
        this.setMood("Good");
    }
    public GoodMood() {
        super();
        this.setMood("Good");
    }

    public String returnMood() {
        return this.getMood();
    }
}
