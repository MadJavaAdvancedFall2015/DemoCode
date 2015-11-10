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
    urlPatterns = { "/attributeDemo" }
)
public class AttributeDemo extends HttpServlet {

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


        request.setAttribute("studentList", createStudentList());


        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/eldemo.jsp");
        dispatcher.forward(request, response);

    }

    public List createStudentList() {
        List<Student> list = new ArrayList<Student>();

        Student student = new Student("SuperStar", "Student", "A", 111222);
        Student student1 = new Student("Rockstar", "Student", "AB", 111223);
        Student student2 = new Student("Brown", "Charlie", "C", 111224);

        list.add(student);
        list.add(student1);
        list.add(student2);

        return list;
    }
}

