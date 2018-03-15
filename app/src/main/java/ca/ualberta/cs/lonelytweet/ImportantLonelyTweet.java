package ca.ualberta.cs.lonelytweet;

import android.util.Log;

import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet {

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 10) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
        Log.i("importantLonelyTweet", getTweetDate() + " | " + getTweetBody());
		return getTweetDate() + " | " + getTweetBody();
	}
}