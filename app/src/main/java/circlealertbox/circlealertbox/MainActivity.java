package circlealertbox.circlealertbox;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {

    Dialog custom_dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        custom_dialog=new Dialog(this);
        custom_dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        custom_dialog.setContentView(R.layout.dialog_custom);
        custom_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Button exit_alert = custom_dialog.findViewById(R.id.exit_alert);
        exit_alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                custom_dialog.dismiss();
            }
        });
    }
    public void onButtonClickShowCircleBox(View v)
    {

        custom_dialog.show();
    }
}
