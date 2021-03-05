package com.argen;

public class Boss {
    private int bossHealth;
    private int bossdamage;
    private  String BossDefenceType;

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossdamage() {
        return bossdamage;
    }

    public void setBossdamage(int bossdamage) {
        this.bossdamage = bossdamage;
    }

    public String getBossDefenceType() {
        return BossDefenceType;
    }

    public void setBossDefenceType(String bossDefenceType) {
        BossDefenceType = bossDefenceType;
    }
}


