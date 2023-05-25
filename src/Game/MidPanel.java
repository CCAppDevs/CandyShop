package Game;

import java.awt.*;
import javax.swing.*;


public class MidPanel extends JPanel {
	private JPanel LeftPanel;
	private JPanel CenterPanel;
	private JPanel RightPanel;
	
	private JButton btnAdd;
	private JButton btnRemove;
	
	
	public MidPanel() {
		super();
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		setBackground(new Color(0, 0, 0));
		
		this.LeftPanel = new JPanel();
		this.LeftPanel.setBackground(new Color(200, 0, 0));
		this.LeftPanel.setSize(new Dimension(350, 400));
		this.LeftPanel.setLayout(new BoxLayout(this.LeftPanel, BoxLayout.Y_AXIS));
		
		this.CenterPanel = new JPanel();
		this.CenterPanel.setLayout(new BoxLayout(this.CenterPanel, BoxLayout.Y_AXIS));
		this.CenterPanel.setBackground(new Color(0, 200, 0));
		this.CenterPanel.setSize(new Dimension(100, 400));
		
		this.btnAdd = new JButton("Add");
		this.CenterPanel.add(this.btnAdd);
		
		this.btnRemove = new JButton("Remove");
		this.CenterPanel.add(this.btnRemove);
		
		this.RightPanel = new JPanel();
		this.RightPanel.setBackground(new Color(0, 0, 200));
		this.RightPanel.setSize(new Dimension(350, 400));
		this.RightPanel.setLayout(new BoxLayout(this.RightPanel, BoxLayout.Y_AXIS));
		
		
		
		add(this.LeftPanel);
		add(this.CenterPanel);
		add(this.RightPanel);
	}
	
	
}
