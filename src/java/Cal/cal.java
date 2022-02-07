package Cal;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author win
 */
//@WebServlet(urlPatterns = "/cal")
public class cal extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String a = req.getParameter("a");
        String b = req.getParameter("b");
        String cal = req.getParameter("Cal");
        switch (cal) {
            case "+":
                out.println("Result = " + (Double.parseDouble(a) + Double.parseDouble(b)));
                break;
            case "-":
                out.println("Result = " + (Double.parseDouble(a) - Double.parseDouble(b)));
                break;
            case "*":
                out.println("Result = " + (Double.parseDouble(a) * Double.parseDouble(b)));
                break;
            default:
                out.println("Result = " + (Double.parseDouble(a) / Double.parseDouble(b)));
                break;

        }

    }

}
