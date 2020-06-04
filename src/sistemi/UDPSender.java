/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemi;

import java.net.*;

/**
 *
 * @author Laura Vasile e Alessandra Vetrugno
 */
public class UDPSender {

    public static void main(String args[],int port, String str) {
        DatagramSocket ds;
        try {
            ds = new DatagramSocket();
            InetAddress ip = InetAddress.getLocalHost();

            DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, port);
            ds.send(dp);
            ds.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }
}
