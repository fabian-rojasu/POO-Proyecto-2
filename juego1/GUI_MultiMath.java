package juego1;
import interfaces.iJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Clase donde se realizara la creacion y implmentacion de la interfaz grafica por parte del juego "MultiMath"
 * Implementa la clase ActionListener para poder asignarle funciones a los botones 
 */
public class GUI_MultiMath extends JFrame implements ActionListener{

    //Declaracion de variables globales 
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

    //Constructor de la clase donde se creara la ventana
    public GUI_MultiMath(){
        //Atributos de la ventana 
        puntaje = 0;
        this.setSize(500,500);
        this.setLayout(null);
        this.setTitle("MultiMath");
        this.setUndecorated(true);  
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);

        //Declaracion de todos los elementos graficos 
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

    /**
     * En este metodo se realizan los calculos para poder llevar a acabo del juego 
     */
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

    /**
     * Metodo generado automaticamente por la implementacion de la clase ActionListener
     * En este bloque de codigo se configura todas la funciones de los botones implementados en la ventana 
     * @param e es la variable que registra el balor del boton oprimido 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        //Este primer bloque de if es el que determina la funcion que se va a ejecutar si se oprime el boton de Responder
        if(e.getSource() == btnResponder ){
            respuesta= res.getText();
            if(respuesta.equals(resultado)== false){//Obtiene si la respuesta que ingreso el jugador es correcta
                //si la respuesta fue incorrecta, informa que se perdio el juego y crea el registro al jugador sobre este juego y llama a la funcion terminar partida
                JOptionPane.showMessageDialog(null,"Perdiste");
                MultiMath mm = new MultiMath("MultiMath","Juego matematico que se basa en responder la mayor cantidad de operaciones posibles");    
                mm.crearRegistro(puntaje*10, mm);        
                mm.terminarPartida();
                this.dispose();
            }else{
                //Si la respuesta fue correcta suma el puntaje y vuelve a realizar el mismo proceso 
                puntaje++;
                game();
                
            }
        }
        else{
            //Este primer bloque de if es el que determina la funcion que se va a ejecutar si se oprime el boton de Salir 
            if(e.getSource() ==btnSalir){
                
                this.dispose();
            }      
        }      
    }
}
