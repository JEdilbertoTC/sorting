package uaslp.enginering.labs;

public class AlumnoAscendatComparator implements Comparator {

    @Override
    public int compare(Object left, Object right) {
        Alumno studentleft = (Alumno) left;

        Alumno studentright = (Alumno) right;
        if (studentright.getLastName().compareTo(studentleft.getLastName()) == 0) {
            if (studentright.getFirstName().compareTo(studentleft.getFirstName()) > 0) {
                return studentright.getFirstName().compareTo(studentleft.getFirstName());
            }
            return studentright.getFirstName().compareTo(studentleft.getFirstName());
        }
        return studentright.getLastName().compareTo(studentleft.getLastName());
    }


}
