package lesson3;

public class Main {
    public static void main(String[] args) {
        User user = new User("binocl", "22032002");
        System.out.println(user.getPassword());
        user.login("binocla", "22032002");
    }
}

class User {
    // Инкапсуляция -> сокрытие реализации (или аттрибутов)
    // Достигается с помощью ключевого слова private
    // 1) Безопасность (контроль доступа)
    // 2) Избавление от лишних действий
    // Getter & Setter -> это публичные методы, призванные контролировать доступ к приватным полям
    private String login;
    private String password;

    public String getLogin() { // Getter
        return login;
    }

    public void setLogin(String login) { // Setter
        this.login = login;
    }

    public String getPassword() {
        if (login.equals("binocla")) {
            return password;
        } else {
            return "Нет доступа";
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        System.out.println("Успешно зарегистрировались");
    }

    public void login(String login, String password) {
        if (this.login.equals(login)) {
            System.out.println("Логин подходит");
            if (this.password.equals(password)) {
                System.out.println("Успешно вошли");
            } else {
                System.out.println("Неправильный пароль");
            }
        } else {
            System.out.println("Неправильный логин");
        }
    }
}




