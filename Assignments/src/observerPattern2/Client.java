package observerPattern2;

public class Client {

	public static void main(String[] args) {
		
		// Create two Subjects
		Publisher linuxUpdates = new LinuxUpdates();
		Publisher windowsUpdates = new WindowsUpdates();
		
		// Create two Observers
		Subscriber michael = new inboxMichael();
		Subscriber sarah = new inboxSarah();
		
		// Make each Observer watch each Subject (Many-to-many)
		michael.subscribeToMailList(linuxUpdates);
		michael.subscribeToMailList(windowsUpdates);
		sarah.subscribeToMailList(linuxUpdates);
		sarah.subscribeToMailList(windowsUpdates);

		// Update the Linux Subject by putting out new email
		System.out.println("Linux Updates is sending out two new emails...");
		linuxUpdates.addNewEmail("First Linux Email", "This is an email from the Linux mailing list.");
		linuxUpdates.addNewEmail("Second Linux Email", "This is an email from the Linux mailing list.");
		
		// Update the Windows Subject by putting out new email
		System.out.println("Windows Updates is sending out a new email...");
		windowsUpdates.addNewEmail("First Windows Email", "This is an email from the Windows mailing list.");
		
		System.out.println();
		System.out.println();
		
		// Simulate Observer clicking on both the Linux and Windows icon/text
		// and fetching the latest emails from both Subjects.
		// This allows the Observer to control when he retrieves his email
		System.out.println("Michael is checking his email...");
		System.out.println();
		
		michael.fetchLatestEmails(linuxUpdates);
		michael.fetchLatestEmails(windowsUpdates);
		
		// Read the emails that the first Observer fetched from the Subjects
		michael.readLatestEmails();
		
		// Update the Linux Subject by putting out new email
		System.out.println("Linux Updates is sending out a new email...");
		linuxUpdates.addNewEmail("Third Linux Email", "This is an email from the Linux mailing list.");
		
		// Update the Windows Subject by putting out new email
		System.out.println("Windows Updates is sending out two new emails...");
		windowsUpdates.addNewEmail("Second Windows Email", "This is an email from the Windows mailing list.");
		windowsUpdates.addNewEmail("Third Windows Email", "This is an email from the Windows mailing list.");
		
		System.out.println();
		System.out.println();
		
		// Fetch new emails again to show that Observer is only getting
		// the latest unread emails
		System.out.println("Michael is checking his email again...");
		System.out.println();
		michael.fetchLatestEmails(linuxUpdates);
		michael.fetchLatestEmails(windowsUpdates);
		
		// Print out the latest unread emails
		michael.readLatestEmails();
		
		
		// This Observer doesn't check her email very often
		// so she will fetch more unread emails than the previous Observer
		System.out.println("Sarah is checking her email for the first time...");
		System.out.println();
		sarah.fetchLatestEmails(linuxUpdates);
		sarah.fetchLatestEmails(windowsUpdates);
		
		// Read all of the emails that the second Observer fetched from the Subjects
		sarah.readLatestEmails();

	}

}
