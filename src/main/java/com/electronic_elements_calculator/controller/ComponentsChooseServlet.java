package com.electronic_elements_calculator.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

import static com.electronic_elements_calculator.model.TypeOfElement.CAPACITOR;
import static com.electronic_elements_calculator.model.TypeOfElement.RESISTOR;

@WebServlet("/ComponentsChooseServlet")
public class ComponentsChooseServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {

        HttpSession session = request.getSession();
        //session.setMaxInactiveInterval(1000);
        chosen2Component(request, response);

    }




    public void chosen2Component(HttpServletRequest request, HttpServletResponse response) throws IOException {



        String chosenComponent = request.getParameter("chooseComponent");

        if (chosenComponent.equals(RESISTOR.getDescription())){
            resistorResponse(response);

        }else if(chosenComponent.equals(CAPACITOR.getDescription())){
            capacitorResponse(response);
        }

    }

    private void capacitorResponse(HttpServletResponse response) throws IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("<title>Capacitor values calculator</title>");
        out.println("<link href=\"model/models-style.css\" rel=\"stylesheet\" type=\"text/css\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1 class=\"models-title-style\">Capacitor values calculator</h1>");
        out.println("</body>");
        out.println("</html>");

    }

    public void resistorResponse(HttpServletResponse response) throws IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html lang=\"en'\">");
        out.println("<head>");
        out.println("<title>Resistor values calculator</title>");
        out.println("<link href=\"model/models-style.css\" rel=\"stylesheet\" type=\"text/css\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1 class=\"models-title-style\">Resistor values calculator</h1>");
        out.println("</body>");
        out.println("</html>");



    }




}
