package workmkr2;

public class AuthModule implements EventListener {

    public void login() {
        // Логіка перевірки пароля
        System.out.println("AuthModule: Вхід виконано.");
        EventManager.getInstance().notify("LOGIN", "User_123");
    }

    public void logout() {
        // Логіка виходу
        System.out.println("AuthModule: Вихід.");
        EventManager.getInstance().notify("LOGOUT", "User_123");
    }

    @Override
    public void update(String eventType, String message) {
    }
}