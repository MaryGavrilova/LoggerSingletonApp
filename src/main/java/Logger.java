import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {
    protected int num = 1;

    private static Logger logger = null;

    private Logger() {}

    public void log(String msg) {
        String currentTime = new SimpleDateFormat("yyyy:MM:dd  HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println("[" + currentTime + "  " + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }
}
