package commandPattern;

public class PathnameCommand implements Command {

	Console console;
	
	public PathnameCommand(Console console) {
		super();
		this.console = console;
	}

	@Override
	public void execute(String options1, String options2) {
		console.pathnameDirectory();
	}

	@Override
	public void undo() {
		System.out.println("There is nothing to undo.");
	}

}
