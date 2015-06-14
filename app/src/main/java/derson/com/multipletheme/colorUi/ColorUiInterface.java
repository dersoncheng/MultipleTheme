package derson.com.multipletheme.colorUi;

import android.content.res.Resources;
import android.view.View;

/**
 * 换肤接口
 * Created by chengli on 15/6/8.
 */
public interface ColorUiInterface {


    public View getView();

    public void setTheme(Resources.Theme themeId);
}
