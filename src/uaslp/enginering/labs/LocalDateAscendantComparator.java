package uaslp.enginering.labs;

import java.time.LocalDate;

public class LocalDateAscendantComparator implements Comparator {

    @Override
    public int compare(Object left, Object right) {
        Alumno keyleft = (Alumno) left;
        Alumno keyright = (Alumno) right;

        if (keyright.getBirthday().compareTo(keyleft.getBirthday()) == 0) {
            if ((keyleft.getClave() - keyright.getClave()) > 0) {
                return (keyleft.getClave() - keyright.getClave());
            }
            return keyright.getClave() - keyleft.getClave();
        }
        return keyright.getBirthday().compareTo(keyleft.getBirthday());

    }

}
