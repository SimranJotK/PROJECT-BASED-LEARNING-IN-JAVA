<!DOCTYPE html>
<html>
<head>
  <title>Student Attendance Portal</title>
</head>
<body>
  <h2>Mark Attendance</h2>
  <form action="AttendanceServlet" method="POST">
    Student ID: <input type="number" name="StudentID" required><br><br>
    Date: <input type="date" name="Date" required><br><br>
    Status: 
    <select name="Status">
      <option value="Present">Present</option>
      <option value="Absent">Absent</option>
    </select><br><br>
    <input type="submit" value="Submit Attendance">
  </form>
</body>
</html>
