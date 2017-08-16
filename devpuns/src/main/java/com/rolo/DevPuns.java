package com.rolo;
import java.util.Random;

public class DevPuns {
    private static String[] puns = {
            "Programmer definition: A machine that turns coffee into code",
            "Algorithm definition: Word used by programmers when...they do not want to explain what they did",
            "Hardware definition: The part of the computer you can kick",
            "Q: What's the object-oriented way to become wealthy? A: Inheritance",
            "Q: What do computers and air conditioners have in common? A:They both become useless when you open windows.",
            "Q: Why do Java programmers wear glasses? A: Because they don't C#.",
            "3 Database SQL walked into a NoSQL bar. A little while later... they walked out. Because they couldn't find a table.",
            "A SQL query goes into a bar, walks up to two tables and asks...Can I join you?",
            "If the box says \"Requires Windows XP or better\", does that mean it will run on Linux?"
    };

    public static String[] getPuns() {
        return puns;
    }

    public static String getPun() {
        Random rand = new Random();
        int min = 0;
        int max = puns.length-1;
        int randomIndex = rand.nextInt(max) + min;
        return puns[randomIndex];
    }
}
