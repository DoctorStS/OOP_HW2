package OOPC2;

import OOPC2.Human;
import OOPC2.Market;


public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Ivan");
        Human human2 = new Human("Vladimir");
        Human human3 = new Human("Igor");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);

        market.update();
    }
}
