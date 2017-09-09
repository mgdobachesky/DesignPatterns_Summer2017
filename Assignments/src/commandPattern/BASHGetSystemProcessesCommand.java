package commandPattern;

public class BASHGetSystemProcessesCommand implements Command {

	BASH bash;
	
	public BASHGetSystemProcessesCommand(BASH bash) {
		super();
		this.bash = bash;
	}

	@Override
	public void execute(String options1, String options2) {
		bash.getSystemProcesses();
	}

	@Override
	public void undo() {
		System.out.println("There is nothing to undo.");
	}

}
