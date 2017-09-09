package commandPattern;

public class RemoveDirectoryCommand implements Command {

	Console console;
	String lastDeletedDirectory;
	
	public RemoveDirectoryCommand(Console console) {
		super();
		this.console = console;
	}

	@Override
	public void execute(String options1, String options2) {
		this.lastDeletedDirectory = options1;
		console.removeDirectory(options1);
	}

	@Override
	public void undo() {
		console.createDirectory(lastDeletedDirectory);
	}

}
