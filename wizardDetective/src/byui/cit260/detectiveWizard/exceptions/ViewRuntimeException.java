
package byui.cit260.detectiveWizard.exceptions;


public class ViewRuntimeException extends Exception {
  
    public ViewRuntimeException() {
    }

    public ViewRuntimeException(String message) {
        super(message);
    }

    public ViewRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ViewRuntimeException(Throwable cause) {
        super(cause);
    }

    public ViewRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }  
}
