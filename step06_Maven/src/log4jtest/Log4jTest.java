package log4jtest;

import org.apache.log4j.Logger;

public class Log4jTest {
	//log4jtest package내의 Log4jTest 클래스에 log기록이 가능한 객체 생성
	static Logger logger = Logger.getLogger("log4jtest.Log4jTest");
	
	public static void main(String[] args) {
		logger.trace("trace 레벨");
		logger.debug("debug 레벨");
		logger.info("info 레벨");
		logger.warn("warn 레벨");
		logger.fatal("fatal 레벨");
	}

}
