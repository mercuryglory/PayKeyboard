package com.mercury.keyboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showPayKeyBoard(View view) {
        final PopEnterPassword pop = new PopEnterPassword(this);

        pop.showAtLocation(this.findViewById(R.id.activity_main), Gravity.BOTTOM | Gravity
                .CENTER_HORIZONTAL, 0, 0);

        pop.getPwdView().setOnFinishInput(new OnPasswordInputFinish() {
            @Override
            public void inputFinish(String password) {
                pop.dismiss();
                Toast.makeText(MainActivity.this, "支付成功，密码为：" + password, Toast.LENGTH_SHORT)
                        .show();
            }
        });

        pop.getPwdView().getTvCancel().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pop.dismiss();
            }
        });

        pop.getPwdView().getTvForget().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "忘记密码", Toast.LENGTH_SHORT)
                        .show();

            }
        });


    }

}
