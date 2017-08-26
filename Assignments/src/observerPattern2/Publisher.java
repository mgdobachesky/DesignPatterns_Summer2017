package observerPattern2;

public interface Publisher {
	public void registerSubscriber(Subscriber sub);
	public void removeSubscriber(Subscriber sub);
	public void notifySubscribers();
	public void addNewEmail(String title, String content);
	public String[] returnUnreadEmails(int numberUnread);
	public String getPublisherName();
}
