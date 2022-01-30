package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView playerText;

    Button button_1_1, button_1_2, button_1_3;
    Button button_2_1, button_2_2, button_2_3;
    Button button_3_1, button_3_2, button_3_3;

    int count=0;

    boolean gameActivity=true;

    int[] filledButton = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_1_1 = findViewById(R.id.button_1_1);
        button_1_2 = findViewById(R.id.button_1_2);
        button_1_3 = findViewById(R.id.button_1_3);
        button_2_1 = findViewById(R.id.button_2_1);
        button_2_2 = findViewById(R.id.button_2_2);
        button_2_3 = findViewById(R.id.button_2_3);
        button_3_1 = findViewById(R.id.button_3_1);
        button_3_2 = findViewById(R.id.button_3_2);
        button_3_3 = findViewById(R.id.button_3_3);

        playerText = findViewById(R.id.player_text);
    }

    public void pressButtonEvent(View buttonClick) {

        if(!gameActivity) return;

        if(count%2==0) {
            playerText.setText(R.string.player_2_turn);
        } else {
            playerText.setText(R.string.player_1_turn);
        }

        ++count;

        switch(buttonClick.getId()) {

            case R.id.button_1_1:

                if(filledButton[0]==1) return;

                if(count%2==0) {
                    button_1_1.setText("X");
                } else {
                    button_1_1.setText("O");
                }

                filledButton[0] = 1;

                win();
                break;

            case R.id.button_1_2:

                if(filledButton[1] == 1) return;

                if(count%2==0) {
                    button_1_2.setText("X");
                } else {
                    button_1_2.setText("O");
                }

                filledButton[1] = 1;

                win();
                break;

            case R.id.button_1_3:

                if(filledButton[2] == 1) return;

                if(count%2==0) {
                    button_1_3.setText("X");
                } else {
                    button_1_3.setText("O");
                }

                filledButton[2] = 1;

                win();
                break;

            case R.id.button_2_1:

                if(filledButton[3] == 1) return;

                if(count%2==0) {
                    button_2_1.setText("X");
                } else {
                    button_2_1.setText("O");
                }

                filledButton[3] = 1;

                win();
                break;

            case R.id.button_2_2:

                if(filledButton[4] == 1) return;

                if(count%2==0) {
                    button_2_2.setText("X");
                } else {
                    button_2_2.setText("O");
                }

                filledButton[4] = 1;

                win();
                break;

            case R.id.button_2_3:

                if(filledButton[5] == 1) return;

                if(count%2==0) {
                    button_2_3.setText("X");
                } else {
                    button_2_3.setText("O");
                }

                filledButton[5] = 1;

                win();
                break;

            case R.id.button_3_1:

                if(filledButton[6] == 1) return;

                if(count%2==0) {
                    button_3_1.setText("X");
                } else {
                    button_3_1.setText("O");
                }

                filledButton[6] = 1;

                win();
                break;

            case R.id.button_3_2:

                if(filledButton[7] == 1) return;

                if(count%2==0) {
                    button_3_2.setText("X");
                } else {
                    button_3_2.setText("O");
                }

                filledButton[7] = 1;

                win();
                break;

            case R.id.button_3_3:

                if(filledButton[8] == 1) return;

                if(count%2==0) {
                    button_3_3.setText("X");
                } else {
                    button_3_3.setText("O");
                }

                filledButton[8] = 1;

                win();
                break;
        }
    }

    public void win() {

        if (button_3_1.getText() == "O" && button_3_2.getText() == "O" && button_3_3.getText() == "O") {
            playerText.setText(R.string.player_1_won);
            gameActivity = false;
        }

        if (button_2_1.getText() == "O" && button_2_2.getText() == "O" && button_2_3.getText() == "O") {
            playerText.setText(R.string.player_1_won);
            gameActivity = false;
        }

        if (button_1_1.getText() == "O" && button_1_2.getText() == "O" && button_1_3.getText() == "O") {
            playerText.setText(R.string.player_1_won);
            gameActivity = false;
        }

        if (button_1_1.getText() == "O" && button_2_2.getText() == "O" && button_3_3.getText() == "O") {
            playerText.setText(R.string.player_1_won);
            gameActivity = false;
        }

        if (button_1_3.getText() == "O" && button_2_2.getText() == "O" && button_3_1.getText() == "O") {
            playerText.setText(R.string.player_1_won);
            gameActivity = false;
        }

        if (button_1_1.getText() == "O" && button_2_1.getText() == "O" && button_3_1.getText() == "O") {
            playerText.setText(R.string.player_1_won);
            gameActivity = false;
        }

        if (button_1_2.getText() == "O" && button_2_2.getText() == "O" && button_3_2.getText() == "O") {
            playerText.setText(R.string.player_1_won);
            gameActivity = false;
        }

        if (button_1_3.getText() == "O" && button_2_3.getText() == "O" && button_3_3.getText() == "O") {
            playerText.setText(R.string.player_1_won);
            gameActivity = false;
        }

        if (button_3_1.getText() == "X" && button_3_2.getText() == "X" && button_3_3.getText() == "X") {
            playerText.setText(R.string.player_2_won);
            gameActivity = false;
        }

        if (button_2_1.getText() == "X" && button_2_2.getText() == "X" && button_2_3.getText() == "X") {
            playerText.setText(R.string.player_2_won);
            gameActivity = false;
        }

        if (button_1_1.getText() == "X" && button_1_2.getText() == "X" && button_1_3.getText() == "X") {
            playerText.setText(R.string.player_2_won);
            gameActivity = false;
        }

        if (button_1_1.getText() == "X" && button_2_2.getText() == "X" && button_3_3.getText() == "X") {
            playerText.setText(R.string.player_2_won);
            gameActivity = false;
        }

        if (button_1_3.getText() == "X" && button_2_2.getText() == "X" && button_3_1.getText() == "X") {
            playerText.setText(R.string.player_2_won);
            gameActivity = false;
        }

        if (button_1_1.getText() == "X" && button_2_1.getText() == "X" && button_3_1.getText() == "X") {
            playerText.setText(R.string.player_2_won);
            gameActivity = false;
        }

        if (button_1_2.getText() == "X" && button_2_2.getText() == "X" && button_3_2.getText() == "X") {
            playerText.setText(R.string.player_2_won);
            gameActivity = false;
        }

        if (button_1_3.getText() == "X" && button_2_3.getText() == "X" && button_3_3.getText() == "X") {
            playerText.setText(R.string.player_2_won);
            gameActivity = false;
        }
    }
}