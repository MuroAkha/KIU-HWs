
import java.util.Objects;

public class LicensePlate {
    private String regionalCode;
    private String letters;
    private int digits;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setDigits(int digits) {
        this.digits = digits;
    }

    public void setLetters(String letters) {
        this.letters = letters;
    }

    public void setRegionalCode(String regionalCode) {
        this.regionalCode = regionalCode;
    }

    public int getAge() {
        return age;
    }

    public int getDigits() {
        return digits;
    }

    public String getLetters() {
        return letters;
    }

    public String getRegionalCode() {
        return regionalCode;
    }

    public LicensePlate(String regionalCode, String letters, Integer digits) {
        this.regionalCode = regionalCode;
        this.letters = letters;
        this.digits = digits;
    }

    public boolean isEqual(LicensePlate other) {
        boolean regionalsEqual = this.regionalCode.equals(other.regionalCode);
        boolean lettersEqual = this.letters.equals(other.letters);
        boolean digitsEqual = Objects.equals(this.digits, other.digits);

        return regionalsEqual && lettersEqual && digitsEqual;
    }

    public String toString() {
        return this.regionalCode + ":" + this.letters + " " + this.digits;
    }
}