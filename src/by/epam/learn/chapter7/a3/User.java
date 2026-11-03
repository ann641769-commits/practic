package by.epam.learn.chapter7.a3;

//класс Пользователь
public class User {
    private int id;
    private String name;
    private int age;
    private String country;

    public User(int id, String name, int age, String country) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return id + ". " + name + ", возраст: " + age + ", страна: " + country;
    }
}
