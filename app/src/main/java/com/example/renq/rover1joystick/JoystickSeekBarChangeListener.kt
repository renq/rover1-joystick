package com.example.renq.rover1joystick

import android.util.Log
import android.widget.SeekBar
import android.widget.TextView

class JoystickSeekBarChangeListener(val seekBar: SeekBar, val textView: TextView) : SeekBar.OnSeekBarChangeListener {
    override fun onStartTrackingTouch(p0: SeekBar?) {
        Log.d("Joystick", "${seekBar.id}: Start tracking touch")
    }

    override fun onStopTrackingTouch(p0: SeekBar?) {
        Log.d("Joystick", "${seekBar.id}: Stop tracking touch")
    }

    override fun onProgressChanged(p0: SeekBar?, progress: Int, p2: Boolean) {
        Log.d("Joystick", "${seekBar.id}: Progress changed$progress")
        textView.text = "$progress"
    }
}