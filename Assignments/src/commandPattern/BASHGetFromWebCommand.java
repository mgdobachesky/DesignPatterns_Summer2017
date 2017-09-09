package commandPattern;

public class BASHGetFromWebCommand implements Command {

	BASH bash;
	
	public BASHGetFromWebCommand(BASH bash) {
		super();
		this.bash = bash;
	}

	@Override
	public void execute(String options1, String options2) {
		bash.getFromWeb(options1);
	}

	@Override
	public void undo() {
		System.out.println("There is nothing to undo.");
	}

}
