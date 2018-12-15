import java.io.*;
import java.net.*;
import java.io.BufferedReader;

class ClientCode
{
	OutputStreamWriter os;
	PrintWriter pw;
	Socket s;
	int port=44444;
	String str="Lokesh";

	ClientCode()
	{
		try
		{
			s=new Socket("localhost",port);
			os=new OutputStreamWriter(s.getOutputStream());
			pw=new PrintWriter(os);
			pw.write(str);
			os.flush();

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		new ClientCode();
	}
}
