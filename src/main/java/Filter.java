import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>(source);

        int counter = 0;
        Iterator<Integer> iterator = result.iterator();

        while (iterator.hasNext()) {
            int e = iterator.next();
            if (e < treshold) {
                iterator.remove();
                logger.log("Элемент " + e + " не проходит");
                continue;
            }
            logger.log("Элемент " + e + " проходит");
            counter++;
        }
        logger.log("Прошло фильтр " + counter + " элемента из " + source.size());
        return result;
    }
}
