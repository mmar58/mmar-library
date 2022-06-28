
package com.mmar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.mmar.fm;
import com.mmar.tts;
import java.io.File;

public class mActivity
extends Activity {
    public tts talk;

    public void bugreport(String string2) {
        this.talk.toastLong(string2);
        File file = new File("sdcard/error.txt");
        fm.save(file, string2);
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.talk = new tts(this);
    }
}


