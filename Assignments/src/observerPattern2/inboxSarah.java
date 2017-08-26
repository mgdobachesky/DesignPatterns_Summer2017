package observerPattern2;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class inboxSarah implements Subscriber {
	
	private ArrayList<Publisher> publishers;
	private LinkedHashMap<String, Integer> unreadEmailCounts;
	private LinkedHashMap<String, String[]> unreadEmails;
	
	public inboxSarah() {
		publishers = new ArrayList<>();
		unreadEmailCounts = new LinkedHashMap<>();
		unreadEmails = new LinkedHashMap<>();
	}
	
	public void subscribeToMailList(Publisher publisher) {
		publisher.registerSubscriber(this);
		String publisherName = publisher.getPublisherName();
		int nextAvailableSpot = publishers.size();
		publishers.add(nextAvailableSpot, publisher);
		unreadEmailCounts.put(publisherName, 0);
	}
	public void updateUnread(Publisher publisher) {
		String publisherName = publisher.getPublisherName();
		int numberUnread = unreadEmailCounts.get(publisherName);
		unreadEmailCounts.put(publisherName, ++numberUnread);
	}
	public void fetchLatestEmails(Publisher publisher) {
		String publisherName = publisher.getPublisherName();
		String[] unread = publisher.returnUnreadEmails(unreadEmailCounts.get(publisherName));
		unreadEmails.put(publisherName, unread);
	}
	public void readLatestEmails() {
		ArrayList<String> readEmails = new ArrayList<>();
		if(!unreadEmails.isEmpty() && !(unreadEmails == null)) {
			unreadEmails.forEach((publisherName, emails) -> {
					System.out.println("~ " + publisherName + " for Sarah ~\n");
					for(int i = 0; i < emails.length; i++) {
						System.out.println(emails[i]);
					}
					System.out.println("\n");
					unreadEmailCounts.put(publisherName, 0);
					readEmails.add(publisherName);
			});
			for(int i = 0; i < readEmails.size(); i++) {
				unreadEmails.remove(readEmails.get(i));
			}
		}
	}
}
