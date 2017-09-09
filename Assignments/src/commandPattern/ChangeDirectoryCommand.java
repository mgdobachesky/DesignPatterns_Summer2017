package commandPattern;

public class ChangeDirectoryCommand implements Command {

	Console console;
	
	public ChangeDirectoryCommand(Console console) {
		super();
		this.console = console;
	}

	@Override
	public void execute(String options1, String options2) {
		console.changeDirectory(options1);
	}

	@Override
	public void undo() {
		console.revertChangeDirectory();
	}

}
