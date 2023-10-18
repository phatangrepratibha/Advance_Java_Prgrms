import java.net.*;
import java.io.*;
class serverdemo
{
    public static void main(String args[])throws UnknownHostException,IOException
	{
	   ServerSocket ss=new ServerSocket(8080);
	   Socket s2=ss.accept();
	   InputStream in=s2.getInputStream();
	  OutputStream out=s2.getOutputStream();
	  int c;
	  while((c=in.read())!=-1)
	  {
		  System.out.println((char)c);
	  }
	  s2.close();
	}
	
}