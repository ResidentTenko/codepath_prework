package org.test.hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // show the layout file: activity_main
        setContentView(R.layout.activity_main)

        // User can tap a button to change the text color of the label.
        // 1. Add a button to our layout

        // Get a reference to our button
        // 2. Set up logic to know when the user has tapped on button
        findViewById<Button>(R.id.button).setOnClickListener {
            // Handles button tap
            // 3. Change text color when button is tapped
            Log.i("User ", "Tapped on button")
            // 1. Get a reference to the text view
            // 2. Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor( getResources().getColor(R.color.red))

        }


    }
}