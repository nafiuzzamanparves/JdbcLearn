public class Main {
    public static void main(String[] args) {
        InsertStudentData insertStudentData = new InsertStudentData();

        // Define Dummy Data
        String[][] students = {
                {"John Doe", "20", "john.doe@example.com"},
                {"Jane Smith", "22", "jane.smith@example.com"},
                {"Alice Johnson", "19", "alice.johnson@example.com"},
                {"Bob Brown", "21", "bob.brown@example.com"}
        };

        // Call the method to insert dummy data
        insertStudentData.insertDummyData(students);
    }
}