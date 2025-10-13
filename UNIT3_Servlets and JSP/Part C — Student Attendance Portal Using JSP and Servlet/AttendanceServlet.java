import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class AttendanceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int studentID = Integer.parseInt(request.getParameter("StudentID"));
        String date = request.getParameter("Date");
        String status = request.getParameter("Status");

        try (Connection con = DBConnection.getConnection()) {
            String sql = "INSERT INTO Attendance (StudentID, Date, Status) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, studentID);
            ps.setString(2, date);
            ps.setString(3, status);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                out.println("<h2>Attendance Recorded Successfully!</h2>");
            } else {
                out.println("<h3>Failed to record attendance.</h3>");
            }

        } catch (SQLException e) {
            e.printStackTrace(out);
        }
    }
}
