package flash.cards;

public class FlashCard {
	public static void main (String[] args) throws InterruptedException {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainFrame frame = new MainFrame();
			}
		});
	}
}
