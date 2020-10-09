package uaslp.enginering.labs;

public class IntegerAscendantComparator implements Comparator{

    @Override
    public int compare(Object left, Object right){
        Integer integerLeft = (Integer)left;
        Integer integerRight = (Integer)right;

        return  integerRight - integerLeft;
    }

}
