package derson.com.multipletheme;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;

import derson.com.multipletheme.colorUi.util.SharedPreferencesMgr;

/**
 * Created by chengli on 15/6/14.
 */
public class BaseActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(SharedPreferencesMgr.getInt("theme", 0) == 1) {
            setTheme(R.style.theme_2);
        } else {
            setTheme(R.style.theme_1);
        }
    }
}
