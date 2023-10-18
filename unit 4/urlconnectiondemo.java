import java.net.*;
import java.util.*;
import java.io.*;
class urlconnectiondemo
{
 public static void main(String args[])throws MalformedURLException,IOException
 {
	 URL u1=new URL("http://www.msbte.org.in");
	 URLConnection u2=u1.openConnection();
	 
	 System.out.println(" date=" +new Date(u2.getDate()));
	 System.out.println("type of content "+u2.getContentType());
	 System.out.println("length of content "+u2.getContentLength());
	 System.out.println("exipiry date "+new Date(u2.getExpiration()));
	 System.out.println("last modified date "+new Date(u2.getLastModified()));
	 
 }
}