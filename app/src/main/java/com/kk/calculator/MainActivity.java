package com.kk.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //VARIABLES
    static String temp = "0";
    static String temp2 = "0";
    static String op;
    static boolean num1, num2, operator, equalbutton, resulted, decimal1, decimal2 = false;
    static double result = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView numberArea = (TextView) findViewById(R.id.textView);
        final TextView topNumberArea = (TextView) findViewById(R.id.textView2);
        final Button button0 = findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (num1 == false && operator == false) {
                    num1 = true;
                    temp = "0";
                    numberArea.setText("0");
                } else if (num1 == true && operator == false) {
                    temp = temp + "0";
                    numberArea.setText(temp);
                } else if (num2 == false && operator == true) {
                    temp2 = "0";
                    numberArea.setText(temp2);
                    num2 = true;
                } else if (num2 == true && operator == true) {
                    temp2 = temp2 + "0";
                    numberArea.setText(temp2);
                }
            }
        });
        // NUMBER ONE
        final Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (num1 == false && operator == false) {
                    num1 = true;
                    temp = "1";
                    numberArea.setText("1");
                } else if (num1 == true && operator == false) {
                    temp = temp + "1";
                    numberArea.setText(temp);
                } else if (num2 == false && operator == true) {
                    temp2 = "1";
                    numberArea.setText(temp2);
                    num2 = true;
                } else if (num2 == true && operator == true) {
                    temp2 = temp2 + "1";
                    numberArea.setText(temp2);
                }
            }
        });
        // NUMBER TWO
        final Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (num1 == false && operator == false) {
                    num1 = true;
                    temp = "2";
                    numberArea.setText("2");
                } else if (num1 == true && operator == false) {
                    temp = temp + "2";
                    numberArea.setText(temp);
                } else if (num2 == false && operator == true) {
                    temp2 = "2";
                    numberArea.setText(temp2);
                    num2 = true;
                } else if (num2 == true && operator == true) {
                    temp2 = temp2 + "2";
                    numberArea.setText(temp2);
                }
            }
        });
        // NUMBER THREE
        final Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (num1 == false && operator == false) {
                    num1 = true;
                    temp = "3";
                    numberArea.setText("3");
                } else if (num1 == true && operator == false) {
                    temp = temp + "3";
                    numberArea.setText(temp);
                } else if (num2 == false && operator == true) {
                    temp2 = "3";
                    numberArea.setText(temp2);
                    num2 = true;
                } else if (num2 == true && operator == true) {
                    temp2 = temp2 + "3";
                    numberArea.setText(temp2);
                }
            }
        });
        // NUMBER FOUR
        final Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (num1 == false && operator == false) {
                    num1 = true;
                    temp = "4";
                    numberArea.setText("4");
                } else if (num1 == true && operator == false) {
                    temp = temp + "4";
                    numberArea.setText(temp);
                } else if (num2 == false && operator == true) {
                    temp2 = "4";
                    numberArea.setText(temp2);
                    num2 = true;
                } else if (num2 == true && operator == true) {
                    temp2 = temp2 + "4";
                    numberArea.setText(temp2);
                }
            }
        });
        // NUMBER FIVE
        final Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (num1 == false && operator == false) {
                    num1 = true;
                    temp = "5";
                    numberArea.setText("5");
                } else if (num1 == true && operator == false) {
                    temp = temp + "5";
                    numberArea.setText(temp);
                } else if (num2 == false && operator == true) {
                    temp2 = "5";
                    numberArea.setText(temp2);
                    num2 = true;
                } else if (num2 == true && operator == true) {
                    temp2 = temp2 + "5";
                    numberArea.setText(temp2);
                }
            }
        });
        // NUMBER SIX
        final Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (num1 == false && operator == false) {
                    num1 = true;
                    temp = "6";
                    numberArea.setText("6");
                } else if (num1 == true && operator == false) {
                    temp = temp + "6";
                    numberArea.setText(temp);
                } else if (num2 == false && operator == true) {
                    temp2 = "6";
                    numberArea.setText(temp2);
                    num2 = true;
                } else if (num2 == true && operator == true) {
                    temp2 = temp2 + "6";
                    numberArea.setText(temp2);
                }
            }
        });
        // NUMBER SEVEN
        final Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (num1 == false && operator == false) {
                    num1 = true;
                    temp = "7";
                    numberArea.setText("7");
                } else if (num1 == true && operator == false) {
                    temp = temp + "7";
                    numberArea.setText(temp);
                } else if (num2 == false && operator == true) {
                    temp2 = "7";
                    numberArea.setText(temp2);
                    num2 = true;
                } else if (num2 == true && operator == true) {
                    temp2 = temp2 + "7";
                    numberArea.setText(temp2);
                }
            }
        });
        // NUMBER EIGHT
        final Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (num1 == false && operator == false) {
                    num1 = true;
                    temp = "8";
                    numberArea.setText("8");
                } else if (num1 == true && operator == false) {
                    temp = temp + "8";
                    numberArea.setText(temp);
                } else if (num2 == false && operator == true) {
                    temp2 = "8";
                    numberArea.setText(temp2);
                    num2 = true;
                } else if (num2 == true && operator == true) {
                    temp2 = temp2 + "8";
                    numberArea.setText(temp2);
                }
            }
        });
        // NUMBER NINE
        final Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (num1 == false && operator == false) {
                    num1 = true;
                    temp = "9";
                    numberArea.setText("9");
                } else if (num1 == true && operator == false) {
                    temp = temp + "9";
                    numberArea.setText(temp);
                } else if (num2 == false && operator == true) {
                    temp2 = "9";
                    numberArea.setText(temp2);
                    num2 = true;
                } else if (num2 == true && operator == true) {
                    temp2 = temp2 + "9";
                    numberArea.setText(temp2);
                }
            }
        });
        // EQUAL SIGN
        final Button buttonequal = findViewById(R.id.buttonequal);
        buttonequal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (equalbutton == false && num1 == true && num2 == true && operator == true) {
                    equalbutton = true;
                    num2 = false;
                    topNumberArea.setText(temp + " " + op + " " + temp2 + " = ");

                    if (op == "+") {
                        result = Functions.addition(Double.parseDouble(temp), Double.parseDouble(temp2));
                    } else if (op == "-") {
                        result = Functions.subtract(Double.parseDouble(temp), Double.parseDouble(temp2));
                    } else if (op == "x") {
                        result = Functions.multiplication(Double.parseDouble(temp), Double.parseDouble(temp2));
                    } else if (op == "÷") {
                        result = Functions.division(Double.parseDouble(temp), Double.parseDouble(temp2));
                    }
                    numberArea.setText(Double.toString(result));
                    temp = Double.toString(result);
                    operator = false;
                    op = " ";
                    resulted = true;
                    // decimal1 = false; ?? not sure if include
                    decimal2 = false;
                    temp2 = "0";
                }

            }
        });
        final Button buttonplus = findViewById(R.id.buttonplus);
        buttonplus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (operator == false) {
                    operator = true;
                    num1 = true;
                    op = "+";
                    topNumberArea.setText(temp + " " + op);
                    if (resulted == true) {
                        numberArea.setText(temp);
                    } else {
                        numberArea.setText(temp2);
                    }
                    equalbutton = false;

                }
            }
        });
        final Button buttonminus = findViewById(R.id.buttonminus);
        buttonminus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (operator == false) {
                    operator = true;
                    num1 = true;
                    op = "-";
                    topNumberArea.setText(temp + " " + op);
                    if (resulted == true) {
                        numberArea.setText(temp);
                    } else {
                        numberArea.setText(temp2);
                    }
                    equalbutton = false;

                }

            }
        });
        final Button buttonmultiply = findViewById(R.id.buttonmultiply);
        buttonmultiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (operator == false) {
                    operator = true;
                    num1 = true;
                    op = "x";
                    topNumberArea.setText(temp + " " + op);
                    if (resulted == true) {
                        numberArea.setText(temp);
                    } else {
                        numberArea.setText(temp2);
                    }
                    equalbutton = false;
                }
            }
        });
        final Button buttondivision = findViewById(R.id.buttondivision);
        buttondivision.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (operator == false) {
                    operator = true;
                    num1 = true;
                    op = "÷";
                    topNumberArea.setText(temp + " " + op);
                    if (resulted == true) {
                        numberArea.setText(temp);
                    } else {
                        numberArea.setText(temp2);
                    }
                    equalbutton = false;
                }
            }
        });
        // DECIMAL SIGN
        final Button buttondecimal = findViewById(R.id.buttondot);
        buttondecimal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (decimal1 == false && num1 == true && operator == false && num2 == false) {
                    decimal1 = true;
                    temp = temp + ".";
                    numberArea.setText(temp);
                    // if they only press . at start
                } else if (decimal1 == false && num1 == false && operator == false && num2 == false) {
                    decimal1 = true;
                    num1 = true;
                    temp = temp + ".";
                    numberArea.setText(temp);
                } else if (decimal2 == false && decimal1 == true && num1 == true && num2 == true && operator == true
                        && equalbutton == false) {
                    decimal2 = true;
                    temp2 = temp2 + ".";
                    numberArea.setText(temp2);
                } else if (decimal2 == false && num2 == false && operator == true && num1 == true
                        && equalbutton == false) {
                    decimal2 = true;
                    num2 = true;
                    temp2 = temp2 + ".";
                    numberArea.setText(temp2);
                } else if (decimal1 == false && num1 == true && operator == true && num2 == true
                        && equalbutton == false) {
                    decimal2 = true;
                    num2 = true;
                    temp2 = temp2 + ".";
                    numberArea.setText(temp2);
                }
            }
        });
        // CLEAR ALL
        final Button button_clearall = findViewById(R.id.button_clearall);
        button_clearall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = "0";
                temp2 = "0";
                topNumberArea.setText("");
                numberArea.setText(temp);
                num1 = false;
                num2 = false;
                operator = false;
                equalbutton = false;
                resulted = false;
                decimal1 = false;
                decimal2 = false;

            }
        });
        // Back button
        final Button button_backspace = findViewById(R.id.button_backspace);
        button_backspace.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (num2 == false) {
                    if (temp == "0") {
                    } else if (temp.length() == 1) {
                        temp = "0";
                        numberArea.setText(temp);
                        num1 = false;
                    } else {
                        temp = temp.substring(0, temp.length() - 1);
                        numberArea.setText(temp);
                    }
                } else {
                    if (temp2 == "0") {
                    } else if (temp2.length() == 1) {
                        temp2 = "0";
                        numberArea.setText(temp2);
                        num2 = false;
                    } else {
                        temp2 = temp2.substring(0, temp2.length() - 1);
                        numberArea.setText(temp2);
                    }
                }
            }
        });
    }
}
