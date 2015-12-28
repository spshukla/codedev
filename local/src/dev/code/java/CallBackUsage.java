package dev.code.java;

/**
 * Created by shreeprakash on 12/21/15.
 */
public class CallBackUsage {
    public static void main(String args[]) {


        for (int i = 0; i < 10; i++) {
            invokeMethod("failure1", new CallBackInterface() {
                @Override
                public void onSuccess(String state) {
                    System.out.println("State output=" + state);
                }

                @Override
                public void onFailure(String state) {
                    System.out.println("State output=" + state);
                }
            });
        }

    }

    public static void invokeMethod(String state, CallBackInterface callBackInterface) {
        if ("success".equalsIgnoreCase(state)) {
            callBackInterface.onSuccess(state);
        } else {
            callBackInterface.onFailure(state);
        }
    }
}
