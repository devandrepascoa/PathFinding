package v3.Frame;

import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

public class PathfindingMain {

	static MainFrame frame;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(() -> {

			//
			try {
				for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
					if ("Nimbus".equals(info.getName())) {
						UIManager.setLookAndFeel(info.getClassName());
						break;
					}
				}
			} catch (Exception e) {
				// If Nimbus is not available, you can set the GUI to another look and feel.
			}
			// TODO Auto-generated method stub
			frame = new MainFrame();
		});
	}

}
