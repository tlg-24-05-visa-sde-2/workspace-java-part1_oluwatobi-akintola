package com.trax.client;

import com.trax.Mixer;
import com.trax.TurnTable;

import java.util.Arrays;

class TurnTableClientArgs {
    public static void main(String[] args) {
        if(args.length < 3) {
            String usage = "Usage: java TurnTableClientArgs <song> <bpm> <mixer>";
            String example = "Example: java TurnTableClientArgs \"Beat it - by Michael Jackson\" 120 RIGHT";
            String note1 = "Note: Available mixers are " + Arrays.toString(Mixer.values());
            String note2 = "Note: bpm MUST be between " + TurnTable.MIN_BPM + " and " + TurnTable.MAX_BPM;
            String note3 = "Note: Include quotations when inputting song";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            System.out.println(note3);
            return;
        }

        //STEP1: Convert argument strings into proper types for TurnTable
        String song = args[0];
        int bpm = Integer.parseInt(args[1]);
        Mixer mixer = Mixer.valueOf(args[2].toUpperCase());
        //STEP2: Create an instance of TurnTable with these converted values
        TurnTable t = new TurnTable(song, bpm, mixer);
        //STEP3: Print it and tell them their song choice, bpm, and what mixer they chose
        System.out.println("Playing: " + song + " at " + bpm + " bpm on " + mixer + " mixer" );

    }
}