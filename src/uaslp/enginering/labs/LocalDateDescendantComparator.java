package uaslp.enginering.labs;

public class LocalDateDescendantComparator implements Comparator {

    @Override
    public int compare(Object left, Object right) {
        Alumno keyleft = (Alumno) left;
        Alumno keyright = (Alumno) right;

        if (keyleft.getBirthday().compareTo(keyright.getBirthday()) == 0) {
            if ((keyright.getClave() - keyleft.getClave()) < 0) {
                return (keyleft.getClave() - keyright.getClave());
            }
            return keyright.getClave() - keyleft.getClave();
        }
        return keyleft.getBirthday().compareTo(keyright.getBirthday());
    }
}
