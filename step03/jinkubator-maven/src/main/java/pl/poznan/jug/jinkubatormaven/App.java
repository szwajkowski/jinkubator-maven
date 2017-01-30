package pl.poznan.jug.jinkubatormaven;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println(ToStringBuilder.reflectionToString(new Sample("first", "second"), ToStringStyle.SHORT_PREFIX_STYLE));
    }
}
