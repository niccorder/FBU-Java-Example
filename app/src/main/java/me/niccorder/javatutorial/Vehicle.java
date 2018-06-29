package me.niccorder.javatutorial;

import android.util.Log;

public abstract class Vehicle {

    /**
     * Please for anyone who extends this class, tell me how you sound when I honk.
     *
     * @return the sound that you make when you honk.
     */
    abstract String honkSound();

    public void honk() {
        // Setting the sound variable to the result of honkSound()
        String sound = honkSound();

        // Prints the sound to logcat.
        Log.d("Vehicle", sound);
    }
}
