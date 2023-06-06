package utility;

import com.demo.session.apiframework.utility.CommonUtility;
import org.testng.annotations.BeforeSuite;

public class Fork {

	@BeforeSuite
	public void start() {
		CommonUtility.readPropertiesFile();
		CommonUtility.readEndpoint();
	}

}
