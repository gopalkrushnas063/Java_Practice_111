package sprint4.day13;

import java.io.IOException;

public class _2WeAssignment {
    void m() throws IOException {

            throw new IOException("error");

    }
    void n() throws IOException {
        m();
    }
    void p(){
        try {
            m();
        } catch (IOException e) {
            System.out.println("Exception handeled");
        }
    }
    public static void main(String[] args) throws IOException {

        _2WeAssignment check = new _2WeAssignment();
        check.p();
    }
}
