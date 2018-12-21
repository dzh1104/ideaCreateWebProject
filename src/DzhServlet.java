import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// 撩课学院 idea 创建web项目

//@javax.servlet.annotation.WebServlet(name = "DzhServlet")
//@javax.servlet.annotation.WebServlet(name = "/DzhServlet")
@WebServlet("/DzhServlet")
public class DzhServlet extends javax.servlet.http.HttpServlet {

//    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//
//    }
//
//    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//
//    }

    void test () {

        System.out.println("test222");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Dzh Servlet");
        test();
        super.service(req, resp);
    }

}
