package EnumPractice;

public enum Dept {

    CS ( "JOHN", "BLOCK A" ), IT ( "IKKI", "BLOCK B" ), ECE ( "JIM", "BLOCK C" ), CIVIL ( "DENY", "BLOCK D" );

    String head;
    String Location;

    private Dept(String head, String loc) {
        this.head = head;
        this.Location = loc;
    }
}
