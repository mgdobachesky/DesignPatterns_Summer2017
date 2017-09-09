package commandPattern;

public class User {

	public static void main(String[] args) {
	
		// Initialize the Invoker
		BrowserOS browserOs = new BrowserOS();
		
		// Initialize the Receivers
		BASH bash = new BASH();
		Powershell powershell = new Powershell();
		
		// Initialize BASH's commands
		ListDirectoryCommand bashListDirectory = new ListDirectoryCommand(bash);
		ChangeDirectoryCommand bashChangeDirectory = new ChangeDirectoryCommand(bash);
		PathnameCommand bashPathname = new PathnameCommand(bash);
		CreateDirectoryCommand bashCreateDirectory = new CreateDirectoryCommand(bash);
		RemoveDirectoryCommand bashRemoveDirectory = new RemoveDirectoryCommand(bash);
		BASHGetFromWebCommand bashGetFromWeb = new BASHGetFromWebCommand(bash);
		BASHGetSystemProcessesCommand bashGetSystemProcesses = new BASHGetSystemProcessesCommand(bash);
		
		// Initialize Powershell's commands
		ListDirectoryCommand powershellListDirectory = new ListDirectoryCommand(powershell);
		ChangeDirectoryCommand powershellChangeDirectory = new ChangeDirectoryCommand(powershell);
		PathnameCommand powershellPathname = new PathnameCommand(powershell);
		CreateDirectoryCommand powershellCreateDirectory = new CreateDirectoryCommand(powershell);
		RemoveDirectoryCommand powershellRemoveDirectory = new RemoveDirectoryCommand(powershell);
		PowershellGetEventLogCommand powershellGetEventLog = new PowershellGetEventLogCommand(powershell);
		PowershellConvertToHTMLCommand powershellConvertToHTML = new PowershellConvertToHTMLCommand(powershell);
		
		// Execute some remote BASH shell commands
		System.out.println("Execute some remote BASH shell commands: ");
		browserOs.executeCommand(bashListDirectory);
		browserOs.executeCommand(bashChangeDirectory, "Desktop");
		browserOs.executeCommand(bashPathname);
		browserOs.executeCommand(bashCreateDirectory, "NewDirectory");
		browserOs.executeCommand(bashRemoveDirectory, "OldDirectory");
		browserOs.executeCommand(bashGetFromWeb, "www.website.com");
		browserOs.executeCommand(bashGetSystemProcesses);
		
		// Execute some remote BASH shell commands
		System.out.println("\nExecute some remote Powershell shell commands: ");
		browserOs.executeCommand(powershellListDirectory);
		browserOs.executeCommand(powershellChangeDirectory, "Desktop");
		browserOs.executeCommand(powershellPathname);
		browserOs.executeCommand(powershellCreateDirectory, "NewDirectory");
		browserOs.executeCommand(powershellRemoveDirectory, "OldDirectory");
		browserOs.executeCommand(powershellGetEventLog, "Application");
		browserOs.executeCommand(powershellConvertToHTML, "C:\\textToHTML.txt", "C:\\myHTML.htm");
		
		// Undo the last command run
		System.out.println("\nUndo last command: ");
		browserOs.undoCommand();
		
	}

}
