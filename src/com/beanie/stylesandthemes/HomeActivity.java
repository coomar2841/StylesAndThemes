package com.beanie.stylesandthemes;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HomeActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        
        Button buttonDialog = (Button)findViewById(R.id.button1);
        buttonDialog.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                openTheDamnDialog();
            }
        });
        
        Button buttonThemedDialog = (Button)findViewById(R.id.button2);
        buttonThemedDialog.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                openTheThemedDialog();
            }
        });
    }
    
    private void openTheThemedDialog(){
        MyDialog dialog = new MyDialog(this, R.style.MyThemedDialog);
        dialog.setTitle("Here's my title");
        dialog.show();
    }

    private void openTheDamnDialog(){
        MyDialog dialog = new MyDialog(this);
        dialog.setTitle("Here's my title");
        dialog.show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_activity, menu);
        return true;
    }

    
}
