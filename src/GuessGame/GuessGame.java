package GuessGame;

public class GuessGame{
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        boolean isP1Right = false;
        boolean isP2Right = false;
        boolean isP3Right = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Game starts and the number is between 0 to 9....");

        while(true) {
            System.out.println("There you go....number to guess is " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guessP1 = p1.number;
            System.out.println("Player one gussed " + guessP1);
            guessP2 = p2.number;
            System.out.println("Player two gussed " + guessP2);
            guessP3 = p3.number;
            System.out.println("Player three gussed " + guessP3);

            if (guessP1 == targetNumber) {
                isP1Right = true;
            }
            if (guessP2 == targetNumber) {
                isP2Right = true;
            }
            if (guessP3 == targetNumber) {
                isP3Right = true;
            }

            if (isP1Right || isP2Right || isP3Right) {
                System.out.println("There you go we have winner here!!!!");
                System.out.println("Player one got it right?" + isP1Right);
                System.out.println("Player two got it right?" + isP2Right);
                System.out.println("Player three got it right?" + isP3Right);
                System.out.println("Game is over");
                break;
            } else {
                System.out.println("No luck Players have to try it again....");
            }
        }
    }
}