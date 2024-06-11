package com.kir138.team;

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
//        Course c = new Course(/*...*/); // Создаем полосу препятствий
//        Team team = new Team(/*...*/); // Создаем команду
//        c.doIt(team); // Просим команду пройти полосу
//        team.showResults(); // Показываем результаты

        Course course = new Course(new Obstacle[] {new Cross(10), new Wall(2), new Water(3)});

        Team team = new Team("ultimateFighters",
                new Human("Кирилл", 11, 3, 4),
                new Human("Геннадий",7, 1, 3),
                new Human("Геннадий2",17, 11, 13),
                new Human("Артур",6, 2, 2),
                new Human("Марина", 8, 2, 1));

        team.showAll();
        course.doIt(team);
        team.showAllMembersTeam();


    }
}