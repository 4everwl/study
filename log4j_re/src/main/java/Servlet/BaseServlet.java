package Servlet;

import org.apache.juli.logging.Log;
import org.apache.logging.log4j.LogManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.logging.Logger;

/**
 * @program: log4j_re
 * @description:
 * @author: 168
 * @create: 2025-02-16 12:08
 **/
public class BaseServlet extends HttpServlet {
//    private static Logger logger = LogManager.getLogger(BaseServlet.class.getName());
    public static final org.apache.logging.log4j.Logger logger = LogManager.getLogger();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase","true");

//        Logger logger= LogManager.getLogger(BaseServlet.class.getName());
//        Logger logger= Logger.getLogger();
        String payload=req.getParameter("username");
        PrintWriter printWriter=resp.getWriter();
        printWriter.println("this is username:"+payload);
        logger.error(payload);
//        logger.

    }




}
