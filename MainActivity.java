package com.example.android.androidquiz;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }





    public void startActivity(View View){

        Intent intent = new Intent(this,submitFinal.class);

        startActivity(intent);


    }
    public void profileActivity(View View){

        Intent intent = new Intent(this,createProfile.class);
        startActivity(intent);
    }
  public void saveProfileMethod(View View){

      String myName = NameContent.getName();
      TextView nameTextOnScreen = (TextView)findViewById(R.id.setNameOnScreen);
      nameTextOnScreen.setText(myName);
      String picture = NameContent.getPicturePath();
      ImageView myImage = (ImageView) findViewById(R.id.imageFirstActivity);
      myImage.setImageBitmap(BitmapFactory.decodeFile(picture));

  }
  public void instructionActivity(View View){

      Intent intent = new Intent(this,Instruction.class);
      startActivity(intent);
  }
  public void seeResult(View View){


      Intent intent = new Intent(this, FinalSubmit.class);
      startActivity(intent);
      finish();
  }

}
