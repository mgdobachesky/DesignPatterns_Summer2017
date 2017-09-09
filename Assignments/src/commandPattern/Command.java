package commandPattern;

public interface Command {
	public void execute(String options1, String options2);
	public void undo();
}
