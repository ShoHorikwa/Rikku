package domein;

public class User {
    private String name;
    private String birth;

    public User(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }
}
