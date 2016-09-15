package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by phillip2 on 9/15/16.
 */
public class Tweet {
    private String message;
    private Date date;

    public Tweet(String message){
        this.message = message;
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
