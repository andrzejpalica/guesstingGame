public class GuessingGame {

    private Integer correctNumber;
    private Integer guessingNumber;

    public Integer getGuessingNumber() {
        return guessingNumber;
    }

    public void setGuessingNumber(Integer guessingNumber) {
        this.guessingNumber = guessingNumber;
    }

    public GuessingGame(Integer correctNumber) {
        this.correctNumber = correctNumber;
    }

    public Integer getCorrectNumber() {
        return correctNumber;
    }

    public void getLose() {
        for (int i = 0; i < 9; i++) {


        }
    }

    private void toLowNumber () {
        if (guessingNumber < correctNumber) {
            System.out.println("Za mała liczba, podaj większa");
            System.out.println("Straciłeś szansę");
            throw new RuntimeException("Za mała liczba, podaj większą");
        }
    }

    private void toHighNumber () {
        if (guessingNumber > correctNumber) {
            System.out.println("Za duża liczba, podaj większą");
            System.out.println("Straciłeś szansę");
            throw new RuntimeException("Za duża liczba, podaj mniejszą");

        }
    }
    private void getWin() {
        if (guessingNumber == correctNumber) {
            System.out.println("Ta liczba jest prawidłowa, wygrałes!");
        }
    }

    public void play(Integer correctNumber, Integer guessingNumber) {
        for (int i = 0; i < 9; i++) {
            toLowNumber();
            toHighNumber();
            getWin();
        }

    }
}



