package ua.dashan.rebus;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {
    private int i=1;
    EditText v;
    private boolean mFormating;
    EditText v2;
    Timer timer;
    EditText V;
    EditText a;
    EditText a2;
    EditText A;
    EditText g;
    EditText g2;
    Button b;
EditText o;
    EditText o2;
    EditText O;
    EditText n;
    EditText n2;
    TextView textView;
    EditText S;
    EditText S2;
    EditText T;
    TextView congrat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     v = (EditText)findViewById(R.id.letterV);
        v2=(EditText)findViewById(R.id.letterV2);
        V=(EditText)findViewById(R.id.V);
         a = (EditText)findViewById(R.id.letterA);
         a2 = (EditText)findViewById(R.id.letterA2);
         A = (EditText)findViewById(R.id.A);
         g = (EditText)findViewById(R.id.letterG);
         g2 = (EditText)findViewById(R.id.letterG2);
         S = (EditText)findViewById(R.id.S);
         S2 = (EditText)findViewById(R.id.S2);
         T = (EditText)findViewById(R.id.T);
textView=(TextView)findViewById(R.id.textView3);
congrat=(TextView)findViewById(R.id.congrat);
     o = (EditText)findViewById(R.id.letterO);
     o2 = (EditText)findViewById(R.id.letterO2);
        O = (EditText)findViewById(R.id.O);
        n = (EditText)findViewById(R.id.letterN);
        n2 = (EditText)findViewById(R.id.letterN2);
 b=(Button)findViewById(R.id.button);
v.addTextChangedListener(new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        //чтобы избежать рекурсии(когда метод вызывает сам себя) используем переменную mFormating
        if (!mFormating) {
            mFormating = true;
           // int i =Integer.parseInt(v.getText().toString());
            String text=v.getText().toString();
            if(text.equals("8")){
                //отключаем возможность ввода после ввода правильного ответа
                v.setEnabled(false);
                v.setTextColor(Color.BLACK);
                v2.setText("8");
                V.setText("8");
            }
            if(!text.equals("8")){

                 timer = new Timer();
                MyTimerTask myTimerTask=new MyTimerTask(v);
                timer.schedule(myTimerTask,500);
                textView.setText("Допущено ошибок: "+i );
            }
            mFormating = false;
            }
    }
});
        a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}
            @Override
            public void afterTextChanged(Editable s) {
                //чтобы избежать рекурсии(когда метод вызывает сам себя) используем переменную mFormating
                if (!mFormating) {
                    mFormating = true;
                    // int i =Integer.parseInt(v.getText().toString());
                    String text=a.getText().toString();
                    if(text.equals("5")){
                        //отключаем возможность ввода после ввода правильного ответа
                        a.setEnabled(false);
                        a.setTextColor(Color.BLACK);
                        a2.setText("5");
                        A.setText("5");
                    }
                    if(!text.equals("5")){
                        timer = new Timer();
                        MyTimerTask myTimerTask=new MyTimerTask(a);
                        timer.schedule(myTimerTask,500);
                        textView.setText("Допущено ошибок: "+i );
                    }
                    mFormating = false;
                }
            }
        });
        g.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                //чтобы избежать рекурсии(когда метод вызывает сам себя) используем переменную mFormating
                if (!mFormating) {
                    mFormating = true;
                    // int i =Integer.parseInt(v.getText().toString());
                    String text=g.getText().toString();
                    if(text.equals("6")){
                        //отключаем возможность ввода после ввода правильного ответа
                        g.setEnabled(false);
                        g.setTextColor(Color.BLACK);
                        g2.setText("6");

                    }
                    if(!text.equals("6")){
                        timer = new Timer();
                        MyTimerTask myTimerTask=new MyTimerTask(g);
                        timer.schedule(myTimerTask,500);
                        textView.setText("Допущено ошибок: "+i );
                    }
                    mFormating = false;
                }
            }
        });
        o.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}
            @Override
            public void afterTextChanged(Editable s) {
                //чтобы избежать рекурсии(когда метод вызывает сам себя) используем переменную mFormating
                if (!mFormating) {
                    mFormating = true;
                    String text=o.getText().toString();
                    if(text.equals("7")){
                        //отключаем возможность ввода после ввода правильного ответа
                        o.setEnabled(false);
                        o.setTextColor(Color.BLACK);
                        o2.setText("7");
                        O.setText("7");
                    }
                    if(!text.equals("7")){
                        timer = new Timer();
                        MyTimerTask myTimerTask=new MyTimerTask(o);
                        timer.schedule(myTimerTask,500);
                        textView.setText("Допущено ошибок: "+i );
                    }
                    mFormating = false;
                }
            }
        });
        n.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                //чтобы избежать рекурсии(когда метод вызывает сам себя) используем переменную mFormating
                if (!mFormating) {
                    mFormating = true;
                    // int i =Integer.parseInt(v.getText().toString());
                    String text=n.getText().toString();
                    if(text.equals("9")){
                        //отключаем возможность ввода после ввода правильного ответа
                        n.setEnabled(false);
                        n.setTextColor(Color.BLACK);
                        n2.setText("9");

                    }
                    if(!text.equals("9")){
                        timer = new Timer();
                        MyTimerTask myTimerTask=new MyTimerTask(n);
                        timer.schedule(myTimerTask,500);
                        textView.setText("Допущено ошибок: "+i );
                    }
                    mFormating = false;
                }
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v2.getText().toString().equals("8") & a2.getText().toString().equals("5")& g2.getText().toString().equals("6")& o2.getText().toString().equals("7")& n2.getText().toString().equals("9")){
                    S.setText("1");
                    S2.setText("1");
                    T.setText("3");
                    congrat.setText("Поздравляю!!!");
                }else congrat.setText("Давай думай!!!");
            }
        });


    }






   /* Классы Timer и TimerTask работают в связке. Класс Timer используется для планирования выполнения задачи.
    Запланированная к выполнению задача должна быть экземпляром класса TimerTask. Вы сначала создаёте объект
    класса TimerTask, а затем планируете его запуск с помощью класса Timer.*/
    class MyTimerTask extends TimerTask {
       //создаём переменную и конструктор, в него передаём эдит текст
      private EditText ed;

       public MyTimerTask(EditText ed){
           this.ed=ed;
       }
        @Override
        public void run() {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    ed.setText("");
                    i++;
                    timer.cancel();

                }
            });

        }

    }}






















    /*private boolean isValid(final EditText editText, final String expected) {
        String actual = editText.getText().toString();
        return expected.equals(actual);
    }

    *//** Визуализирует валидность поля. Как именно - неважно *//*
    private void visualizeValidity(final EditText editText, final boolean isValid) {
        int backgroundColor = (isValid) ? Color.GREEN : Color.RED;
        editText.setBackgroundColor(backgroundColor);
    }*/

/*
EditText editText = (EditText)findViewById(R.id.editText);
editText.setEnabled(false);
        editText.setCursorVisible(false);
        editText.setBackgroundColor(Color.TRANSPARENT);
        editText.setKeyListener(null);*/
