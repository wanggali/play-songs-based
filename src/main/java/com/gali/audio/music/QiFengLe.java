package com.gali.audio.music;

import com.gali.audio.constant.RhythmConstant;
import com.gali.audio.play.Animation;
import com.gali.audio.play.AudioPlay;

import java.io.File;

/**
 * @author gali
 */
public class QiFengLe {
    public static void main(String[] args) {
        String notes = RhythmConstant.QFL_PRESIDE;

        String accompaniments =RhythmConstant.QFDY_BREAK;

        new AudioPlay(180).loadNotes(notes).start();
        new AudioPlay(180).loadNotes(accompaniments).start();
        new Animation(180).loadNotes(notes).start();
    }
}
