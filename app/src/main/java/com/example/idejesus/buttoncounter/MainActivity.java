package com.example.idejesus.buttoncounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText userInput;
    private TextView mTextView;
    private Button mButton;

    //1, Make sure that after each click userInput editext should be cleared
    //2. Make sure that when the UI is diaplayed the userInput and mtextView has no text.
    //3. Read on Activity Life Cycle and Bundle savedInstanceState
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = (EditText) findViewById(R.id.editText);
        mTextView = (TextView) findViewById(R.id.textView);
        mButton = (Button) findViewById(R.id.button);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = userInput.getText().toString();
                result = result + "\n";
                mTextView.append(result);

            }
        };
        mButton.setOnClickListener(onClickListener);

    }
}
