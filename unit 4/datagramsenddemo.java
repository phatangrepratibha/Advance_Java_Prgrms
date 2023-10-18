import java.net.*;
import java.io.*;
class datagramsenddemo
{
   public static void main(String args[])throws IOException

   {
      DatagramSocket ds=new DatagramSocket();
	  byte data[]="welcome to vjtech academy".getBytes();
	  int len=data.length;
	  InetAddress addr=InetAddress.getByName("127.0.0.1");
	  DatagramPacket dp=new DatagramPacket(data,len,addr,8080);
	  ds.send(dp);
	  ds.close();
   }
}