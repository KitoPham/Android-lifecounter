package edu.washington.kpham97.lifecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public int score1 = 20;
    public int score2 = 20;
    public int score3 = 20;
    public int score4 = 20;
    public TextView gameover;
    public TextView p1txt;
    public TextView p2txt;
    public TextView p3txt;
    public TextView p4txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        /*Player 1 Buttons */

        Button oneaddone = (Button) findViewById(R.id.oneAdd1);
        oneaddone.setOnClickListener(this);

        Button oneaddfive = (Button) findViewById(R.id.oneAdd5);
        oneaddfive.setOnClickListener(this);

        Button onesubone = (Button) findViewById(R.id.oneSub1);
        onesubone.setOnClickListener(this);
        Button onesubfive = (Button) findViewById(R.id.oneSub5);
        onesubfive.setOnClickListener(this);

        /*Player 2 Buttons */

        Button twoaddone = (Button) findViewById(R.id.twoAdd1);
        twoaddone.setOnClickListener(this);

        Button twoaddfive = (Button) findViewById(R.id.twoAdd5);
        twoaddfive.setOnClickListener(this);

        Button twosubone = (Button) findViewById(R.id.twoSub1);
        twosubone.setOnClickListener(this);

        Button twosubfive = (Button) findViewById(R.id.twoSub5);
        twosubfive.setOnClickListener(this);

        /*Player 3 Buttons */

        Button threeaddone = (Button) findViewById(R.id.threeAdd1);
        threeaddone.setOnClickListener(this);

        Button threeaddfive = (Button) findViewById(R.id.threeAdd5);
        threeaddfive.setOnClickListener(this);

        Button threesubone = (Button) findViewById(R.id.threeSub1);
        threesubone.setOnClickListener(this);

        Button threesubfive = (Button) findViewById(R.id.threeSub5);
        threesubfive.setOnClickListener(this);

        /*Player 4 Buttons */

        Button fouraddone = (Button) findViewById(R.id.fourAdd1);
        fouraddone.setOnClickListener(this);

        Button fouraddfive = (Button) findViewById(R.id.fourAdd5);
        fouraddfive.setOnClickListener(this);

        Button foursubone = (Button) findViewById(R.id.fourSub1);
        foursubone.setOnClickListener(this);

        Button foursubfive = (Button) findViewById(R.id.fourSub5);
        foursubfive.setOnClickListener(this);

        gameover = (TextView) findViewById(R.id.youLose);
        p1txt = (TextView) findViewById(R.id.player1score);
        p2txt = (TextView) findViewById(R.id.player2score);
        p3txt = (TextView) findViewById(R.id.player3score);
        p4txt = (TextView) findViewById(R.id.player4score);


    }

    public void onClick(View v){


        /*Checks what button was pressed*/
        switch(v.getId()){
            /* Add Score Buttons */
            /*Player 1*/
            case R.id.oneAdd1:
                score1 ++;
                p1txt.setText("" + score1 + "");
                break;
            case R.id.oneAdd5:
                score1 += 5;
                p1txt.setText("" + score1 + "");
                break;

            /*Player 2*/
            case R.id.twoAdd1:
                score2 ++;
                p2txt.setText("" + score2 + "");
                break;
            case R.id.twoAdd5:
                score2 += 5;
                p2txt.setText("" + score2 + "");
                break;

            /*Player 3*/
            case R.id.threeAdd1:
                score3 ++;
                p3txt.setText("" + score3 + "");
                break;
            case R.id.threeAdd5:
                score3 += 5;
                p3txt.setText("" + score3 + "");
                break;

            /*Player 4*/
            case R.id.fourAdd1:
                score4 ++;
                p4txt.setText("" + score4 + "");
                break;
            case R.id.fourAdd5:
                score4 += 5;
                p4txt.setText("" + score4 + "");
                break;

            /*Subtract Score Buttons*/
            /*Player 1*/
            case R.id.oneSub1:
                score1 --;
                p1txt.setText("" + score1 + "");
                if(score1 <= 0){
                    gameover.setBackgroundResource(R.color.red);
                    gameover.setText(R.string.p1lose);
                }
                break;
            case R.id.oneSub5:
                score1 -= 5;
                p1txt.setText("" + score1 + "");
                if(score1 <= 0){
                    gameover.setBackgroundResource(R.color.red);
                    gameover.setText(R.string.p1lose);
                }
                break;

            /*Player 2*/
            case R.id.twoSub1:
                score2 --;
                p2txt.setText("" + score2 + "");
                if(score2 <= 0){
                    gameover.setBackgroundResource(R.color.red);
                    gameover.setText(R.string.p2lose);
                }
                break;
            case R.id.twoSub5:
                score2 -= 5;
                p2txt.setText("" + score2 + "");
                if(score2 <= 0){
                    gameover.setBackgroundResource(R.color.red);
                    gameover.setText(R.string.p2lose);
                }
                break;

            /*Player 3*/
            case R.id.threeSub1:
                score3 --;
                p3txt.setText("" + score3 + "");
                if(score3 <= 0){
                    gameover.setBackgroundResource(R.color.red);
                    gameover.setText(R.string.p3lose);
                }
                break;
            case R.id.threeSub5:
                score3 -= 5;
                p3txt.setText("" + score3 + "");
                if(score3 <= 0){
                    gameover.setBackgroundResource(R.color.red);
                    gameover.setText(R.string.p3lose);
                }
                break;

            /*Player 4*/
            case R.id.fourSub1:
                score4 --;
                p4txt.setText("" + score4 + "");
                if(score4 <= 0){
                    gameover.setBackgroundResource(R.color.red);
                    gameover.setText(R.string.p4lose);
                }
                break;
            case R.id.fourSub5:
                score4 -= 5;
                p4txt.setText("" + score4 + "");
                if(score4 <= 0){
                    gameover.setBackgroundResource(R.color.red);
                    gameover.setText(R.string.p4lose);
                }
                break;


        }
        /* End Switch */
    }
}
