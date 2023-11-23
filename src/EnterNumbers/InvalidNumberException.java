package EnterNumbers;

public class InvalidNumberException extends RuntimeException {

    public InvalidNumberException(String message) {
        super(message);
    }

    public InvalidNumberException(String message, Exception cause) {
        super(message, cause);
    }
}
