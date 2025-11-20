package ex.com.atividade;

public class Client {
    public static void main(String[] args) {

        CarDirector director = new CarDirector();

        Car sedan = director.construct(new SedanBuilder());
        Car suv = director.construct(new SUVBuilder());
        Car sport = director.construct(new SportsCarBuilder());

        System.out.println(sedan);
        System.out.println(suv);
        System.out.println(sport);
    }
}
