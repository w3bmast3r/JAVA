
package RC_Trab;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChatCliente extends JFrame {
    
    JTextField textoParaEnviar;
    Socket socket;
    PrintWriter escritor;
    
    public ChatCliente() throws IOException{
        super("Chat");
        
        Font fonte = new Font("Serif", Font.PLAIN, 26);
        textoParaEnviar = new JTextField();
        textoParaEnviar.setFont(fonte);
        JButton botao = new JButton("Enviar");
        botao.setFont(fonte);
        
        botao.addActionListener(new EnviarListener());
        
        Container envio = new JPanel();
        envio.setLayout(new BorderLayout());
        envio.add(BorderLayout.CENTER, textoParaEnviar);
        envio.add(BorderLayout.EAST, botao);
        getContentPane().add(BorderLayout.SOUTH, envio);
        
        configurarRede();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,90);
        setVisible(true);
    }
    
    public void configurarRede() throws IOException{
        try{
            socket = new Socket("127.0.0.1", 5000);
            escritor = new PrintWriter(socket.getOutputStream());
        } catch (Exception e) {}
    }
    
    private class EnviarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            escritor.println(textoParaEnviar);
            escritor.flush();
            textoParaEnviar.setText("");
            textoParaEnviar.requestFocus();
        }
        
    }
    
    public static void main(String[] args){
        
    }
    
}
