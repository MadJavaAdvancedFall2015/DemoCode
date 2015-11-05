package java112.project3;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java112.demo.*;
import java.util.*;

/**
 *  Demo of using httpServletRequest and attributes
 *
 *@author    pwaite
 */
@WebServlet(
    name = "attributeDemo",
    urlPatterns = { "/attributeDemoV1" }
)
public class AttributeDemoV1 extends HttpServlet {

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

        request.setAttribute("someVariable", "123");

        Student student = new Student("SuperStar", "Student", "A", 111222);

        request.setAttribute("Nancy", student);

        response.setContentType("text/html");
                // set the response type before sending data
        PrintWriter  out  = response.getWriter();
        out.print("<HTML>");
        out.print("<HEAD><TITLE>RequestAttribute demo</TITLE></HEAD>");
        out.print("<BODY>");
        out.print("<h1>Request Attribute Demo</h1>");
        out.print(request.getAttribute("someVariable"));
        out.print("<BR />");
        // this
        out.print(request.getAttribute("Nancy"));
        out.print("</BODY>");
        out.print("</HTML>");
        out.close();



            /* RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
            */

            /* Student student = new Student("SuperStar", "Student", "A", 111222);
            request.setAttribute("student", student);*/

    }
}

