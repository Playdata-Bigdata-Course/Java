package log4jtest;

import org.apache.log4j.Logger;

public class Log4jTest {
	//log4jtest package���� Log4jTest Ŭ������ log����� ������ ��ü ����
	static Logger logger = Logger.getLogger("log4jtest.Log4jTest");
	
	public static void main(String[] args) {
		logger.trace("trace ����");
		logger.debug("debug ����");
		logger.info("info ����");
		logger.warn("warn ����");
		logger.fatal("fatal ����");
	}

}
