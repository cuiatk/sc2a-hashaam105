/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package twitter;

import java.util.List;
import java.util.Set;
import java.util.Instant;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Extract consists of methods that extract information from a list of tweets.
 * 
 * DO NOT change the method signatures and specifications of these methods, but
 * you should implement their method bodies, and you may add new public or
 * private methods or classes if you like.
 */
public class Extract {

    /**
     * Get the time period spanned by tweets.
     * 
     * @param tweets
     *            list of tweets with distinct ids, not modified by this method.
     * @return a minimum-length time interval that contains the timestamp of
     *         every tweet in the list.
     */
    
   
    public static Set<String> getMentionedUsers(List<Tweet> tweets) {
       Instant start = tweets.get(0)getTimestamp();
       Instant end = tweets.get(tweets.size()-1).getTimestamp();
       Timespan t = new Timespan(start,end);
       return t;
    }
    public static Set<String> getMentionedUsers(List<Tweet> tweets){
    	Set<String> mentioned = new HashSet<String>();
    	String tweetString = tweets.get(0).getText();
    	Pattern pattern = Pattern.compile("@\\w+");
    	Matcher matcher = pattern.matcher(tweetString);
    	while (matcher.find()){
    		mentioned.add(matcher.group();}
    	}
    return mentioned;
    }
}
