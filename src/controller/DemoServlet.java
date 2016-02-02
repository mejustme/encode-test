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
public class DemoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if("yes".equals(action)){
            String name1=request.getParameter("name1");
            System.out.println("1"+name1);
            name1 = URLDecoder.decode(name1, "UTF-8");
            System.out.println("2"+name1);
            request.setAttribute("name1", name1);

            request.getRequestDispatcher("pages/showResult.jsp").forward(request, response);

            //response.sendRedirect("hotelMgr?act=loadHotel");
        }else if("no".equals(action)) {
                String name2=request.getParameter("name2");
                String name22 =  new String(request.getParameter("name2").getBytes("ISO-8859-1"),"UTF-8");
                System.out.println("1"+name2);
                System.out.println("12"+name22);
                name2= URLDecoder.decode(name2, "UTF-8");
                System.out.println("2"+name2);
                request.setAttribute("name2", name2);

                request.getRequestDispatcher("pages/showResult.jsp").forward(request, response);

                //response.sendRedirect("hotelMgr?act=loadHotel");

        }else if("post".equals(action)){
            String name3=request.getParameter("name3");
            System.out.println("1"+name3);
            name3= URLDecoder.decode(name3, "UTF-8");
            System.out.println(name3);

            //  request.getRequestDispatcher("pages/showResult.jsp").forward(request, response);
        }else if("ys".equals(action)){
          /*  response.setContentType("text/html");
            response.setCharacterEncoding("GBK");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
            out.println("<HTML>");
            out.println("  <HEAD><TITLE>A Servlet</TITLE>");
            out.println("<style>span{width:80px;text-align:center;color:blue}</style>");
            out.println("<meta http-equiv=\"content-type\" content=\"text/html;charset=GBK\">");
            out.println("</HEAD>");
            out.println("  <BODY>");
            out.println(" <h1> ");
            out.println(" 汉字 ");
            out.println("</h1>");
            out.println("  </BODY>");
            out.println("</HTML>");
            out.flush();
            out.close();*/
            String name4=request.getParameter("name4");
            System.out.println("1"+name4);
        }


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
