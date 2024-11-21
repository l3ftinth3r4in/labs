public class Main3 {
	public static void main(String[] args) {

		// создаем экземпляр класс
		Game game = new Game("Шутер", "Арина и КО", "ЕМАЕЕЕ", true);

		game.setRunning(true);
		game.start(); // стартуем
		game.stop(); // анти-стартуем
		game.start(); // пытаемся стартануть, не стартуем, т.к. isRunning = false
	}
}
