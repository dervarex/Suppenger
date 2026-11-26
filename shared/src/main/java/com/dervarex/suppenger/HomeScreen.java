package com.dervarex.suppenger;

import com.dervarex.unweird.Button;
import com.dervarex.unweird.Screen;
import com.dervarex.unweird.Text;
import com.dervarex.unweird.annotation.State;
import com.dervarex.unweird.annotation.Title;

@Title("Suppenger")
public class HomeScreen extends Screen {

    @State int clicks;

    Text heading  = new Text("Suppenger");
    Text subtitle = new Text(() -> clicks == 0 ? "Nothing clicked yet." : "Clicked " + (clicks == 1 ? "Once" : clicks + " times."));
    Button click  = new Button("Click me").onClick(() -> clicks++);
}
