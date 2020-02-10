public class Runner {



    public static void main(String[] args) {
        car myCar = new car (2015, 1278, "Toyota", "Camry");

        System.out.println(myCar.toString());

        myCar.drive(200);

        System.out.println(myCar.toString());


        Rectangle r = new Rectangle(4,5);

        System.out.println(r.isSquare());

        System.out.println(r.getDiagonal());

        System.out.println(r.getArea());
    }





}
