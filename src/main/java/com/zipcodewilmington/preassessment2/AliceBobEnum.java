package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {

    ALICE,
    BOB;

    AliceBobEnum() {
    }

    public String getCatchPhrase() {
        return "Hey, my name is " + name() + "!";
    }


    public boolean isAlice() {
        System.out.println("name: " + name());
        return name().equals(ALICE.name());
    }

    public boolean isBob() {
        return name().equals(BOB.name());
    }
}
