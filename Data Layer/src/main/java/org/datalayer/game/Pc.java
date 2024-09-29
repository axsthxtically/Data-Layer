package org.datalayer.game;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class Pc {
    private String hostname;
    private String info;

    public Pc() {
        setPcName();
    }

    public String getPcName() {
        return this.hostname;
    }

    public void setPcName() {
        try {
            InetAddress addr = InetAddress.getLocalHost();
            this.hostname = addr.getHostName();
        } catch (UnknownHostException ex) {
            System.out.println("Hostname cannot be resolved");
            this.hostname = "Unknown";
        }
    }
}


