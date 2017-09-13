package adapterPattern;

public class BASH implements BASHCommands {
	public void ls() {
		System.out.println("ls");
	}
	public void cd(String directory) {
		System.out.println("cd " + directory);
	}
	public void pwd() {
		System.out.println("pwd");
	}
	public void mkdir(String directory) {
		System.out.println("mkdir " + directory);
	}
	public void rm_recursive(String directory) {
		System.out.println("rm -r " + directory);
	}
	public void rm(String file) {
		System.out.println("rm " + file);
	}
}
