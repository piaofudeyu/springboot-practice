package cn.stackbox.practise.common;

import java.lang.annotation.*;


@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TadalinDataSource {

    String name() default TadalinDataSource.master;

    public static String master = "masterDataSource";

    public static String slave = "slaveDataSource";

}
