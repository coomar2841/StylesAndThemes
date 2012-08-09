package com.beanie.stylesandthemes;

import android.app.Dialog;
import android.content.Context;

public class MyDialog extends Dialog {

    public MyDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        init();
    }

    public MyDialog(Context context, int theme) {
        super(context, theme);
        init();
    }

    public MyDialog(Context context) {
        super(context);
        init();
    }
    
    private void init(){
        setContentView(R.layout.dialog_layout);
    }

}
