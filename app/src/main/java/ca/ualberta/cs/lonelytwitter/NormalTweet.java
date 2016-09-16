package ca.ualberta.cs.lonelytwitter;

/**
 * Created by phillip2 on 9/15/16.
 */
public class NormalTweet extends Tweet {
    public NormalTweet(String message) {
        super(message);
    }

    public Boolean isImportant() {
        return Boolean.FALSE;
    }


}
