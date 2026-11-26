package com.example.suppenger.desktop;

import com.example.suppenger.HomeScreen;
import com.dervarex.unweird.Unweird;

public class Main {

    public static void main(String[] args) {
        Unweird.app("Suppenger").size(900, 600).start(HomeScreen.class);
    }
}
