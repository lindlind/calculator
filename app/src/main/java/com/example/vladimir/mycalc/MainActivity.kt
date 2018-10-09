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
            text_ans.text = ""
        }

        b_backspace.setOnClickListener {
            val str = text_eval.text.toString()
            if (str.length > 0) {
                text_eval.text = str.take(str.length - 1)
                text_ans.text = calculateFromString(text_eval.text.toString())
            }
        }

        b_equal.setOnClickListener {
            if (text_ans.text.toString() != "" && text_ans.text.toString() != "ERROR") {
                text_eval.text = text_ans.text
                text_ans.text = calculateFromString(text_eval.text.toString())
            }
        }

        b_0.setOnClickListener {
            text_eval.text = specialConcat(text_eval.text.toString(), "0", "number")
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_1.setOnClickListener {
            text_eval.text = specialConcat(text_eval.text.toString(), "1", "number")
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_2.setOnClickListener {
            text_eval.text = specialConcat(text_eval.text.toString(), "2", "number")
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_3.setOnClickListener {
            text_eval.text = specialConcat(text_eval.text.toString(), "3", "number")
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_4.setOnClickListener {
            text_eval.text = specialConcat(text_eval.text.toString(), "4", "number")
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_5.setOnClickListener {
            text_eval.text = specialConcat(text_eval.text.toString(), "5", "number")
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_6.setOnClickListener {
            text_eval.text = specialConcat(text_eval.text.toString(), "6", "number")
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_7.setOnClickListener {
            text_eval.text = specialConcat(text_eval.text.toString(), "7", "number")
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_8.setOnClickListener {
            text_eval.text = specialConcat(text_eval.text.toString(), "8", "number")
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_9.setOnClickListener {
            text_eval.text = specialConcat(text_eval.text.toString(), "9", "number")
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_dot.setOnClickListener {
            text_eval.text = "${text_eval.text}."
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_sign.setOnClickListener {
            if (text_ans.text.toString() != "" && text_ans.text.toString() != "ERROR") {
                text_eval.text = "-(${text_eval.text})"
                text_ans.text = calculateFromString(text_eval.text.toString())
            }
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
            text_eval.text = specialConcat(text_eval.text.toString(), "(", "text")
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
            text_eval.text = specialConcat(text_eval.text.toString(), "sqrt(", "text")
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        b_abs.setOnClickListener {
            text_eval.text = specialConcat(text_eval.text.toString(), "abs(", "text")
            text_ans.text = calculateFromString(text_eval.text.toString())
        }

        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {

            b_pi.setOnClickListener {
                text_eval.text = specialConcat(text_eval.text.toString(), "pi", "text")
                text_ans.text = calculateFromString(text_eval.text.toString())
            }

            b_e.setOnClickListener {
                text_eval.text = specialConcat(text_eval.text.toString(), "e", "text")
                text_ans.text = calculateFromString(text_eval.text.toString())
            }

            b_ln.setOnClickListener {
                text_eval.text = specialConcat(text_eval.text.toString(), "ln(", "text")
                text_ans.text = calculateFromString(text_eval.text.toString())
            }

            b_factorial.setOnClickListener {
                text_eval.text = "${text_eval.text}!"
                text_ans.text = calculateFromString(text_eval.text.toString())
            }

            b_sin.setOnClickListener {
                text_eval.text = specialConcat(text_eval.text.toString(), "sin(", "text")
                text_ans.text = calculateFromString(text_eval.text.toString())
            }

            b_arcsin.setOnClickListener {
                text_eval.text = specialConcat(text_eval.text.toString(), "arcsin(", "text")
                text_ans.text = calculateFromString(text_eval.text.toString())
            }

            b_cos.setOnClickListener {
                text_eval.text = specialConcat(text_eval.text.toString(), "cos(", "text")
                text_ans.text = calculateFromString(text_eval.text.toString())
            }

            b_arccos.setOnClickListener {
                text_eval.text = specialConcat(text_eval.text.toString(), "arccos(", "text")
                text_ans.text = calculateFromString(text_eval.text.toString())
            }

            b_tan.setOnClickListener {
                text_eval.text = specialConcat(text_eval.text.toString(), "tan(", "text")
                text_ans.text = calculateFromString(text_eval.text.toString())
            }

            b_arctan.setOnClickListener {
                text_eval.text = specialConcat(text_eval.text.toString(), "arctan(", "text")
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
        if (str.length == 0) {
            return ""
        }
        if (!((str[str.length - 1] in '0'..'9') || str[str.length - 1] == ')' || str[str.length - 1] == '!' || str[str.length - 1] == 'i' || str[str.length - 1] == 'e')) {
            return ""
        }
        var expr = str
        var k = 0
        for (i in 0 .. expr.length - 1) {
            if (expr[i] == '(') k += 1
            if (expr[i] == ')') k -= 1
        }
        for (i in 1 .. k) {
            expr += ")"
        }
        val e = Expression(expr)
        try {
            var s = e.calculate().toString()
            if (s == "NaN") {
                return "ERROR"
            }
            if (s.length > 2 && s[s.length - 1] == '0' && s[s.length - 2] == '.') {
                return s.take(s.length - 2)
            }
            return s
        } catch (e: Exception) {
            return "ERROR"
        }
    }

    fun specialConcat(firstString: String, secondString: String, mode: String): String {
        var cond: Boolean

        if (mode == "text") {
            cond = (firstString.length > 0 && ((firstString[firstString.length - 1] in '0'..'9') || firstString[firstString.length - 1] == ')'))
        } else {
            cond = (firstString.length > 0 && firstString[firstString.length - 1] == ')')
        }

        if (cond) {
            return firstString + "*" + secondString
        } else {
            return firstString + secondString
        }
    }
}