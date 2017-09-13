package adapterPattern;

public class CommandPrompt {
	public void dir() {
		System.out.println("dir");
	}
	public void pushd(String directory) {
		System.out.println("pushd " + directory);
	}
	public void cd() {
		System.out.println("cd");
	}
	public void mkdir(String directory) {
		System.out.println("mkdir " + directory);
	}
	public void rmdir(String directory) {
		System.out.println("rmdir " + directory);
	}
	public void del(String file) {
		System.out.println("del " + file);
	}
}
