public class User {

    private String login;
    private String password;

    User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public class LoginAcceptor {

        boolean checkLoginAndPassword(String login, String password) {
            return getLogin().equals(login) && getPassword().equals(password);
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
