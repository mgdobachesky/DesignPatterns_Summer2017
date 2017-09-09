package commandPattern;

public class Powershell implements Console {
	
	public void getEventLog(String eventLog) {
		System.out.println("Get-EventLog -Log \"" + eventLog + "\"");
	}
	
	public void convertToHTML(String input, String output) {
		System.out.println("Get-Content -Path " + input 
				+ " | ConvertTo-HTML -Property Name, Status > " + output);
	}

	@Override
	public void listDirectory() {
		System.out.println("dir");
	}

	@Override
	public void changeDirectory(String changeDirectory) {
		System.out.println("pushd " + changeDirectory);
	}
	
	@Override
	public void revertChangeDirectory() {
		System.out.println("popd");
	}

	@Override
	public void pathnameDirectory() {
		System.out.println("cd");
	}

	@Override
	public void createDirectory(String createDirectory) {
		System.out.println("mkdir " + createDirectory);
	}

	@Override
	public void removeDirectory(String removeDirectory) {
		System.out.println("rmdir " + removeDirectory);
	}
	
	@Override
	public void removeFile(String removeFile) {
		System.out.println("del " + removeFile);
	}

}
