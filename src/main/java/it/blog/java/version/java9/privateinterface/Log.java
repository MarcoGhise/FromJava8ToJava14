package it.blog.java.version.java9.privateinterface;

public class Log implements ILog{

	public void logMyApplication(String msg)
	{
		logInfo(msg);
		logError(msg);
		logWarning(msg);
	}
}
