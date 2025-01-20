import oracle.SelectStudentOracle;

public class Main {
    public static void main(String[] args) {

        String[][] students = {
                {"John Doe", "20", "john.doe@example.com"},
                {"Jane Smith", "22", "jane.smith@example.com"},
                {"Alice Johnson", "19", "alice.johnson@example.com"},
                {"Bob Brown", "21", "bob.brown@example.com"}
        };

//        InsertStudentData postgreSql = new InsertStudentData();
//        postgreSql.insertDummyData(students);

//        oracle.InsertStudentOracle oracle = new oracle.InsertStudentOracle();
//        oracle.insertDummyData(students);

        SelectStudentOracle selectStudentOracle = new SelectStudentOracle();
        selectStudentOracle.selectAllStudents();

    }
}