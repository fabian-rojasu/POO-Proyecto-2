package juego1;
import interfaces.iJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class GUI_MultiMath extends JFrame implements ActionListener{

    static int puntaje = 0;
    static String resultado;
    static String respuesta;
    static JButton btnResponder;
    static JButton btnSalir;
    public static iJugador jugadorGlobal;
    static String[] operadores = {"+","-","*","/"};
    static JTextField operacion;
    static JTextField res;
    static JLabel score;
    

    public GUI_MultiMath(){
        puntaje = 0;
        this.setSize(500,500);
        this.setLayout(null);
        this.setTitle("MultiMath");
        this.setUndecorated(true);  
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);

        operacion =new JTextField();
        operacion.setEnabled(false);
        operacion.setBounds(100,250 , 100, 25);
        this.add(operacion);

        res =new JTextField();
        res.setBounds(300,250 , 100, 25);
        operacion.setEditable(true);
        this.add(res);

        btnResponder = new JButton();
        btnResponder.setText("Responder");
        btnResponder.setBounds(100, 350, 100, 25);
        this.add(btnResponder);
        btnResponder.addActionListener(this);

        score = new JLabel(); 
        score.setText("Score: 0");
        score.setBounds(225, 100, 100, 25);
        this.add(score);
        
        
        //Boton Salir
        btnSalir = new JButton();
        btnSalir.setText("Salir");
        btnSalir.setBounds(300, 350, 100, 25);
        this.add(btnSalir);
        btnSalir.addActionListener(this);
        game();
        
    }

    public void game(){
        respuesta= "";
        resultado = "";
        Double num1;
        Double num2;
        Double operador;
        res.setText("");//Pone en blanco el espacio del resultado
        operador = Math.random()*operadores.length;
        num1 = Math.random()*50+1;
        num2 = Math.random()*50+1;
        if (operador.intValue() == 0){
            resultado = String.valueOf(num1.intValue() + num2.intValue()); 
        }
        if (operador.intValue() == 1){
            resultado = String.valueOf(num1.intValue() - num2.intValue());
        }
        if (operador.intValue() == 2){
            resultado = String.valueOf(num1.intValue() * num2.intValue());
        }
        if (operador.intValue() == 3){
            resultado = String.valueOf(num1.intValue() / num2.intValue());
        }
        operacion.setText(num1.intValue()+" "+operadores[operador.intValue()]+" "+num2.intValue()+" =" );
        score.setText("Score: "+puntaje*10);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnResponder ){
            respuesta= res.getText();
            if(respuesta.equals(resultado)== false){
                JOptionPane.showMessageDialog(null,"Perdiste");
                MultiMath mm = new MultiMath();
                mm.crearRegistro(puntaje,mm);
                mm.terminarPartida();
                this.dispose();
            }else{
                puntaje++;
                game();
                
            }
        }
        else{
            if(e.getSource() ==btnSalir){
                
                this.dispose();
            }      
        }      
    }
}
