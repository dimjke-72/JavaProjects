package JavaOOP.lesson2.HomeWork;

import JavaOOP.lesson2.HomeWork.Obstracles.Obstacles;
import JavaOOP.lesson2.HomeWork.Obstracles.Treadmill;
import JavaOOP.lesson2.HomeWork.Obstracles.Wall;
import JavaOOP.lesson2.HomeWork.Participants.Cat;
import JavaOOP.lesson2.HomeWork.Participants.Human;
import JavaOOP.lesson2.HomeWork.Participants.Robot;

public class Main {
    public static void main(String[] args) {
        Object[] participants = {
                new Human("Вася", 50, 200),
                new Robot("Олимпус", 40, 350),
                new Human("Петя", 10, 150),
                new Cat("Веня", 40, 500),
                new Cat("Лютя", 50, 400),
                new Human("Федя", 40, 500),
                new Robot("Подделка")
        };
        Obstacles[] obstacles = {
                new Treadmill("Дорожка 1", 100),
                new Wall("Стена 1", 10),
                new Treadmill("Дорожка 2", 200),
                new Wall("Стена 2", 20),
                new Treadmill("Дорожка 3", 300),
                new Wall("Стена 3", 30)
        };
        for (Object participant : participants) {
            for (Obstacles obstacle : obstacles) {
                System.out.print(obstacle.getName() + " - ");
                if (participant instanceof Human) {
                    if (obstacle instanceof Treadmill) {
                        if (!((Human) participant).run((Treadmill) obstacle)) break;
                    } else {
                        if (!((Human) participant).jump((Wall) obstacle)) break;
                    }
                } else if (participant instanceof Cat) {
                    if (obstacle instanceof Treadmill) {
                        if (!((Cat) participant).run((Treadmill) obstacle)) break;
                    } else {
                        if (!((Cat) participant).jump((Wall) obstacle)) break;
                    }
                }else if (participant instanceof Robot) {
                    if (obstacle instanceof Treadmill) {
                        if (!((Robot) participant).run((Treadmill) obstacle)) break;
                    } else {
                        if (!((Robot) participant).jump((Wall) obstacle)) break;
                    }
                }
            }
            System.out.println("Участник закончил соревнование \n");
        }
    }
}
