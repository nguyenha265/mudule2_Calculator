import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "caculator", urlPatterns = "/index")
public class caculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer firstOperand = Integer.parseInt(request.getParameter("firstOperand"));
        Integer secondOperand = Integer.parseInt(request.getParameter("secondOperand"));
        String operator = request.getParameter("select");
        PrintWriter writer = response.getWriter();
        float result = 0;
        switch (operator) {
            case "addition":
                result = firstOperand + secondOperand;
                writer.println(result);
                break;
            case "subtration":
                result = firstOperand - secondOperand;
                writer.println(result);
                break;
            case "multiplication":
                result = firstOperand * secondOperand;
                writer.println(result);
                break;
            case "division":
              try {
                   result = firstOperand / secondOperand;
                   writer.println(result);
               }
               catch (Exception e) {
                   throw new RuntimeException("khong the chia cho 0");
               }
                break;
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
