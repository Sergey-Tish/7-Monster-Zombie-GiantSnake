// класс Player для задания 8.2.1
public class Player extends Human {

    Backpack backpack = new Backpack();
    public Player(String name) {
        super(name);
    }

    public void take(String item) {
        if (!backpack.isEmpty) {
            backpack.containBackpack.append(",").append(item);
        } else {
            backpack.containBackpack.append(item);
            backpack.isEmpty = false;
        }
    }

    class Backpack {
        StringBuilder containBackpack = new StringBuilder("");
        boolean isEmpty = true;

        @Override
        public java.lang.String toString() {
            if (!isEmpty)
            return containBackpack + " in the backpack";
            else return "the backpack is empty";
        }
    }
}


//
class MainPlayer {
    public static void main(String[] args) {
/*
Extend Human class by Player class with inner Backpack
*/

        Player player = new Player("Tourist");
        Player.Backpack pb = player.backpack;
        System.out.println(pb);
        player.take("rope");
        System.out.println(pb);
        player.take("bottle");
        player.take("flower");
        System.out.println(pb);

/*
        The code above has to output:
the backpack is empty
rope in the backpack
rope,bottle,flower in the backpack
*/
    }
}