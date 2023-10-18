import java.net.*;
class urldemo
{
   public static void main(String args[])throws MalformedURLException
   {
      URL ul=new URL("https://www.vjtechacademy.in:1813/explore");
	  System.out.println("protocol name :"+ul.getProtocol());
	  System.out.println("host name :"+ul.getHost());
	  System.out.println("port no :"+ul.getPort());
	  System.out.println("file path :"+ul.getFile());
	  
   }
}