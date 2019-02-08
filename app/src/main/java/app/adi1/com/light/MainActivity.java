package app.adi1.com.light;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Random;

import android.widget.RelativeLayout;

import java.util.Random;

import static app.adi1.com.light.R.id.*;

public class MainActivity extends AppCompatActivity {


    Button button;
    Button buttonred;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout bgElement = (ConstraintLayout) findViewById(R.id.activity_main);
        bgElement.setBackgroundColor(Color.WHITE);
        mybuttonlm();
        mybuttonred();
        mybuttonblue();
    }
    public void mybuttonred() {
        Button buttonred = (Button) findViewById(R.id.buttonred);
        buttonred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConstraintLayout bgElement = (ConstraintLayout) findViewById(R.id.activity_main);
                bgElement.setBackgroundColor(Color.RED);
            }
        });
    }
    public void mybuttonblue() {
        Button buttonblue = (Button) findViewById(R.id.buttonblue);
        buttonblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConstraintLayout bgElement = (ConstraintLayout) findViewById(R.id.activity_main);
                bgElement.setBackgroundColor(Color.BLUE);
            }
        });
    }
    public void mybuttonlm() {
        Button button = (Button) findViewById(R.id.button);
         button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConstraintLayout bgElement = (ConstraintLayout) findViewById(R.id.activity_main);
                int color = ((ColorDrawable) bgElement.getBackground()).getColor();
                if (color == Color.RED) {
                    bgElement.setBackgroundColor(Color.BLUE);
                } else {
                    if (color == Color.BLUE) {
                        bgElement.setBackgroundColor(Color.GREEN);
                    } else {
                        Random rand = new Random();
                        float r = rand.nextFloat();
                        float g = rand.nextFloat();
                        float b = rand.nextFloat();
                        color = Color.rgb(r,g,b);
                        bgElement.setBackgroundColor(color); ;
                    }

                }
            }
            });
        }
    }

