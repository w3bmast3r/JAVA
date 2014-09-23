
package RC_Trab;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    
    public ChatServer() throws IOException{
        
        ServerSocket server = new ServerSocket(5000);
            while(true){
                Socket s = server.accept();
            }
        
    }
    
    public static void main(String[] args) throws IOException{
        
        new ChatServer();
        
    }

}