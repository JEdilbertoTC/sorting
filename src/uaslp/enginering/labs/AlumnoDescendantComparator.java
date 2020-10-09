package uaslp.enginering.labs;

public class AlumnoDescendantComparator implements Comparator{
    @Override
    public int compare(Object left, Object right) {
        Alumno studentleft = (Alumno) left;

        Alumno studentright = (Alumno) right;
        if (studentleft.getLastName().compareTo(studentright.getLastName()) == 0) {
            if (studentright.getFirstName().compareTo(studentleft.getFirstName()) < 0) {// Si es ordenar apellido mayor
                return studentleft.getFirstName().compareTo(studentright.getFirstName());//No se si el problema es ordenar apellido mayor y nombre mayor
                                                                                        //o Apellido mayor con nombre menor, solo cambiar
            }
            return studentright.getFirstName().compareTo(studentleft.getFirstName());//Cambiar Este
        }
        return studentleft.getLastName().compareTo(studentright.getLastName());
    }

}
