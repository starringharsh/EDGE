package com.edge.starringharsh.EDGE;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;


    public class TeamTemporary extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_temporary);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        int height = metrics.heightPixels;
        int width = metrics.widthPixels;

        ImageButton team18 = (ImageButton)findViewById(R.id.bTeam18);
        ImageButton team17 = (ImageButton)findViewById(R.id.bTeam17);
        team18.setLayoutParams(new LinearLayout.LayoutParams(width, width/2));
        team17.setLayoutParams(new LinearLayout.LayoutParams(width, width/2));


        team18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeamTemporary.this, Team.class);
                intent.putExtra("year", 18);
                startActivity(intent);
                finish();
            }
        });

        team17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeamTemporary.this, Team.class);
                intent.putExtra("year", 17);
                startActivity(intent);
                finish();
            }
        });

    }


        @Override
        public void onBackPressed() {
            Intent intent = new Intent(TeamTemporary.this, MainMenu.class);
            startActivity(intent);
            finish();
        }

        @Override
        public void finish() {
            super.finish();
            overridePendingTransition(0,0);
        }
}
