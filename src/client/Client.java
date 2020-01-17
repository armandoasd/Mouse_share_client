
package client;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Client {

    public static void main(String[] args) throws IOException, AWTException {
        Robot r = new Robot();
        
        
          String serverAddress = JOptionPane.showInputDialog(
            "Enter IP Address of the Mshare Server that is");
           

        
            
            
            
            while(true){
                try {
            Socket s = new Socket(serverAddress, 9090);
            

            
       /* BufferedReader input =
            new BufferedReader(new InputStreamReader(s.getInputStream())); 
            
        
        String answer = input.readLine();
        
        String[] inputNumber =  answer.split(",");
        
        
        int number []= new int[2];
         for(int i=0; i<inputNumber.length;i++){
       number[i]=Integer.parseInt(inputNumber[i]);
       input.close();
                     }

         
         
r.mouseMove(number[0],number[1]);
           
*/
       DataInputStream din = new DataInputStream(s.getInputStream());
       //System.out.println(din.readInt()+" "+din.readInt());
       
       r.mouseMove(din.readInt(), din.readInt());
        s.close();
                }
                catch(IOException e){
                System.out.println(e.getCause());
                }
        }
    }

}
    
    

