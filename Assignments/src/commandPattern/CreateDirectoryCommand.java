package commandPattern;

public class CreateDirectoryCommand implements Command {

	Console console;
	String lastCreatedDirectory;
	
	public CreateDirectoryCommand(Console console) {
		super();
		this.console = console;
	}

	@Override
	public void execute(String options1, String options2) {
		this.lastCreatedDirectory = options1;
		console.createDirectory(options1);
	}

	@Override
	public void undo() {
		console.removeDirectory(lastCreatedDirectory);
	}

}
