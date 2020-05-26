package com.company;

public class Url_Fixer {
    public static void main(String[] args) {

        StringBuffer url = new StringBuffer( "https//www.reddit.com/r/nevertellmethebots");

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!


        url.replace(38,42,"odds");
        url.insert(5,":");

            System.out.println(url);
        }






    }

