package me.niccorder.javatutorial;

import android.util.Log;

public class Sedan extends Vehicle {

    @Override
    String honkSound() {
        Log.d("Sedan", "honkSound() called from Sedan.");

        return "beep beep!";
    }

    @Override
    public void honk() {

        // Pint the honk from the sedan to logcat.
        Log.d("Sedan", "honk() called from Sedan.");

        // It calls the vehicle's honk ( the parent class )
        super.honk();
    }
}
