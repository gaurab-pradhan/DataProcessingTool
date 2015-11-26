package SC_IM_DP;

import util.PropertiesUtil;

/**
 *
 * @author Gaurab Pradhan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PropertiesUtil.loadPropertiesFile();
        new Splash().setVisible(true);
    }
}
