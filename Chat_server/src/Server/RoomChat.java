/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.IOException;


public class RoomChat {

    
    public static void main(String[] args) throws IOException {
        int port=1234;
        Server first=new Server(port);
     
        first.main(args);
    }
    
}
