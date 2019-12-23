package ua.epam.patternsTest;

public class NotSolidUser {

    private Long id;
    private String name;

    //getter, setter

    private Long someDataCalc() {
        Long magicNumber = 108L;
        return id * magicNumber;
    }
}
