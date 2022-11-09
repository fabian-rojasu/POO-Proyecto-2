package juego2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI_Gato extends JFrame {
    private JPanel contentPane;

	boolean banderaGanaX=true, banderaGanaO=true;
	int ganadorX,ganadorO;
	String resultado="X = "+ganadorX+"        "+"O = "+ganadorO;
	String juegoNuevo="O";
	String Turno="X";
	JLabel lbs[] = new JLabel [9];
	JLabel contador = new JLabel(""); 
	JLabel lblTurno = new JLabel();
	int vs[][]={
	            {1,2,3},
	            {4,5,6},
	            {7,8,9},
	            {1,4,7},
	            {2,5,8},
	            {3,6,9},
	            {1,5,9},
	            {3,5,7},        
	};

	
	public GUI_Gato() {
		setTitle("tateti");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 244, 365);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.scrollbar);
		panel.setBounds(24, 73, 186, 186);
		contentPane.add(panel);
		panel.setLayout(null);
		                
		contador.setForeground(SystemColor.textInactiveText);           
		contador.setHorizontalAlignment(SwingConstants.CENTER);       
		contador.setFont(new Font("Courier New", Font.BOLD, 17));
		contador.setBounds(0, 294, 238, 42);
		contentPane.add(contador);
		contador.setText(resultado);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 60, 60);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblX1 = new JLabel("");
		lblX1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				presionar(1);
			}
		});
		lblX1.setForeground(Color.DARK_GRAY);
		lblX1.setFont(new Font("Arial", Font.PLAIN, 60));
		lblX1.setBounds(10, 8, 50, 49);
		panel_1.add(lblX1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(63, 0, 60, 60);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblX2 = new JLabel("");
		lblX2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				presionar(2);
			}
		});
		lblX2.setForeground(Color.DARK_GRAY);
		lblX2.setFont(new Font("Arial", Font.PLAIN, 60));
		lblX2.setBounds(10, 8, 50, 49);
		panel_2.add(lblX2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(126, 0, 60, 60);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblX3 = new JLabel("");
		lblX3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				presionar(3);
			}
		});
		lblX3.setForeground(Color.DARK_GRAY);
		lblX3.setFont(new Font("Arial", Font.PLAIN, 60));
		lblX3.setBounds(10, 8, 50, 49);
		panel_3.add(lblX3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(0, 63, 60, 60);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblX4 = new JLabel("");
		lblX4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				presionar(4);
			}
		});
		lblX4.setForeground(Color.DARK_GRAY);
		lblX4.setFont(new Font("Arial", Font.PLAIN, 60));
		lblX4.setBounds(10, 8, 50, 49);
		panel_4.add(lblX4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBounds(63, 63, 60, 60);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblX5 = new JLabel("");
		lblX5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				presionar(5);
			}
		});
		lblX5.setForeground(Color.DARK_GRAY);
		lblX5.setFont(new Font("Arial", Font.PLAIN, 60));
		lblX5.setBounds(10, 8, 50, 49);
		panel_5.add(lblX5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_6.setBounds(126, 63, 60, 60);
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblX6 = new JLabel("");
		lblX6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				presionar(6);
			}
		});
		lblX6.setForeground(Color.DARK_GRAY);
		lblX6.setFont(new Font("Arial", Font.PLAIN, 60));
		lblX6.setBounds(10, 8, 50, 49);
		panel_6.add(lblX6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_7.setBounds(0, 126, 60, 60);
		panel.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblX7 = new JLabel("");
		lblX7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				presionar(7);
			}
		});
		lblX7.setForeground(Color.DARK_GRAY);
		lblX7.setFont(new Font("Arial", Font.PLAIN, 60));
		lblX7.setBounds(10, 8, 50, 49);
		panel_7.add(lblX7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 255, 255));
		panel_8.setBounds(63, 126, 60, 60);
		panel.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblX8 = new JLabel("");
		lblX8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				presionar(8);
			}
		});
		lblX8.setForeground(Color.DARK_GRAY);
		lblX8.setFont(new Font("Arial", Font.PLAIN, 60));
		lblX8.setBounds(10, 8, 50, 49);
		panel_8.add(lblX8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 255, 255));
		panel_9.setBounds(126, 126, 60, 60);
		panel.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblX9 = new JLabel("");
		lblX9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				presionar(9);
			}
		});
		lblX9.setForeground(Color.DARK_GRAY);
		lblX9.setFont(new Font("Arial", Font.PLAIN, 60));
		lblX9.setBounds(10, 8, 50, 49);
		panel_9.add(lblX9);
	
		JButton btnJuegoNuevo = new JButton("Jugar");
		btnJuegoNuevo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				for(int i=0;i<lbs.length;i++){
					lbs[i].setText("");
					lbs[i].setForeground(Color.DARK_GRAY);
				}
				Turno=juegoNuevo;
				if(juegoNuevo.equals("O"))juegoNuevo="X";
				else juegoNuevo="O";
				if(!banderaGanaX)ganadorX++;
				if(!banderaGanaO)ganadorO++;
				banderaGanaX=true;
				banderaGanaO=true;
				resultado="X = "+ganadorX+"        "+"O = "+ganadorO;
				contador.setText(resultado); 
			}
		});
		
		btnJuegoNuevo.setForeground(new Color(255, 255, 255));
		btnJuegoNuevo.setSelectedIcon(null);
		btnJuegoNuevo.setFont(new Font("Courier New", Font.BOLD, 12));
		btnJuegoNuevo.setEnabled(false);
		btnJuegoNuevo.setBackground(SystemColor.textHighlightText);
		btnJuegoNuevo.setBounds(10, 11, 84, 23);
		contentPane.add(btnJuegoNuevo);
		
		lbs[0]=lblX1;
		lbs[1]=lblX2;
		lbs[2]=lblX3;
		lbs[3]=lblX4;
		lbs[4]=lblX5;
		lbs[5]=lblX6;
		lbs[6]=lblX7;
		lbs[7]=lblX8;
		lbs[8]=lblX9;
		
		lblTurno.setText("Turno: "+Turno);
		lblTurno.setForeground(SystemColor.textInactiveText);
		lblTurno.setFont(new Font("Courier New", Font.BOLD, 12));
		lblTurno.setBounds(144, 13, 71, 18);
		contentPane.add(lblTurno);
	}
	
	public void presionar (int casillero){
		if (lbs[casillero-1].getText().equals("")){
		lbs[casillero-1].setText(Turno);
		cambiarTurno();}
		ganador();
	}
	
	public void cambiarTurno(){
		if(banderaGanaO && banderaGanaX){
        	if(Turno.equals("X"))
        	Turno="O";
        	else Turno="X";
        	lblTurno.setText("Turno: "+Turno);
		}
	}
	
	public void ganador(){
		
		for(int i=0; i<vs.length;i++){
			if(lbs[vs[i][0]-1].getText().equals("X")&&
					lbs[vs[i][1]-1].getText().equals("X")&&
					lbs[vs[i][2]-1].getText().equals("X")){
				lbs[vs[i][0]-1].setForeground(Color.PINK);
				lbs[vs[i][1]-1].setForeground(Color.PINK);
				lbs[vs[i][2]-1].setForeground(Color.PINK);
				banderaGanaX=false;
				for(int j=0; j<9; j++){
					if(lbs[j].getText().equals("")){lbs[j].setText(" ");}

				}
				}
			
			if(lbs[vs[i][0]-1].getText().equals("O")&&
					lbs[vs[i][1]-1].getText().equals("O")&&
					lbs[vs[i][2]-1].getText().equals("O")){
				lbs[vs[i][0]-1].setForeground(Color.PINK);
				lbs[vs[i][1]-1].setForeground(Color.PINK);
				lbs[vs[i][2]-1].setForeground(Color.PINK);
				banderaGanaO=false;

				for(int j=0; j<9; j++){
					if(lbs[j].getText().equals("")){lbs[j].setText(" ");}
				}
		}
		}
	}
}
