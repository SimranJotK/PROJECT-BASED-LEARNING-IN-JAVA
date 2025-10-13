import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class EmployeeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String empId = request.getParameter("EmpID");

        try (Connection con = DBConnection.getConnection()) {
            Statement stmt = con.createStatement();
            ResultSet rs;

            if (empId != null && !empId.isEmpty()) {
                rs = stmt.executeQuery("SELECT * FROM Employee WHERE EmpID=" + empId);
            } else {
                rs = stmt.executeQuery("SELECT * FROM Employee");
            }

            out.println("<h2>Employee Records</h2>");
            out.println("<table border='1'><tr><th>ID</th><th>Name</th><th>Salary</th></tr>");
            while (rs.next()) {
                out.println("<tr><td>" + rs.getInt("EmpID") + "</td>");
                out.println("<td>" + rs.getString("Name") + "</td>");
                out.println("<td>" + rs.getDouble("Salary") + "</td></tr>");
            }
            out.println("</table>");

        } catch (SQLException e) {
            e.printStackTrace(out);
        }
    }
}
