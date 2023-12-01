

public class CarPark {

    private Car[] spaces;

    public CarPark(int length) {
        this.spaces = new Car[length];
    }

    public Car[] getSpaces() {
        return spaces;
    }

    public int park(Car c) {
        for (int i = 0; i < this.spaces.length; i++) {
            if (this.spaces[i] == null) {
                this.spaces[i] = c;
                return i;
            }
        }
        return -1;
    }

    public int search(LicensePlate lp) {
        for (int i = 0; i < this.spaces.length; i++) {
            boolean isOccupied = this.spaces[i] != null;

            if (isOccupied && this.spaces[i].getLicensePlate().isEqual(lp)) {
                return i;
            }
        }
        return -1;
    }

    public Car driveOff(LicensePlate lp) {
        // search +
        int parkedIndex = this.search(lp);

        if (parkedIndex == -1)
            return null;

        Car drivenOffCar = this.spaces[parkedIndex];
        this.spaces[parkedIndex] = null;

        return drivenOffCar;
    }

    public String toString() {
        String representation = "Car Park\n";

        for (int i = 0; i < this.spaces.length; i++) {
            if (this.spaces[i] == null) {
                representation += i + ":" + "[ ]" + "\n";
            }
            else {
                representation += i + ":" + "[" + this.spaces[i].toString() + "]" + "\n";
            }
        }

        return representation;
    }
}



