package com.responsi.ngobrolkuy;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfilePicActivity extends AppCompatActivity {

    ImageView avatarImage, pick;
    TextView lewati;
    CardView lanjut;
    ActivityResultLauncher<String> mGetContent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_pic);
        pick = findViewById(R.id.pinkCircle);
        avatarImage = findViewById(R.id.profilePic);
        lewati = findViewById(R.id.lewati);
        lanjut = findViewById(R.id.lanjut);
        mGetContent = registerForActivityResult(new ActivityResultContracts.GetContent(), new ActivityResultCallback<Uri>() {
            @Override
            public void onActivityResult(Uri result) {
                avatarImage.setImageURI(result);
            }
        });

        pick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mGetContent.launch("image/*");
                lewati.setVisibility(View.INVISIBLE);
                lanjut.setVisibility(View.VISIBLE);
            }
        });
        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfilePicActivity.this, SettingActivity.class);
                startActivity(intent);
            }
        });
    }
}