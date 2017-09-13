package adapterPattern;

public class User {

	public static void main(String[] args) {
		BASH bash = new BASH();
		try {
			System.out.println("~~ Make a BASH shell and print BASH commands ~~");
			runBASHCommands(bash);
		} catch(NotBashException e) {
			System.out.println(e);
		}
		
		System.out.println();

		CommandPrompt commandPrompt = new CommandPrompt();
		try {
			System.out.println("~~ Make a command line shell and try to print BASH commands ~~");
			runBASHCommands(commandPrompt);
		} catch(NotBashException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		CommandPromptAdapter adaptedCommandPrompt = new CommandPromptAdapter(commandPrompt);
		try {
			System.out.println("~~ Adapt the command line shell and print BASH commands ~~");
			runBASHCommands(adaptedCommandPrompt);
			System.out.println();
		} catch(NotBashException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void runBASHCommands(Object bash) throws NotBashException {
		if(bash instanceof BASHCommands) {
			((BASHCommands)bash).ls();
			((BASHCommands)bash).cd("/change_directory");
			((BASHCommands)bash).pwd();
			((BASHCommands)bash).mkdir("new_directory");
			((BASHCommands)bash).rm_recursive("old_directory");
			((BASHCommands)bash).rm("old_file");
		} else {
			throw new NotBashException(bash.getClass().getName() + " is not an instance of a BASH shell");
		}
	}

}
