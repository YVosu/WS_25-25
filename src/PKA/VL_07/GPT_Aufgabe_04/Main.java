package PKA.VL_07.GPT_Aufgabe_04;

public class Main {
    public static void main(String[] args) {

        Privatjet privatJet = new Privatjet(15);

        Thread boardingThread = new Thread(new PassengerBoarding(privatJet));
        Thread leavingThread = new Thread(new PassengerLeaving(privatJet));

        boardingThread.start();
        leavingThread.start();

    }
}
