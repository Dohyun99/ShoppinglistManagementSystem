package EventLog;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class EventLog {
	FileHandler fh;//
	LogManager lm;
	Logger logger;
	public EventLog(String fileName) {
		try {
			lm = LogManager.getLogManager();//로그메니져 에서 값을 넣어줌
			logger = lm.getLogger(Logger.GLOBAL_LOGGER_NAME);
			fh=new FileHandler(fileName, true);
			logger.addHandler(fh);//logger를 덧붙혀 주는 형태
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void log(String logm) {//getlog를 통해 file system에 기록 -write를 이용해 log기록
		logger.info(logm);
		
	}
}
