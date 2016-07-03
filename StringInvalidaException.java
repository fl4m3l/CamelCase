
public class StringInvalidaException extends Exception 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String original;
	
	public StringInvalidaException()
	{
		super();
	}
	
	public StringInvalidaException(String original)
	{
		super(original);
	}
}
