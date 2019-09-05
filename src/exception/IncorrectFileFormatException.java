package exception;

public class IncorrectFileFormatException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public IncorrectFileFormatException (int lineNum) {
		super ("Format error in the Graph File in line number " + lineNum);
	}
}
