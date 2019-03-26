package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {

    String name;

    public AliceBobEvaluator(String input) {
        this.name = input.toUpperCase();
    }

    public boolean isAlice() {
        return name.equals(AliceBobEnum.ALICE.name());
    }

    public boolean isBob(){
        return name.equals(AliceBobEnum.BOB.name());
    }
}
