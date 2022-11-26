package com.gali.audio.music;

import com.gali.audio.constant.RhythmConstant;
import com.gali.audio.play.Animation;
import com.gali.audio.play.AudioPlay;

import java.io.File;

/**
 * @author gali
 */
public class QingFeiDeYi {
    public static void main(String[] args) {
        String notes = RhythmConstant.QFDY_PRESIDE;
        String accompaniments =RhythmConstant.QFDY_BREAK;

        new AudioPlay(220).loadNotes(notes).start();
        /**
         * 副音部分
         */
        new AudioPlay(220).loadNotes(accompaniments).start();
        new Animation(220).loadNotes(notes).start();
    }
}