package main;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.Holder;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.AllRequestsServlet;

/**
 * Created by leonid on 24.10.16.
 */
public class Main {
    public static void main(String[] args)  throws Exception
    {
        AllRequestsServlet allRequestsServlet = new AllRequestsServlet();

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(new ServletHolder(allRequestsServlet), "/mirror");


        Server server = new Server(8080);
        server.setHandler(context);


        System.out.println("hello world");

        server.start();
        java.util.logging.Logger.getGlobal().info("Server started");
        server.join();
    }
}
