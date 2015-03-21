package byui.cit260.detectiveWizard.exceptions;

public class PlayerControlException extends Exception {

    public PlayerControlException() {
    }

    public PlayerControlException(String message) {
        super(message);
    }

    public PlayerControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlayerControlException(Throwable cause) {
        super(cause);
    }

    public PlayerControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
