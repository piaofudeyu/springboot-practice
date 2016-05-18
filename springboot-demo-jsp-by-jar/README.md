springboot-practise-jsp-by-jar
====

网上的例子都是打war包然后运行, 这个demo用来演示springboot打包类型为 `jar` 时应该如何配置


### 加入依赖

```xml
<dependency>
	<groupId>javax.servlet</groupId>
	<artifactId>jstl</artifactId>
</dependency>
<dependency>
	<groupId>org.apache.tomcat.embed</groupId>
	<artifactId>tomcat-embed-jasper</artifactId>
</dependency>
```

### 配置suffix， 在application.properties中配置

```
spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp
```

### JSP文件相关

如果参照普通的web项目, 把 /WEB-INF/views 放到一个新建的webapp文件夹时, 使用 `mvn spring-boot:run` 运行项目时jsp生效, 但是打成jar包
或者直接IDEA里RUN Main Class的时候会发现JSP失效, unzip最后的jar包发现webapp包没有打包进去

把相应文件夹放入 `META-INF/resources` 即可

原理: 默认的package类型为jar的时候, /webapp/WEB-INF下的文件不会自动的打包进去, 所以需要用到了一个Servlet3关于META-INF的一个特性: http://www.blogjava.net/yongboy/archive/2011/01/03/346208.html


### 运行项目

方式一: 使用命令行/Idea运行配置Maven启动参数: `mvn spring-boot:run`
方式二: Idea里右键主类直接运行项目
方式三: `mvn clean package && jar -jar target/*.jar`
