package factoryPattern;

public class NoSuchItemFoundException extends Exception {
	NoSuchItemFoundException() {
		
	}
	
	NoSuchItemFoundException(String msg){
		super(msg);
	}
}
