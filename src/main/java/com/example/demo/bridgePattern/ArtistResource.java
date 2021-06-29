package com.example.demo.bridgePattern;

import com.example.demo.bridgePattern.model.Artist;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ArtistResource implements IResource{
    private final Artist artist;

    @Override
    public String show() {
        return null;
    }

    @Override
    public String title() {
        return null;
    }

    @Override
    public String image() {
        return null;
    }
}
