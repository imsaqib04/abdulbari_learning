public class StudentTest {

        public String name;
        public int roll_no;
        public String grade;
        public int m1, m2, m3;
        public String course;

        public int total() {
            return m1 + m2 + m3;
        }

        public float average() {
            return (m1 + m2 + m3) / 3;
        }

        public String grade() {
            if (average() >= 60) {
                return "A";
            } else {
                return "B";
            }
        }

        public String toString() {
            return "Roll No:" + roll_no + "\n" + "Name:" + name + "\n" + "Course:" + course + "\n";

        }

}
