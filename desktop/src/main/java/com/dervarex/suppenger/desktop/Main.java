package com.dervarex.suppenger.desktop;

import com.dervarex.suppenger.HomeScreen;
import com.dervarex.unweird.Unweird;

public class Main {

    public static void main(String[] args) {
        Unweird.app("Suppenger").size(900, 600).start(HomeScreen.class);
    }
}
