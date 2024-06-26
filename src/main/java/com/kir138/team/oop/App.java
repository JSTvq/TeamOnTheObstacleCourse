package com.kir138.team.oop;

/**
 * Разобраться с имеющимся кодом.
 * Добавить класс Team, который будет содержать:
 * название команды;
 * массив из четырех участников --- в конструкторе можно сразу всех участников указывать);
 * метод для вывода информации о членах команды, прошедших дистанцию;
 * метод вывода информации обо всех членах команды.
 * Добавить класс Course (полоса препятствий), в котором будут находиться:
 * массив препятствий;
 * метод, который будет просить команду пройти всю полосу. В итоге должно получиться похожее:
 */
public class App {
    public static void main(String[] args) {
        Course course = new Course(new Cross(10), new Wall(2), new Water(3));

        Team team = new Team("ultimateFighters",
                new Animal("Кирилл", 11, 3, 4),
                new Human("Кирилл", 11, 3, 4),
                new Human("Артур", 6, 2, 2),
                new Human("Марина", 8, 2, 1));

        course.doIt(team);
        team.showResults();
    }
}
