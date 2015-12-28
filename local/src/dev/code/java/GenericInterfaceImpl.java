package dev.code.java;

/**
 * Created by shreeprakash on 12/21/15.
 */
public class GenericInterfaceImpl implements GenericInterface {

    @Override
    public Object apply(Object arg1, Object arg2) {
        if (arg1.equals(arg2)) {
            return "Success";
        } else {
            return "Failure";
        }
    }

    @Override
    public int verify(int arg1, Object arg2) {
        if (arg2 instanceof Integer) {
            if (arg1 == arg2) {
                return 0;
            } else {
                return 1;
            }
        }
        return 1;
    }

    public static void main(String agrs[]) {
        GenericInterfaceImpl obj = new GenericInterfaceImpl();
        String str1 = "str1";
        String str2 = "str1";
        System.out.println(obj.apply(str1, str2));
        System.out.println(obj.verify(1, 2));
    }
}
