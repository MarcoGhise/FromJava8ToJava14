package it.blog.java.version.java9.privateinterface;

public interface ILog {

	private void log(String msg, String type) {
		System.out.println("msg:" + msg + " type:" + type);
	}

	default void logInfo(String msg) {
		log(msg, "INFO");
	}

	default void logWarning(String msg) {
		log(msg, "WARNING");
	}

	default void logError(String msg) {
		log(msg, "ERROR");
	}
}
