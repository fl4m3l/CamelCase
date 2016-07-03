
public class Principal {

	public static void main(String[] args)
	{
		try 
		{
			System.out.println(CamelCase.converterCamelCase("numeroCPFContribuinte"));
		} 
		catch (StringInvalidaException e) 
		{
			System.out.println("String invalida -> " + e.getMessage());
		}
	}
}
