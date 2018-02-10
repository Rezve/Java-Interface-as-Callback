package com.rezve;

public class Activity {
    /**
     * We create a button object and passed an implementation
     * of OnClickLister Interface
     */
    public void OnCreate() {
        Button button = new Button(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("OMG! Someone clicked my button!");
            }
        });
    }
}
