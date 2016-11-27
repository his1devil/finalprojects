package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.right;

public class MainActivity extends AppCompatActivity {

    int options = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // check answer
    public boolean checkResult1(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.firstQ);
        RadioButton right = (RadioButton) findViewById(R.id.firstFirst);
        int checkedId = radioGroup.getCheckedRadioButtonId();
        if (checkedId == right.getId()) {
            displayToast("Right Choice!");
            return true;
        } else {
            displayToast("Wrong Answer, the answer is: " + right.getText().toString());
            return false;
        }
    }

    public boolean checkResult2(View view) {
        EditText et = (EditText) findViewById(R.id.second);
        String answer = et.getText().toString();
        if (answer.equals("class")) {
            displayToast("Right Choice! ");
            return true;
        } else {
            displayToast("Wrong Answer, the answer is: class");
            return false;
        }
    }

    public boolean checkResult3(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.third);
        RadioButton right = (RadioButton) findViewById(R.id.third1);
        int checkedId = radioGroup.getCheckedRadioButtonId();
        if (checkedId == right.getId()) {
            displayToast("Right Choice!");
            return true;
        } else {
            displayToast("Wrong Answer, the answer is: " + right.getText().toString());
            return false;
        }
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.four4:
                if (checked)
                    options += 1;
                break;
            case R.id.four5:
                if (checked)
                    options += 1;
                break;
            default:
                options = 0;
                break;
        }
    }

    public boolean checkResult4(View view) {
        if (options == 2) {
            displayToast("Right Choice!");
            return true;
        } else {
            displayToast("Wrong Answer");
            return false;
        }
    }

    public boolean checkResult5(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.five);
        RadioButton right = (RadioButton) findViewById(R.id.five1);
        int checkedId = radioGroup.getCheckedRadioButtonId();
        if (checkedId == right.getId()) {
            displayToast("Right Choice!");
            return true;
        } else {
            displayToast("Wrong Answer, the answer is: " + right.getText().toString());
            return false;
        }
    }

    // display toast
    public void displayToast(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        toast.show();
    }

    // get results
    public void submitScore(View view) {
        int score = 0;
        if (checkResult1(view)) {
            score += 20;
        }
        if (checkResult2(view)) {
            score += 20;
        }
        if (checkResult3(view)) {
            score += 20;
        }
        if (checkResult4(view)) {
            score += 20;
        }
        if (checkResult5(view)) {
            score += 20;
        }
        displayMessage("Your final score is: " + score);
    }

    private void displayMessage(String message) {
        TextView results = (TextView) findViewById(R.id.final_result);
        results.setText(message);
    }

}
