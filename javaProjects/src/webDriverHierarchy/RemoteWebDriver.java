package webDriverHierarchy;

public class RemoteWebDriver implements WebDriver, JavaScriptExecutor, TakeScreenshot {
	@Override
	public void findElement() {
		System.out.println("Find Element is implementd");
		
	}
	
	@Override
	public void get() {
		System.out.println("Get is implemented");
	}
	
	@Override
	public void getScreenShot() {
		System.out.println("Get ScreenShot is implemented");
	}
	
	@Override
	public void executeScript() {
		System.out.println("Execute Script is implemented");
	}
}
