import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserController", urlPatterns = "/users")
public class UserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/user/login.jsp")
                .forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("ac");
        if (action == null) {
            return;
        }
        if (action.equals("login")) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if (loginSuccess(username, password)) {
                response.sendRedirect("/guests");
            }
        }
    }

    public static boolean loginSuccess(String username, String password) {
        if (username.equals("admin") && password.equals("123")) {
            return true;
        }
        return false;
    }
}
