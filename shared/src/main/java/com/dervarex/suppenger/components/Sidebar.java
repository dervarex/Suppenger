package com.dervarex.suppenger.components;

import com.dervarex.suppenger.screens.HomeScreen;
import com.dervarex.unweird.Button;
import com.dervarex.unweird.Component;
import com.dervarex.unweird.Side;
import com.dervarex.unweird.Text;
import com.dervarex.unweird.annotation.Default;
import lombok.Getter;

@Default(Side.LEFT)
public class Sidebar extends Component {

    Text brand = new Text("Suppenger");

    @Getter private final Button home = new Button("Home").onClick(() -> go(HomeScreen.class));
}
