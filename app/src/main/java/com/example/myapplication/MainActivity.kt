package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var tvsec: TextView
    lateinit var tvMain: TextView
    lateinit var bac: Button
    lateinit var bc: Button
    lateinit var bbrac1: Button
    lateinit var bbrac2: Button
    lateinit var bsin: Button
    lateinit var bcos: Button
    lateinit var btan: Button


    lateinit var bfact: Button
    lateinit var bsquare: Button
    lateinit var bsqrt: Button

    lateinit var b0: Button
    lateinit var b9: Button
    lateinit var b8: Button
    lateinit var b7: Button
    lateinit var b6: Button
    lateinit var b5: Button
    lateinit var b4: Button
    lateinit var b3: Button
    lateinit var b2: Button
    lateinit var b1: Button
    lateinit var bpi: Button
    lateinit var bmul: Button
    lateinit var bminus: Button
    lateinit var bplus: Button
    lateinit var bequal: Button
    lateinit var bdot: Button
    lateinit var bdiv: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvMain = findViewById(R.id.idTVprimary)
        tvsec = findViewById(R.id.idTVSecondary)
        bac = findViewById(R.id.bac)
        bbrac1 = findViewById(R.id.bbrac1)
        bbrac2 = findViewById(R.id.bbrac2)
        bsin = findViewById(R.id.bsin)
        bcos = findViewById(R.id.bcos)
        btan = findViewById(R.id.btan)

        bfact = findViewById(R.id.bfact)
        bsquare = findViewById(R.id.bsquare)
        bsqrt = findViewById(R.id.bsqrt)
        b0 = findViewById(R.id.b0)
        b1 = findViewById(R.id.b1)
        b2 = findViewById(R.id.b2)
        b3 = findViewById(R.id.b3)
        b4 = findViewById(R.id.b4)
        b5 = findViewById(R.id.b5)
        b6 = findViewById(R.id.b6)
        b7 = findViewById(R.id.b7)
        b8 = findViewById(R.id.b8)
        b9 = findViewById(R.id.b9)
        bpi = findViewById(R.id.bpi)
        bminus = findViewById(R.id.bminus)
        bmul = findViewById(R.id.bmul)
        bplus = findViewById(R.id.bplus)
        bequal = findViewById(R.id.bequal)
        bdiv = findViewById(R.id.bdiv)
        bdot = findViewById(R.id.bdot)
        bdiv.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "/")
        }
        bdot.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + ".")
        }
        bplus.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "+")
        }
        b0.setOnClickListener {
            Toast.makeText(this, "Hello boss", Toast.LENGTH_SHORT).show()
            tvMain.text = (tvMain.text.toString() + "0")
        }

        b1.setOnClickListener {

            tvMain.text = (tvMain.text.toString() + "1")
        }

        b2.setOnClickListener {

            tvMain.text = (tvMain.text.toString() + "2")
        }
        b3.setOnClickListener {

            tvMain.text = (tvMain.text.toString() + "3")
        }
        b4.setOnClickListener {

            tvMain.text = (tvMain.text.toString() + "4")
        }
        b5.setOnClickListener {

            tvMain.text = (tvMain.text.toString() + "5")
        }

        b6.setOnClickListener {

            tvMain.text = (tvMain.text.toString() + "6")
        }
        b7.setOnClickListener {

            tvMain.text = (tvMain.text.toString() + "7")
        }
        b8.setOnClickListener {

            tvMain.text = (tvMain.text.toString() + "8")
        }
        b9.setOnClickListener {

            tvMain.text = (tvMain.text.toString() + "9")
        }

        bminus.setOnClickListener {
            val str: String = tvMain.text.toString()
            if (!str.get(index = str.length - 1).equals("-")) {
                tvMain.text = (tvMain.text.toString() + "-")
            }
        }

        bmul.setOnClickListener {
            val str: String = tvMain.text.toString()
            if (!str.get(index = str.length - 1).equals("*")) {
                tvMain.text = (tvMain.text.toString() + "*")
            }
        }

        bsin.setOnClickListener {
            tvMain.text = tvMain.text.toString() + "sin"
        }


        bcos.setOnClickListener {
            tvMain.text = tvMain.text.toString() + "cos"
        }

        btan.setOnClickListener {
            tvMain.text = tvMain.text.toString() + "tan"
        }

        bpi.setOnClickListener {
            tvMain.text = tvMain.text.toString() + "3.142"
        }
        bac.setOnClickListener {
            tvMain.setText("")
            tvsec.setText("")
        }
//erroe occour



     /*   bc.setOnClickListener {
      var str : String =tvMain.text.toString()
var len:Int
len=str.length
tvMain.setText ("")

tvMain.text= str.substring(0, len - 1)
            }
        */


    bbrac1.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + "(")
                }
                bbrac2.setOnClickListener {
                    tvMain.text = (tvMain.text.toString() + ")")
                }
                bfact.setOnClickListener {
                    if (tvMain.text.toString().isEmpty()) {
                        Toast.makeText(this, "enter valid number", Toast.LENGTH_SHORT).show()
                    } else {
                        var value: Int = tvMain.text.toString().toInt()
                        var fact: Int = factorial(value)
                        tvMain.setText(fact.toString())
                        tvsec.text = "$value"
                    }
                }
                bsquare.setOnClickListener {
                    if (tvMain.text.toString().isEmpty()) {
                        Toast.makeText(this, "enter valid number", Toast.LENGTH_SHORT).show()
                    } else {

                        val d: Int = tvMain.getText().toString().toInt()

                        val square = d * d
                        tvMain.setText(square.toString())
                        tvsec.text = "$d²"
                    }
                }
                bsqrt.setOnClickListener {

                    if (tvMain.text.toString().isEmpty()) {

                        Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
                    } else {
                        val str: String = tvMain.text.toString()

                        val r = Math.sqrt(str.toDouble())

                        val result = r.toString()
                        tvMain.setText(result)

                    }
                }
                bequal.setOnClickListener {
                    var str: String = tvMain.text.toString()
                    val result: Double = evaluate(str)
                    var ans = result.toString()
                    tvMain.setText(ans)
                    tvsec.text = str
                }



    }
}

    fun factorial(n: Int): Int {
        // this method is use to find factorial
        return if (n == 1 || n == 0) 1 else n * factorial(n - 1)
    }

fun evaluate(str: String): Double {
    return object : Any() {
        // on below line we are creating variable
        // for tracking the position and char pos.
        var pos = -1
        var ch = 0

        // below method is for moving to next character.
        fun nextChar() {
            // on below line we are incrementing our position
            // and moving it to next position.
            ch = if (++pos < str.length) str[pos].toInt() else -1
        }

        // this method is use to check the extra space
        // present int the expression and removing it.
        fun eat(charToEat: Int): Boolean {
            while (ch == ' '.toInt()) nextChar()
            // on below line we are checking the char pos
            // if both is equal then we are returning it to true.
            if (ch == charToEat) {
                nextChar()
                return true
            }
            return false
        }

        // below method is to parse our
        // expression and to get the ans
        // in this we are calling a parse
        // expression method to calculate the value.
        fun parse(): Double {
            nextChar()
            val x = parseExpression()
            if (pos < str.length) throw RuntimeException("Unexpected: " + ch.toChar())
            return x
        }

        // in this method we will only perform addition and
        // subtraction operation on the expression.
        fun parseExpression(): Double {
            var x = parseTerm()
            while (true) {
                if (eat('+'.toInt())) x += parseTerm() // addition
                else if (eat('-'.toInt())) x -= parseTerm() // subtraction
                else return x
            }
        }

        // in below method we will perform
        // only multiplication and division operation.
        fun parseTerm(): Double {
            var x = parseFactor()
            while (true) {
                if (eat('*'.toInt())) x *= parseFactor() // multiplication
                else if (eat('/'.toInt())) x /= parseFactor() // division
                else return x
            }
        }

        // below method is use to parse the factor
        fun parseFactor(): Double {
            //on below line we are checking for addition
            // and subtraction and performing unary operations.
            if (eat('+'.toInt())) return parseFactor() // unary plus
            if (eat('-'.toInt())) return -parseFactor() // unary minus
            // creating a double variable for ans.
            var x: Double
            // on below line we are creating
            // a variable for position.
            val startPos = pos
            // on below line we are checking
            // for opening and closing parenthesis.
            if (eat('('.toInt())) { // parentheses
                x = parseExpression()
                eat(')'.toInt())
            } else if (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) {
                // numbers
                while (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) nextChar()
                // on below line we are getting sub string from our string using start and pos.
                x = str.substring(startPos, pos).toDouble()
            } else if (ch >= 'a'.toInt() && ch <= 'z'.toInt()) {
                // on below function we are checking for the operator in our expression.
                while (ch >= 'a'.toInt() && ch <= 'z'.toInt()) nextChar()
                val func = str.substring(startPos, pos)
                // calling a method to parse our factor.
                x = parseFactor()
                // on below line we are checking for square root.
                x =
                    if (func == "sqrt") Math.sqrt(x)
                    // on below line we are checking for sin function
                    // and calculating sin function using Math class.
                    else if (func == "sin") Math.sin(
                        Math.toRadians(x)
                        // on below line we are calculating the cos value
                    ) else if (func == "cos") Math.cos(
                        Math.toRadians(x)
                        // on below line we are calculating
                        // the tan value of our expression.
                    ) else if (func == "tan")
                        Math.tan(Math.toRadians(x))
                    // on below line we are calculating
                    // log value of the expression.
                    else if (func == "log")
                        Math.log10(x)
                    // on below line we are calculating
                    // ln value of expression.
                    else if (func == "ln") Math.log(x)
                    // f we get any error then
                    // we simply return the exception.
                    else throw RuntimeException(
                        "Unknown function: $func"
                    )
            } else {
                // if the condition not satisfy then we are returning the exception
                throw RuntimeException("Unexpected: " + ch.toChar())
            }
            // on below line we are calculating the power of the expression.
            if (eat('^'.toInt())) x = Math.pow(x, parseFactor()) // exponentiation
            return x
        }
        // at last calling a parse for our expression.
    }.parse()
}

