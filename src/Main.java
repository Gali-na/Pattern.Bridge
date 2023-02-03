public class Main {
    public static void main(String[] args) {
        MakeCar nisan = new Nisan();
        TypeCar typeCarHatchback = new Hatchback();
        typeCarHatchback.setMakeCar(nisan);
        typeCarHatchback.showInformation();
        System.out.println("*************************");
        TypeCar typeCarSitan = new Sitan();
        typeCarSitan.setMakeCar(nisan);
        typeCarSitan.showInformation();

      //  System.out.println("Hello world!");
    }
}