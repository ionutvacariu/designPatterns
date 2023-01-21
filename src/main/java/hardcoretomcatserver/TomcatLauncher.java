package hardcoretomcatserver;

import jakarta.annotation.PostConstruct;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class TomcatLauncher {

    @PostConstruct
    public void start() throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8888);

        Context context = tomcat.addContext("", null);// single app, no context needed

        Tomcat.addServlet(context, "testServlet", new HelloControllerServlet());

        context.addServletMappingDecoded("/", "testServlet");
        tomcat.start();

        tomcat.getConnector();
        new Thread(() -> tomcat.getServer().await()).start();
    }

}