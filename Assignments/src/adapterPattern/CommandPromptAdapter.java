package adapterPattern;

public class CommandPromptAdapter implements BASHCommands {

	CommandPrompt commandPrompt;
	
	public CommandPromptAdapter(CommandPrompt commandPrompt) {
		super();
		this.commandPrompt = commandPrompt;
	}

	@Override
	public void ls() {
		commandPrompt.dir();
	}

	@Override
	public void cd(String directory) {
		commandPrompt.pushd(directory);
	}

	@Override
	public void pwd() {
		commandPrompt.cd();
	}

	@Override
	public void mkdir(String directory) {
		commandPrompt.mkdir(directory);
	}

	@Override
	public void rm_recursive(String directory) {
		commandPrompt.rmdir(directory);
	}

	@Override
	public void rm(String file) {
		commandPrompt.del(file);
	}

}
