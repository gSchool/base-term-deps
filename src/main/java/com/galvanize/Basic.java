package com.galvanize;

import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Basic {
    public String blue(String input) {
        return colorize(input, Attribute.BLUE_TEXT());
    }
}
