package ke.co.elasticlink.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {

    private val boxOneText = findViewById<TextView>(R.id.box_one_text)
    private val boxTwoText = findViewById<TextView>(R.id.box_two_text)
    private val boxThreeText = findViewById<TextView>(R.id.box_three_text)
    private val boxFourText = findViewById<TextView>(R.id.box_four_text)
    private val boxFiveText = findViewById<TextView>(R.id.box_five_text)
    private val boxConstraintLayout = findViewById<ConstraintLayout>(R.id.constraint_layout)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }


    private fun setListeners() {
        //declare the id's before listing them


        //we list the declared ids
        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText,
                boxConstraintLayout)
        for (item in clickableViews) {
            item.setOnClickListener {makeColored(it) }
        }
    }

    private fun makeColored(view: View){
        when (view.id){

            //Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            //Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            //boxes using custom colors
            R.id.red_button -> boxThreeText.setBackgroundResource(R.color.my_red)
            R.id.black_button ->boxFourText.setBackgroundResource(R.color.my_black)
            R.id.greeen_button ->boxFiveText.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}