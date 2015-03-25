package byui.cit260.detectiveWizard.view;

import detectiveWizard.DetectiveWizard;
import java.io.PrintWriter;

public class ErrorView {

    private static final PrintWriter errorFile = DetectiveWizard.getOutFile();

    public static void display(String className, String errorMessage) {

        errorFile.println(
                "-------------------------------------------------------------------"
                + "\n- Error -" + errorMessage
                + "\n-------------------------------------------------------------------");
    }
}
