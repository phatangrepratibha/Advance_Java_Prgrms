import java.net.*;
import java.io.*;
class clientdemo
{
    public static void main(String args[])throws UnknownHostException,IOException
	{
	  Socket s1=new Socket("localhost",8080);
	  InputStream in=s1.getInputStream();
	  OutputStream out=s1.getOutputStream();
	  byte b[]="hii server".getBytes();
	  out.write(b);
	  s1.close();
	}
	
}