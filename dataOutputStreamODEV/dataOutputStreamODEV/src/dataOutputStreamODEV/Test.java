package dataOutputStreamODEV;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws Exception
	{
		Test dataOutputStreamDemo = new Test();
		dataOutputStreamDemo.writePrimitiveData();	
	}

	public void writePrimitiveData() throws IOException
	{
		DataOutputStream dataOutputStream = null;
		FileOutputStream fileOutputStream = null;
		try
		{
			fileOutputStream = new FileOutputStream("data.bin");
            dataOutputStream = new DataOutputStream(fileOutputStream);

            dataOutputStream.writeInt(125);
            dataOutputStream.writeFloat(150.45F);
            dataOutputStream.writeLong(1923);
            dataOutputStream.writeBoolean(true);
			
            System.out.println("Primitif veriler \'data.bin\' dosyas�na ba�ar�yla yazd�r�lm��t�r.");
		}
		finally
		{
			if (dataOutputStream != null)
            {
                /*
                 * DataOutputStream'i kapatmak,
                 * yazd��� OutputStream �rne�ini de kapat�r.
                 */
                dataOutputStream.close();
            }
			
		}
	}
}
