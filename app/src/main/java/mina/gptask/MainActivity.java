package mina.gptask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mloginBtn;
    private TextView mloginNewAccBtn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mloginBtn = (Button) findViewById(R.id.loginBtn);
        mloginNewAccBtn = (TextView) findViewById(R.id.newAccountBtn);

        mloginBtn.setOnClickListener(this);
        mloginNewAccBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.loginBtn){

        }
        if(v.getId() == R.id.newAccountBtn){
            Intent signUp = new Intent(MainActivity.this, SignUp.class);
            MainActivity.this.startActivity(signUp);

        }
    }
}
