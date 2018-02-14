public class Lop implements Rabbit {
    @Override
    public void feed(String food) {
        food = "carrot";
    }

    @Override
    public void water(double liters) {
        liters = 0.2;
    }

    @Override
    public void exercise(int time) {
        time = 2;
    }
}
