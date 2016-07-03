
public class StringInvalidaException extends Exception 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String palavraNaoCamelCase;
	
	public StringInvalidaException()
	{
		super();
	}
	
	public StringInvalidaException(String palavraNaoCamelCase)
	{
		super(palavraNaoCamelCase);
	}
}
