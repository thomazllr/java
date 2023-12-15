package nelio_alves.Carrays.Challenge.entities;

public class Student {
    private String name;
    private String email;
    private int room;

    public Student(String name, String email, int room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }

    @Override
    public String toString() {
        return room + ": " + name + ", " + email;
    }
}
