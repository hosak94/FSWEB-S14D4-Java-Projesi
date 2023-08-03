package com.workintech.rpgGame.main;

import com.workintech.rpgGame.model.Monster;
import com.workintech.rpgGame.model.Troll;

public class Main {
    public static void main(String[] args) {
        Monster troll = new Troll("Cave Trol",100,70);
        troll.attack();
        System.out.println(troll.poison());
    }
}
