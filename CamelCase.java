import java.util.ArrayList;
import java.util.List;

public class CamelCase
{	
	public boolean temCharEspecial(String palavraCamelCase)
	{
		return palavraCamelCase.split(("\\W")).length > 1;
	}

	public boolean comecaComNumero(String palavraCamelCase)
	{
		return palavraCamelCase.substring(0, 1).matches("\\d");
	}

	public static List<String> converterCamelCase(String palavraCamelCase) 
			throws StringInvalidaException 
	{
		CamelCase c = new CamelCase();
		if (c.comecaComNumero(palavraCamelCase) || c.temCharEspecial(palavraCamelCase))
			throw new StringInvalidaException(palavraCamelCase);
		return quebraCamelCase(palavraCamelCase);
	}
	
	private static List<String> quebraCamelCase(String palavraCamelCase)
	{
		List<String> listaDePalavras = new ArrayList<String>();
		for (String str : palavraCamelCase.split("(?<=[a-z])(?=[A-Z])|(?<=[A-Z])(?=[A-Z][a-z])|(?=[^a-z][^A-Z])"))
			listaDePalavras.add(str.toLowerCase());
		return listaDePalavras;
	}
}