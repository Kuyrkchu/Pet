public class CarOwner{

    public static void main(String[] args) {

        Car myCar = new Car();

        JamesBondCar myJamesBondCar = new JamesBondCar();

        myCar.start();
        myCar.stop();
        myCar.drive(5);
        System.out.println();
        System.out.println();
        myJamesBondCar.drive(3);
        myJamesBondCar.start();
        myJamesBondCar.stop();



    }



}
