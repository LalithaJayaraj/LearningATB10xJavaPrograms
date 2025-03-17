package ex_24_AccessModifiers.Criminal;

import ex_24_AccessModifiers.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief = new Cop(100);
        // thief.shootAccess(); When the shootAccess() was public thief was able to access. which should not be allowed.
        // when shootAccess() is changes to private thief as well as Junior Cop could not access
        // where we need Junior cop should access shootAccess();
        // to solve this the shootAccess() is changed to protected where the Classes within that packages can access
        // and not the class from other package

    }
}
