package ex.com.atividadeQ3;

public class Pizzaiolo {

    public static void main(String[] args) {

        Pizza p1 = new Mozzarella();
        System.out.println(p1.getDescription() + " --- " + p1.cost());

        Pizza p2 = new TomatoDecorator(new Mozzarella());
        System.out.println(p2.getDescription() + " --- " + p2.cost());

        Pizza p3 = new CreamCheeseEdgeDecorator(new TomatoDecorator(new Mozzarella()));
        System.out.println(p3.getDescription() + " --- " + p3.cost());

        Pizza p4 = new Pepperoni();
        System.out.println(p4.getDescription() + " --- " + p4.cost());

        Pizza p5 = new BaconDecorator(new OreganoDecorator(new Pepperoni()));
        System.out.println(p5.getDescription() + " --- " + p5.cost());

        Pizza p6 = new TomatoDecorator(new BaconDecorator(
                new OreganoDecorator(new Pepperoni())));
        System.out.println(p6.getDescription() + " --- " + p6.cost());
    }
}
