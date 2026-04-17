public class GameLauncher {
    public static void main(String[] args) {
        GuessGame game;
        if (args.length == 0) game = new GuessGame();
        else if (args.length == 2) game = new GuessGame(args[0], args[1]);
        else { System.out.print("Please relaunch the game and enter 2 opponent players to start.\n\"Or just don't enter any and leave it all for us ;)\""); return; }
        game.startGame();
    }
}