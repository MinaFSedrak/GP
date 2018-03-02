package mina.gptask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static mina.gptask.R.id.alreadyHaveAccount;

public class SignUp extends Activity implements View.OnClickListener {
    private TextView mAlreadyHaveAccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mAlreadyHaveAccount = (TextView) findViewById(alreadyHaveAccount);

        mAlreadyHaveAccount.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == alreadyHaveAccount){
            Intent signIn = new Intent(SignUp.this, MainActivity.class);
            SignUp.this.startActivity(signIn);

        }
    }
}
