package ca.ualberta.cs.lonelytwitter;

/**
 * Created by phillip2 on 9/15/16.
 */
public class ImportantTweet extends Tweet{
    public ImportantTweet(String message){
        super(message);
    }

    //not operationional, for flagging
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
