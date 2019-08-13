
public class CallStudent {

    public static void main(String[] args) {
        System.out.println("Hello My World..");
        Student Thawatchai = new Student();
        System.out.println("Object Thawatchai = " + Thawatchai);
        Thawatchai.addCourse();
        Thawatchai.dropCourse();
        Thawatchai.payment();
        Thawatchai.enrollment();

        //crete object GraduateStudent
        GraduateStudent George = new GraduateStudent();
        System.out.println("Object George = " + George);
        George.oralExamination();
        George.thesisExamination();
        George.payment();
        George.enrollment();
        George.dropCourse();
        George.addCourse();
    }
}
