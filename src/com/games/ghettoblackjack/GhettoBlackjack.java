package com.games.ghettoblackjack;

import com.games.framework.Screen;
import com.games.framework.impl.AndroidGame;

public class GhettoBlackjack extends AndroidGame {
    @Override
    public Screen getStartScreen() {
        return new LoadingScreen(this); 
    }
}