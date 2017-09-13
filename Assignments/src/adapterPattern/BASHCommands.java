package adapterPattern;

public interface BASHCommands {
	public void ls();
	public void cd(String directory);
	public void pwd();
	public void mkdir(String directory);
	public void rm_recursive(String directory);
	public void rm(String file);
}
