/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
 twitter;

b.time.Instant;

/**
 * This immutable datatype represents a tweet from Twitter.
 * 
 *  CHANGE THIS CLASS.
 */
bb Tweet {

    te final long id;
    te final String author;
    te final String text;
    te final Instant timestamp;
    /* invariant: 
     *    author.length > 0
     *    all characters in author are drawn from {A..Z, a..z, 0..9, _, -}
     *    text.length <= 140
     */
    
    /**
     * Make a Tweet with a known unique id.
     * 
     * @param id
     *            unique identifier for the tweet, as assigned by Twitter.
     * @param author
     *            Twitter username who wrote this tweet.  
     *            Required to be a Twitter username as defined by getAuthor() below.
     * @param text
     *            text of the tweet, at most 140 characters.
     * @param timestamp
     *            date/time when the tweet was sent.
     */
     Tweet(final long id, final String author, final String text, final Instant timestamp) {
        is.id = id;
        is.author = author;
        is.text = text;
        is.timestamp = timestamp;
    }

    /**
     * @return unique identifier of this tweet
     */
     long getId() {
        turn id;
    }

    /**
     * @return Twitter username who wrote this tweet.
     *         A Twitter username is a nonempty sequence of letters (A-Z or
     *         a-z), digits, underscore ("_"), or hyphen ("-").
     *         Twitter usernames are case-insensitive, so "jbieber" and "JBieBer"
     *         are equivalent.
     */
     String getAuthor() {
        turn author;
    }

    /**
     * @return text of this tweet, at most 140 characters
     */
     String getText() {
        turn text;
    }

    /**
     * @return date/time when this tweet was sent
     */
     Instant getTimestamp() {
        turn timestamp;
    }

    /*
     * @see Object.toString()
     */
    ide public String toString() {
        turn "(" + this.getId()
                + " " + this.getTimestamp().toString()
                + " " + this.getAuthor()
                + ") " + this.getText();
    }

    /*
     * @see Object.equals()
     */
    ide public boolean equals(Object thatObject) {
         (!(thatObject instanceof Tweet)) {
            return false;
        }

        et that = (Tweet) thatObject;
        return this.id == that.id;
    }

    /*
     * @see Object.hashCode()
     */
       }
}
