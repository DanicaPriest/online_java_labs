public class Angora implements Rabbit {
    @Override
    public void feed(String food) {
        food = "lettuce";
    }

    @Override
    public void water(double liters) {
        liters = 1
    }

    @Override
    public void exercise(int time) {
        time = 3;
    }
}

