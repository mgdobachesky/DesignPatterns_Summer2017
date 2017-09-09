package commandPattern;

public class BASH implements Console {

	public void getFromWeb(String url) {
		System.out.println("wget " + url);
	}
	
	public void getSystemProcesses() {
		System.out.println("top");
	}
	
	@Override
	public void listDirectory() {
		System.out.println("ls");
	}

	@Override
	public void changeDirectory(String changeDirectory) {
		System.out.println("cd " + changeDirectory);
	}
	
	@Override
	public void revertChangeDirectory() {
		System.out.println("cd -");
	}

	@Override
	public void pathnameDirectory() {
		System.out.println("pwd");
	}

	@Override
	public void createDirectory(String createDirectory) {
		System.out.println("mkdir " + createDirectory);
	}

	@Override
	public void removeDirectory(String removeDirectory) {
		System.out.println("rm -r " + removeDirectory);
	}
	
	@Override
	public void removeFile(String removeFile) {
		System.out.println("rm " + removeFile);
	}

}
