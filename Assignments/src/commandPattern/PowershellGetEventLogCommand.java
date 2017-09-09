package commandPattern;

public class PowershellGetEventLogCommand implements Command {

	Powershell powershell;
	
	public PowershellGetEventLogCommand(Powershell powershell) {
		super();
		this.powershell = powershell;
	}

	@Override
	public void execute(String options1, String options2) {
		powershell.getEventLog(options1);
	}

	@Override
	public void undo() {
		System.out.println("There is nothing to undo.");
	}

}
