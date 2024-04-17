module org.example.course_work {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.course_work to javafx.fxml;
    exports org.example.course_work;
}