package observerPattern2;

public interface Subscriber {
	public void updateUnread(Publisher publisher);
	public void fetchLatestEmails(Publisher publisher);
	public void readLatestEmails();
	public void subscribeToMailList(Publisher publisher);
}
