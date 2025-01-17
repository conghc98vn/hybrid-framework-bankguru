package commons;

import java.io.File;

public class GlobalConstants {
    public static final long SHORT_TIMEOUT = 5;
    public static final long LONG_TIMEOUT = 30;
    public static final String OS_NAME = System.getProperty("os.name");
    public static final String RELATIVE_PROJECT_PATH = System.getProperty("user.dir");
    public static final String UPLOAD_PATH = RELATIVE_PROJECT_PATH + File.separator + "uploadFiles" + File.separator;
    public static final String DOWNLOAD_PATH = RELATIVE_PROJECT_PATH + File.separator + "downloadFiles"
            + File.separator;

    public static final String REPORTING_NG_IMAGE_PATH = RELATIVE_PROJECT_PATH + File.separator + "reportNGImage"
            + File.separator;
    public static final String REPORTING_EXTENT_IMAGE_PATH = RELATIVE_PROJECT_PATH + File.separator
            + "reportExtentImage" + File.separator;

    public static final String RESOURCES_PATH = RELATIVE_PROJECT_PATH + File.separator + "resources" + File.separator;
    public static final String DATA_TEST_PATH = RELATIVE_PROJECT_PATH + File.separator + "src/test/resources" + File.separator;

    public static final String ENVIRONMENT_CONFIG_PATH = RELATIVE_PROJECT_PATH + File.separator + "src/main/resources"
            + File.separator;
}