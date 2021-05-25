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
			lm = LogManager.getLogManager();//�α׸޴��� ���� ���� �־���
			logger = lm.getLogger(Logger.GLOBAL_LOGGER_NAME);
			fh=new FileHandler(fileName, true);
			logger.addHandler(fh);//logger�� ������ �ִ� ����
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void log(String logm) {//getlog�� ���� file system�� ��� -write�� �̿��� log���
		logger.info(logm);
		
	}
}
