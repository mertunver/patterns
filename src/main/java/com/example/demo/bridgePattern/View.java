package com.example.demo.bridgePattern;

import lombok.RequiredArgsConstructor;

/**
 * We may have tons of View and Resource, if we want to combine them (cartasian product), we need to couple things stricktly which is not good.
 * View should just show the resource, View does not know the actual resource. just shows something
 * View does not know the resource is artist's name or etc.
 */
@RequiredArgsConstructor
public abstract class View {

    protected final IResource resource;

    public abstract String show();
}
