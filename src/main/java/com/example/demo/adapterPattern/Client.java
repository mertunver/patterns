package com.example.demo.adapterPattern;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Client {

    /**
     * In scenario, client just want to "request" (plugAdapter) even if adapter output is UK or EU. (UK and EU type is equal to "specificRequest")
     * even if "specificRequest" changed, you dont have to re-implement logic here.
     * example: nodeJS function foo(p1,p2) ---> foo (p2,p1) without adapter pattern.
     */
    private final ITarget target;

    public void doAction(){
        target.request();
    }

    /**
     * FACADE
     * desc1: I heard an analogy that you should think of your universal remote control that you've set up to work with all your different stereo systems
     * you press "on" and it turns on your cable box, your receiver, and your TV.
     * Maybe it's a really fancy home theater and it dims the lights and draws the shades too.
     * That's a Facade - one button/function that takes care of a more complicated set of steps.
     *
     * desc2: more like a simple gateway to a complicated set of functionality.
     * You make a black-box for your clients to worry less
     */

    /**
     * ADAPTER
     * desc1: An Adapter is used when the wrapper must respect a particular interface and must support a polymorphic behavior.
     * On the other hand, a facade is used when one wants an easier or simpler interface to work with.
     */

    /**
     * PROXY
     * provides the same interface as the proxied-for class and typically does some housekeeping stuff on its own.
     * (So instead of making multiple copies of a heavy object X you make copies of a lightweight proxy P which in turn manages X and translates your calls as required.)
     * You are solving the problem of the client from having to manage a heavy and/or complex object
     */
}

