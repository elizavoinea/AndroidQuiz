package com.example.android.androidquiz;

import android.support.v7.app.AppCompatActivity;

import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;



public class createProfile extends AppCompatActivity {
    private static int RESULT_LOAD_IMAGE = 1;
    public String picturePath;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);
        Button buttonLoadImage = (Button) findViewById(R.id.buttonImageBrowser);

        //TODO: am nevie sa stochez datele


        buttonLoadImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent i = new Intent(
                        Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

                startActivityForResult(i, RESULT_LOAD_IMAGE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && null != data) {
            Uri selectedImage = data.getData();

            String[] filePathColumn = { MediaStore.Images.Media.DATA };

            Cursor cursor = getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);

            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            picturePath = cursor.getString(columnIndex);
            cursor.close();

            ImageView imageView = (ImageView) findViewById(R.id.imgLoaded);
            imageView.setImageBitmap(BitmapFactory.decodeFile(picturePath));

        }


    }
    public void getName(View View){

        EditText  nameEdit = (EditText)findViewById(R.id.name);
        String editText = nameEdit.getText().toString();
        NameContent.setName(editText);
        NameContent.setPicturePath(picturePath);
        finish();


    }


}

