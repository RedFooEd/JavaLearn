package human;

import java.util.Random;

public class Teacher {
    private String name;
    private String topic;

    public Teacher(String name, String topic) {
        this.name = name;
        this.topic = topic;
    }

    public String getName() {
        return name;
    }

    public int evaluate(Student student) {
        Random rand = new Random();
        int evaluate = rand.nextInt(4) + 2;
        switch (evaluate) {
            case 2:
                System.out.println("Преподаватель " + getName() + ", оценил студента, с именем " + student.getName() + ", по предмету " + topic + " - неудовлетворительно.");
                break;
            case 3:
                System.out.println("Преподаватель " + getName() + ", оценил студента с именем " + student.getName() + ", по предмету " + topic + " - удовлетворительно.");
                break;
            case 4:
                System.out.println("Преподаватель " + getName() + ", оценил студента с именем " + student.getName() + ", по предмету " + topic + " - хорошо.");
                break;
            case 5:
                System.out.println("Преподаватель, " + getName() + ", оценил студента с именем " + student.getName() + ", по предмету " + topic + " - отлично.");
                break;
        }
        return evaluate;
    }
}
