package Test;

public class NoScoreException extends RuntimeException {
    public NoScoreException(String message) {
        super(message);
    }

    public NoScoreException() {
    }
}
