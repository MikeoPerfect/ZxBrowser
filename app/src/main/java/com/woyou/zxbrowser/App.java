package com.woyou.zxbrowser;

import android.app.Application;

import com.zhuge.analysis.stat.ZhugeSDK;

/**
 * Created by lee on 18-1-25.
 */

public class App extends Application {
    private static App mApp;
    public static Application application(){
        return mApp;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
        ZhugeSDK.getInstance().init(getApplicationContext());

//        File cacheFile = new File(this.getCacheDir(),"cache_webview");
//        CacheWebView.getWebViewCache().init(this,cacheFile,1024*1024*100);
    }
}
