public class Main {


    public static void main(String[] args) {
/*

Make class Entity - the superclass for all entities
Fix class Zombie and ...

*/
        Battle battle = new Battle();
        battle.add(new Zombie("Alice"));
        battle.add(new Human("Vasiliy"));
        battle.add(new GiantSnake("Kaa"));
        battle.add(new Tower("Big Ben"));

        battle.start();
/*
                       ...and The GreatBattle starts!
*/
    }
}
/*
Все классы открыты, можете их изучить, но вам нужно исправить только файлы Monster, Zombie, Entity и Fighter.
То есть вам надо в этой задаче:
Создать класс Entity, вынести в него общее для всех объектов игры из класса Monster.
Пронаследовать класс Monster от Entity.
Вынести метод атаки в интерфейс Fighter.
Правильно реализовать интерфейс в классе Zombie.
Когда программа скомпилируется и запустится — всё сделано!
 */