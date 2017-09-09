package commandPattern;

public class ListDirectoryCommand implements Command {

	Console console;
	
	public ListDirectoryCommand(Console console) {
		super();
		this.console = console;
	}

	@Override
	public void execute(String options1, String options2) {
		console.listDirectory();
	}

	@Override
	public void undo() {
		System.out.println("There is nothing to undo.");
	}

}
