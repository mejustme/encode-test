package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;


/**
 * Created by lianxu-admin on 2015/8/31.
 */
@WebServlet(name = "DemoServlet")
public class GBKServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            response.setContentType("text/html");
            response.setCharacterEncoding("GB2312");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
            out.println("<HTML>");
            out.println("  <HEAD><TITLE>A Servlet</TITLE>");
            out.println("<style>span{width:80px;text-align:center;color:blue}</style>");
            out.println("<meta http-equiv=\"content-type\" content=\"text/html;charset=UTF-8\">");
            out.println("</HEAD>");
            out.println("  <BODY>");
            out.println(" <h1> ");
            out.println(" 汉字 ");
            out.println("</h1>");
            out.println("  </BODY>");
            out.println("</HTML>");
            out.flush();
            out.close();
        }



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
