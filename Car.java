public class Car {
    int wheels;
    String color;
    int doors;
    String name;

    public Car(int carWheels, String carColor, int carDoors, String carName) {
        wheels = carWheels;
        color = carColor;
        doors = carDoors;
        name = carName;
    }

    public void printInfo() {
        System.out.println("number of wheels: " + wheels);
        System.out.println("car color: " + color);
        System.out.println("number of doors: " + doors);
        System.out.println("name of car" + name);
    }

    public static void main(String[] args) {
        Car tesla = new Car(4, "purple", 10, "Mercedes Benz");
        tesla.printInfo();
    }
    
}
