package com.rezve;

public class Button {
    // Save the listener for future execution of callback listener
    private OnClickListener listener;

    public Button(OnClickListener listener){
        this.listener = listener;
        /**
         *  Generate a fake button click
         *  we just call interface's onClick method
         */
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /**
         * Here is the magic
         * we invoke the method via interface
         */
        listener.onClick();
    }

    /**
     * Define an interface that our listeners pass
     * and we invoke their callback
     */
    interface OnClickListener{
        public void onClick();
    }
}
