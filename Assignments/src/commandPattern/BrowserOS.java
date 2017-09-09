package commandPattern;

public class BrowserOS {

	private Command command;
	private Command undo;
	
	public BrowserOS() {
		// Null the commands to ensure their memory space is clear
		Command noCommand = new NoCommand();
		command = noCommand;
		undo = noCommand;
	}
	
	private void setCommand(Command command) {
		this.command = command;
	}
	
	private void setUndo(Command command) {
		this.undo = command;
	}
	
	public void executeCommand(Command command, String options1, String options2) {
		this.setCommand(command);
		this.setUndo(command);
		this.command.execute(options1, options2);
	}
	
	public void executeCommand(Command command, String options1) {
		String options2 = "";
		this.executeCommand(command, options1, options2);
	}
	
	public void executeCommand(Command command) {
		String options1 = "";
		String options2 = "";
		this.executeCommand(command, options1, options2);
	}
	
	public void undoCommand() {
		undo.undo();
	}
}
