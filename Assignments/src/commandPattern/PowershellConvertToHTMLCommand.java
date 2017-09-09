package commandPattern;

public class PowershellConvertToHTMLCommand implements Command {

	Powershell powershell;
	String lastFileOutput;
	
	public PowershellConvertToHTMLCommand(Powershell powershell) {
		super();
		this.powershell = powershell;
	}

	@Override
	public void execute(String options1, String options2) {
		this.lastFileOutput = options2;
		powershell.convertToHTML(options1, options2);
	}

	@Override
	public void undo() {
		powershell.removeFile(this.lastFileOutput);
	}

}
