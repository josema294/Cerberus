package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JToolBar;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class MainWindow {

	private JFrame frame;


	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 536);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panelBackground = new JPanel();
		panelBackground.setBackground(Color.ORANGE);
		frame.getContentPane().add(panelBackground);
		GridBagLayout gbl_panelBackground = new GridBagLayout();
		gbl_panelBackground.columnWidths = new int[]{800, 0};
		gbl_panelBackground.rowHeights = new int[]{0, 0};
		gbl_panelBackground.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panelBackground.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panelBackground.setLayout(gbl_panelBackground);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 0;
		panelBackground.add(tabbedPane, gbc_tabbedPane);
		
		JPanel panel_keyholder = new JPanel();
		tabbedPane.addTab("keyHolder", null, panel_keyholder, null);
		
		JPanel panel_keygen = new JPanel();
		tabbedPane.addTab("Key Gen", null, panel_keygen, null);
		
		JPanel panel_settings = new JPanel();
		tabbedPane.addTab("Settings", null, panel_settings, null);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnIn_icio = new JMenu("Inicio");
		menuBar.add(mnIn_icio);
		
		JMenuItem mntm_ventana = new JMenuItem("New menu item");
		mnIn_icio.add(mntm_ventana);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnIn_icio.add(mntmNewMenuItem_1);
		
		JMenu mnVentana = new JMenu("Ventana");
		menuBar.add(mnVentana);
		
		JMenu mnPreferencias = new JMenu("Preferencias");
		menuBar.add(mnPreferencias);
		
	}

}
