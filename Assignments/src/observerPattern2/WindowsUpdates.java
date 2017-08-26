package observerPattern2;

import java.util.ArrayList;

public class WindowsUpdates implements Publisher {
	
	private ArrayList<Subscriber> subscribers;
	private ArrayList<String> emails;
	private String publisherName;
	
	public WindowsUpdates() {
		publisherName = "Windows Updates";
		subscribers = new ArrayList<>();
		emails = new ArrayList<>();
	}
	
	public void registerSubscriber(Subscriber sub) {
		subscribers.add(sub);
	}
	public void removeSubscriber(Subscriber sub) {
		int i = subscribers.indexOf(sub);
		if(i >= 0) {
			subscribers.remove(i);
		}
	}
	public void notifySubscribers() {
		for(int i = 0; i < subscribers.size(); i++) {
			Subscriber sub = (Subscriber)subscribers.get(i);
			sub.updateUnread(this);
		}
	}
	public void addNewEmail(String title, String content) {
		StringBuffer newEmail = new StringBuffer();
		newEmail.append(title + "\n");
		newEmail.append(content + "\n");
		
		emails.add(newEmail.toString());
		notifySubscribers();
	}
	public String[] returnUnreadEmails(int numberUnread) {
		String[] unreadEmails = new String[numberUnread];
		for(int i = 0; i < numberUnread; i++) {
			unreadEmails[i] = emails.get((emails.size()-1) - i);
		}
		return unreadEmails;
	}
	
	// Getters
	public String getPublisherName() {
		return this.publisherName;
	}
}