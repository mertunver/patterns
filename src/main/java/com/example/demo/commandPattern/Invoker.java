package com.example.demo.commandPattern;

import lombok.RequiredArgsConstructor;

/**
 * When use:
 * 1) if you want to execute a series of action(command) when press the button or etc. (for this particular scenario)
 * 2) undoing operation is super easy with unExecute method. (think about photoshop app's revert action)
 */
@RequiredArgsConstructor
public class Invoker {

    private final ICommand on;
    private final ICommand of;
    //.....

    public void clickOn() {
        on.execute();
    }

    public void clickOff() {
        of.execute();
    }
}
