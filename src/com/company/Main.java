package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
    boss.setHealth(500);
    boss.setDamage(90);
    boss.setTypeProtect("обычная");
        System.out.println(boss.getHealth() + " " +
                " " + boss.getDamage() + boss.getTypeProtect());
    }

}
