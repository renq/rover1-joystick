package com.example.renq.rover1joystick

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class AnalogJoystick : AppCompatActivity() {
    private var vertical: SeekBar? = null
    private var verticalText: TextView? = null
    private var horizontalText: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vertical = findViewById<SeekBar>(R.id.vertical)
        val verticalText = findViewById<TextView>(R.id.verticalText)

        val horizontal = findViewById<SeekBar>(R.id.horizontal)
        val horizontalText = findViewById<TextView>(R.id.horizontalText)

        vertical?.setOnSeekBarChangeListener(JoystickSeekBarChangeListener(vertical, verticalText))
        horizontal?.setOnSeekBarChangeListener(JoystickSeekBarChangeListener(horizontal, horizontalText))
    }
}
