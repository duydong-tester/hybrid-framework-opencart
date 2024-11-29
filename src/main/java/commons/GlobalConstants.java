package commons;

import java.io.File;

public class GlobalConstants {

	public static final String PORTAL_SITE_URL = "http://localhost/opencart/upload/";
	public static final String ADMIN_SITE_URL = "http://localhost/opencart/upload/admin/";

	public static final byte LONG_TIMEOUT = 30;
	public static final byte SHORT_TIMEOUT = 5;
	public static final byte ONE_SEC = 1;

	public static final String PROJECT_PATH = System.getProperty("user.dir");
	public static final String SEPARATOR_CHAR = File.separator;
	public static final String FILE_UPLOAD_FOLDER = PROJECT_PATH + SEPARATOR_CHAR + "filesUpload" + SEPARATOR_CHAR;

}
