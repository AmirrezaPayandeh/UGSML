package UGSMLTransformationEngine.Services;

import java.io.*;

public class HelperService
{	
	private int BitmaskCounter = 0;
	public int IncreamentBitmaskCounter()
	{
		return BitmaskCounter++;
	}
	public void ResetBitmaskCounter()
	{
		BitmaskCounter = 0;
	}
	
	private Integer NumberOfRemainingParameters = 0;
	public void SetNumberOfRemainingParameters(Integer Input)
	{
		NumberOfRemainingParameters = Input;
	}
	public Integer DecreaseNumberofRemainingParameters()
	{
		return NumberOfRemainingParameters--;
	}
	
	private boolean HasAnyEnumeration = false;
	public void SetHasAnyEnumeration()
	{
		HasAnyEnumeration = true;
	}
	public boolean GetHasAnyEnumeration()
	{
		return HasAnyEnumeration;
	}
	
	public void CopyPluginImage() throws IOException
	{
	    InputStream is = null;
	    OutputStream os = null;
	    try {
	        is = new FileInputStream("Resources/Icon128.png");
	        os = new FileOutputStream("GeneratedCode/Plugins/UGSML/Resources/Icon128.png");
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } finally {
	        is.close();
	        os.close();
	    }
	}
}
