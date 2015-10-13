package java112.project2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.*;

/**
 *  This is Lab 5 - Servlet Practice to demonstrate the init method and
 *     use of instance variables.
 *
 *@author    pwaite
 */
@WebServlet(
    name = "servletPractice",
    urlPatterns = { "/lab5" }
)
public class Lab5 extends HttpServlet {

    int hitCounter = 0;
    Date firstAccessDate;
    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        log("Lab5 doGet method just executed");
        hitCounter++;
        response.setContentType("text/html");
        // set the response type before sending data
        PrintWriter  out  = response.getWriter();
        out.print("<HTML>");
        out.print("<HEAD><TITLE>Lab 5 - Practice Servlet</TITLE></HEAD>");
        out.print("<BODY>");
        out.print("<h1>Lab 5 Servlet!</h1>");
        out.print("<table border='1'><tr><td>");
        out.print("You are visitor number");
        out.print("</td>");
        out.print("<td>");
        out.print(hitCounter);
        out.print("</td></tr>");
        out.print("<tr><td>");
        out.print("First Access Date/Time");
        out.print("</td>");
        out.print("<td>");
        out.print(firstAccessDate);
        out.print("</td></tr>");
        out.print("<tr><td>Current Date/Time</td><td>"
                + retrieveCurrentDateTime() + "</td></tr></table>");
        out.print("</BODY>");
        out.print("</HTML>");
        out.close();
    }

    // The init method runs the first time the servlet is accessed.
    public void init() {
        log("Lab5 init method just executed");
        firstAccessDate = retrieveCurrentDateTime();
    }

    public Date retrieveCurrentDateTime() {
        return new Date();
    }
}

