package workmkr2;

public class Main {
    public static void main(String[] args) {
        EventManager manager = EventManager.getInstance();

        // Створення об'єктів
        AuthModule auth = new AuthModule();
        LogModule log = new LogModule();
        UIModule ui = new UIModule();

        // Підписка
        manager.subscribe(auth);
        manager.subscribe(log);
        manager.subscribe(ui);

        System.out.println("----- Сценарій 1: Вхід -----");
        auth.login();

        System.out.println("\n----- Сценарій 2: Вихід -----");
        auth.logout();
    }
}