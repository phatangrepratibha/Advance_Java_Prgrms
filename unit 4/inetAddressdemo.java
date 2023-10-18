import java.net.*;
class inetAddressdemo 
{
  public static void main(String args[])throws UnknownHostException
  {
    InetAddress addr=InetAddress.getLocalHost();
	System.out.println("local address is :"+addr);
   addr=InetAddress.getByName("msbte.org.in");
	System.out.println("getByName method result is :"+addr);
	InetAddress a[]=InetAddress.getAllByName("www.facebook.com");
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	System.out.println(" "+addr.isMulticastAddress());
  }
}