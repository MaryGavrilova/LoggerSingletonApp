import java.util.*;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        try {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            logger.log("Просим пользователя ввести входные данные для списка");
            System.out.println("Введите размер списка:");
            int size = scanner.nextInt();
            System.out.println("Введите верхнюю границу для значений:");
            int maxValue = scanner.nextInt();

            logger.log("Создаём и наполняем список");
            List<Integer> source = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                source.add(random.nextInt(maxValue));
            }
            System.out.println("Вот случайный список: " + source);

            logger.log("Просим пользователя ввести входные данные для фильтрации");
            System.out.println("Введите порог для фильтра:");
            int treshold = scanner.nextInt();

            logger.log("Запускаем фильтрацию");
            Filter filter = new Filter(treshold);
            List<Integer> result = filter.filterOut(source);
            logger.log("Выводим результат на экран");
            System.out.println("Отфильтрованный список: " + result);


        } catch (InputMismatchException exception) {
            logger.log("Пользователь ввел не число");
        }

        logger.log("Завершаем работу программы");
    }
}
