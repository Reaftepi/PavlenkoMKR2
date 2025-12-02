package workmkr2;

public class UIModule implements EventListener {
    @Override
    public void update(String eventType, String message) {
        if (eventType.equals("LOGIN")) {
            System.out.println("UI: Привіт, " + message + "!");
        } else if (eventType.equals("LOGOUT")) {
            System.out.println("UI: Бувай, " + message + "!");
        }
    }
}