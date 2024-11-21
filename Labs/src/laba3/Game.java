public class Game {


	// основные поля с геттерами и сеттерами
	private boolean isRunning; // флаг запущена ли игра

	public boolean isRunning() { return isRunning; }
	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	private boolean isSinglePlayer;

	public boolean isSinglePlayer() { return isSinglePlayer; }
	public void setSinglePlayer(boolean isSinglePlayer) {
		this.isSinglePlayer = isSinglePlayer;
	}

	private int FPS;

	public int getFPS() { return FPS; }
	public void setFPS(int fPS) {
		FPS = fPS;
	}

	private String genre;

	public String getGenre() { return genre; }
	public void setGenre(String genre) {
		this.genre = genre;
	}

	private String creators;

	public String getCreators() { return creators; }
	public void setCreators(String creators) {
		this.creators = creators;
	}

	private String distributors;

	public String getDistributors() { return distributors; }
	public void setDistributors(String distributors) {
		this.distributors = distributors;
	}

	// конструктор с основными параметрами игры (фпс, isRunning не задаем, т.к. фпс меняется в зависимости железа)
	public Game(String genre, String creators, String distributors, boolean isSinglePlayer) {
		this.genre = genre;
		this.creators = creators;
		this.distributors = distributors;
		this.isSinglePlayer = isSinglePlayer;
	}

	// метод старта, игра живет 255 итераций если isRunning - true
	public void start() {
		for (int i = 0; i < 255 && isRunning; i++) {
			System.out.println("Игра запущена");
		}
	}

	// метод останавливает игру
	public void stop() {
		isRunning = false;
	}
}
