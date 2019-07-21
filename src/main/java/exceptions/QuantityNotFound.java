package exceptions;

public class QuantityNotFound extends AssertionError{
public static final String QUANTITY_NOT_FOUND="La cantidad encontrada no corresponde al resultado esperado";
	
	public QuantityNotFound(String message,Throwable cause) {
		super(message,cause);
	}
}
