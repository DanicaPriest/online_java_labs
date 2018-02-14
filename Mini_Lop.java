public class Mini_Lop extends Lop {
    @Override
    public void feed(String food) {
        super.feed(food);
        food = "pellets";
    }

    @Override
    public void water(double liters) {
        super.water(liters);
        liters = 0.5;
    }

    @Override
    public void exercise(int time) {
        super.exercise(time);
        time = 1;
    }
}
