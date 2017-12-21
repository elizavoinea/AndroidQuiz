package com.example.android.androidquiz;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FinalSubmit extends AppCompatActivity {

   public String name;
   public String score;
   public String picture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_final_submit);

    }

    public void seeres(View View){


        name = NameContent.getName();
        score = NameContent.getScore();
        TextView nameText = (TextView)findViewById(R.id.nameFinal);
        TextView scoreText = (TextView)findViewById(R.id.scoreFinal);
        scoreText.setText(score);
        nameText.setText(name);
        picture = NameContent.getPicturePath();

        ImageView myImage = (ImageView) findViewById(R.id.profileImageFinal);
        myImage.setImageBitmap(BitmapFactory.decodeFile(picture));

        //scoreText.setText(score);
    }


}
