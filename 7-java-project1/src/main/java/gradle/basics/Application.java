package gradle.basics;

import org.apache.commons.lang3.StringUtils;

public class Application {

    public static void main(String[] args) {
        Application app = new Application();
        System.out.println("My Text 1 is Blank: " + app.isBlank("My Text 1"));
        System.out.println("null is Blank: "+ app.isBlank(null));
    }

    public boolean isBlank(String text) {
        return StringUtils.isBlank(text);
    }

}
