package webDriverHierarchy;

public class Driver {
	public static void main(String[] args) {
		WebDriver wd  = new FirefoxDriver();
		wd.findElement();
		wd.get();
		
		System.out.println("=====================================");
		
		TakeScreenshot ts = (TakeScreenshot) wd;
		ts.getScreenShot();
		
		System.out.println("====================================");
		
		FirefoxDriver fd = (FirefoxDriver) wd;
		fd.findElement();
		fd.get();
		fd.executeScript();
		fd.getScreenShot();
		
		System.out.println("======================================");
		
		fd.test(); // default method
		System.out.println("---------------------------------------");
		fd.demo(); // default method
		
		System.out.println("======================================");
		
		SearchContext.pay("we can also call static method via interface reference"); // we can also call static method via interface reference
		
		System.out.println("=======================================");
		
		JavaScriptExecutor js = (JavaScriptExecutor) fd;
		js.executeScript();
		
	}
}
