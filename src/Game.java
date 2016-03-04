
public abstract class Game {
	
	final void play(){
		startGame();
		if(isUserWantToConnectGoogleAccount()){
			connectToGoogleAccount();
		}
		saveGame();
		endGame();
	}
	
	abstract void saveGame();
	abstract void connectToGoogleAccount();
	
	public void startGame(){
		System.out.println("Starting game..");
	}
	
	public void endGame(){
		System.out.println("Stoping game..");
	}
	
	public boolean isUserWantToConnectGoogleAccount(){
		return false;
	}
}
