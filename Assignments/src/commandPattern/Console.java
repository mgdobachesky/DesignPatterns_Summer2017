package commandPattern;

public interface Console {
	public void listDirectory();
	public void changeDirectory(String changeDirectory);
	public void revertChangeDirectory();
	public void pathnameDirectory();
	public void createDirectory(String createDirectory);
	public void removeDirectory(String removeDirectory);
	public void removeFile(String removeFile);
}
