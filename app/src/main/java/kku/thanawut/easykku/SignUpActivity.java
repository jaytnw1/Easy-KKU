package kku.thanawut.easykku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.nio.channels.Channels;

public class SignUpActivity extends AppCompatActivity {
    //Explicit
    private EditText nameEditText,phoneEditText,
            userEditText, passwordEditText;
    private ImageView imageView;
    private Button button;
    private String nameString, phoneString,userString, passwordString;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Bind Widget
        nameEditText = (EditText) findViewById(R.id.editText);
        phoneEditText = (EditText) findViewById(R.id.editText2);
        userEditText = (EditText) findViewById(R.id.editText3);
        passwordEditText = (EditText) findViewById(R.id.editText4);
        imageView = (ImageView) findViewById(R.id.imageView2);
        button = (Button) findViewById(R.id.button3);
        //SignUp Controller
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Get Value From Edit Text
                nameString = nameEditText.getText().toString().trim();
                phoneString = phoneEditText.getText().toString().trim();
                userString = userEditText.getText().toString().trim();
                passwordString = passwordEditText.getText().toString().trim();

                //Cheack Space
                if (nameString.equals("")|| phoneString.equals("")|| userEditText.equals("")
                    || passwordString.equals("")){
                    //Have Space
                    Log.d("12novV1","Have Space");
                    MyAlert myAlert = new MyAlert(SignUpActivity.this, R.drawable.doremon48,
                            "มีช่องว่าง", "กรุณากรอกให้ครบทุกช่อง");
                    myAlert.myDialog();

                }

            } // onClick
        });


    } //Main Method
} // Main Class
