package exceptions;

public class NameNotFound extends AssertionError {
public static final String NAME_NOT_FOUND="el nombre encontrada no corresponde al resultado esperado";
	
	public NameNotFound(String message,Throwable cause) {
		super(message,cause);
	}

}
