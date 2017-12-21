package com.example.android.androidquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

import android.widget.Toast;

public class submitFinal extends AppCompatActivity {
    public int score2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_final);



    }

    public void radioButton (View View){


        Toast.makeText(this,R.string.radiobutton,Toast.LENGTH_SHORT).show();

    }

    public void submitAnswers(View View){
        int score = 20;
        EditText answerTwoA = (EditText)findViewById(R.id.questionTwo);
        EditText answerTwoB = (EditText)findViewById(R.id.questionTwoB);
        EditText answerThreeA = (EditText)findViewById(R.id.answerThreeA);
        CheckBox answerScaleType = findViewById(R.id.ansSixScaleType);
        CheckBox answerLayoutWidth = findViewById(R.id.ansSixLayoutWidth);
        CheckBox answerLayoutHeight = findViewById(R.id.ansSixLayoutHeight);
        CheckBox answerAlignParent = findViewById(R.id.ansSixLayoutAlignParent);
        CheckBox answerId = findViewById(R.id.ansSixId);
        CheckBox answerBackground = findViewById(R.id.ansSixBackground);


        RadioGroup questionFour = (RadioGroup)findViewById(R.id.questionFourRadioGroup);

        RadioGroup  questionFive = (RadioGroup)findViewById(R.id.questionFiveRadioGroup);

        RadioGroup  questionThreeB = (RadioGroup)findViewById(R.id.questionThreeBradioGroup);

        RadioGroup  questionOne = (RadioGroup)findViewById(R.id.firstRadioGroup);

        String  answTwoA =answerTwoA.getText().toString();
        String answTwoB = answerTwoB.getText().toString();
        String answThreeA = answerThreeA.getText().toString();

        Boolean scaleType = answerScaleType.isChecked();
        Boolean layoutWidth = answerLayoutWidth.isChecked();
        Boolean layoutHeight = answerLayoutHeight.isChecked();
        Boolean alignParent = answerAlignParent.isChecked();
        Boolean id = answerId.isChecked();
        Boolean background = answerBackground.isChecked();



        if (answTwoA.equals("TextView")){

            score+=10;

        }
        if(answTwoB.equals("textColor")){

            score+=10;

        }

        if(answThreeA.equals("4")||answThreeA.equals("four")){

            score+=10;

        }



        if(questionFour.getCheckedRadioButtonId()==R.id.answerFourVertical){
            score+=10;
        }

        if(questionFive.getCheckedRadioButtonId()==R.id.answerFiveHorizontal){
            score+=10;
        }
        if(questionThreeB.getCheckedRadioButtonId()==R.id.answerThreeBParent){

            score+=10;
        }
        if  (questionOne.getCheckedRadioButtonId()==R.id.TextViewRButton ) {

            score += 10;

        }
        if (layoutHeight&&layoutWidth&&scaleType&&!background&&!id&&!alignParent){
            score+=10;
        }
        score2 = score;
        String submitText = "your score is "+score2;
        Toast.makeText(this,"Go back and click -See Result- ",Toast.LENGTH_SHORT).show();
        NameContent.setScore(submitText);




    }


}
