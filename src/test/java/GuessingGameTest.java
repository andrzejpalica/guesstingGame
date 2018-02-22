/*
Zgodnie z metodologią TDD zaimplementuj grę w zgadywanie liczby:
Niech liczba do zgadnięcia będzie przekazywana w konstruktorze klasy gry
Po każdej próbie zgadnięcia gra powinna informować gracza o tym, czy podał za dużą czy za małą wartość
Jeżeli gracz zgadnie liczbę, gra powinna go o tym poinformować
Gracz powinien przegrać, jeżeli nie udało mu się odgadnąć liczby w 10 próbach

czy da się zgadnąć poprawną liczbę
    -> dostanie komunikat że wygrał
    *-> metoda do zgadywania zwróci string "Wygrałeś"

Sprawdzić, czy podał liczbę
    *-> czy nie ma nulla -> jeżeli null to stracił swoją szansę (jedną z dziesięciu)
    *-> czy podał liczbę, czy literę -> jeżeli nie liczba to stracił szansę

czy podana liczba jest większa lub mniejsza od liczby do zgadnięcia
    -> czy jest mniejsza
        *-> jeśli tak, to komunikat "Za mała"
        *-> jeśli tak, to traci szansę
    -> czy jest większa
        *-> jeśli tak, to komunikat "Za duża"
        *-> jeśli tak, to traci szansę

czy ma jeszcze szanse
    *-> jeżli nie ma szans, to komunikat "Przegrałeś"
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GuessingGameTest {

    GuessingGame guessingGame = new GuessingGame(30);

    @Test
    public void shouldGiveAnInformationThatYouWin() {
        //given
        Integer correctNumber = guessingGame.getCorrectNumber();
        guessingGame.setGuessingNumber(30);
        Integer guessingNumber = guessingGame.getGuessingNumber();
        //when
        guessingGame.play(correctNumber, guessingNumber);

        //than
        assertEquals(correctNumber, guessingNumber);

    }

    @Test(expected = RuntimeException.class)
    public void shouldGiveAnInformationThatNumberIsToLow() {
        //given
        Integer correctNumber = guessingGame.getCorrectNumber();
        guessingGame.setGuessingNumber(20);
        Integer guessingNumber = guessingGame.getGuessingNumber();
        //when
        guessingGame.play(correctNumber, guessingNumber);
        //than
    }

    @Test(expected = RuntimeException.class)
    public void shouldGiveAnInformationThatNumberIsToHigh() {
        //given
        Integer correctNumber = guessingGame.getCorrectNumber();
        guessingGame.setGuessingNumber(40);
        Integer guessingNumber = guessingGame.getGuessingNumber();
        //when
        guessingGame.play(correctNumber, guessingNumber);
        //than
    }

    @Test
    public void shouldGiveAnInformationThatYouLose() {
        
    }
}
