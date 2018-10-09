package com.example.vladimir.mycalc

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

import org.mariuszgromada.math.mxparser.*;
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import org.mariuszgromada.math.mxparser.mXparser



class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState != null) {
            text_eval.text = savedInstanceState["eval"].toString();
            text_ans.text = savedInstanceState["ans"].toString();
        }

        b_clear.setOnClickListener {
            text_eval.text = ""
        }

        b_backspace.setOnClickListener {
            val str = text_eval.text.toString()
            if (str.length > 0) {
                text_eval.text = str.take(str.length - 1)
                text_ans.text = calculateFromString(text_eval.text.toString())
            }
        }

        b_equal.setOnClickListener {
            text_eval.text = text_ans.text
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_0.setOnClickListener {
            text_eval.text = "${text_eval.text}0"
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_1.setOnClickListener {
            text_eval.text = "${text_eval.text}1"
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_2.setOnClickListener {
            text_eval.text = "${text_eval.text}2"
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_3.setOnClickListener {
            text_eval.text = "${text_eval.text}3"
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_4.setOnClickListener {
            text_eval.text = "${text_eval.text}4"
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_5.setOnClickListener {
            text_eval.text = "${text_eval.text}5"
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_6.setOnClickListener {
            text_eval.text = "${text_eval.text}6"
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_7.setOnClickListener {
            text_eval.text = "${text_eval.text}7"
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_8.setOnClickListener {
            text_eval.text = "${text_eval.text}8"
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_9.setOnClickListener {
            text_eval.text = "${text_eval.text}9"
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_dot.setOnClickListener {
            text_eval.text = "${text_eval.text}."
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_sign.setOnClickListener {
            text_eval.text = "-(${text_eval.text})"
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_plus.setOnClickListener {
            text_eval.text = "${text_eval.text}+"
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_minus.setOnClickListener {
            text_eval.text = "${text_eval.text}-"
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_multiply.setOnClickListener {
            text_eval.text = "${text_eval.text}*"
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_divide.setOnClickListener {
            text_eval.text = "${text_eval.text}/"
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_leftBracket.setOnClickListener {
            text_eval.text = "${text_eval.text}("
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_rightBracket.setOnClickListener {
            text_eval.text = "${text_eval.text})"
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_pow.setOnClickListener {
            text_eval.text = "${text_eval.text}^"
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_sqrt.setOnClickListener {
            text_eval.text = "${text_eval.text}sqrt("
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_ln.setOnClickListener {
            text_eval.text = "${text_eval.text}ln("
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {

            b_pi.setOnClickListener {
                text_eval.text = "${text_eval.text}pi"
                text_ans.text = calculateFromString(text_eval.text.toString())
            }

            b_e.setOnClickListener {
                text_eval.text = "${text_eval.text}e"
                text_ans.text = calculateFromString(text_eval.text.toString())
            }

            b_abs.setOnClickListener {
                text_eval.text = "${text_eval.text}abs("
                text_ans.text = calculateFromString(text_eval.text.toString())
            }

            b_factorial.setOnClickListener {
                text_eval.text = "${text_eval.text}!"
                text_ans.text = calculateFromString(text_eval.text.toString())
            }

            b_sin.setOnClickListener {
                text_eval.text = "${text_eval.text}sin("
                text_ans.text = calculateFromString(text_eval.text.toString())
            }

            b_arcsin.setOnClickListener {
                text_eval.text = "${text_eval.text}arcsin("
                text_ans.text = calculateFromString(text_eval.text.toString())
            }

            b_cos.setOnClickListener {
                text_eval.text = "${text_eval.text}cos("
                text_ans.text = calculateFromString(text_eval.text.toString())
            }

            b_arccos.setOnClickListener {
                text_eval.text = "${text_eval.text}arccos("
                text_ans.text = calculateFromString(text_eval.text.toString())
            }

            b_tan.setOnClickListener {
                text_eval.text = "${text_eval.text}tan("
                text_ans.text = calculateFromString(text_eval.text.toString())
            }

            b_arctan.setOnClickListener {
                text_eval.text = "${text_eval.text}arctan("
                text_ans.text = calculateFromString(text_eval.text.toString())
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)

        outState!!.putString("eval",text_eval.text.toString())
        outState!!.putString("ans",text_ans.text.toString())
    }

    fun calculateFromString(str: String): String {
        val e = Expression(str)
        try {
            val s = e.calculate().toString()
            if (s == "NaN") {
                return ""
            }
            if (s.length > 2 && s[s.length - 1] == '0' && s[s.length - 2] == '.') {
                return s.take(s.length - 2)
            }
            return s
        } catch (e: Exception) {
            return ""
        }
    }

}