package com.siyee.superagentweb.impl;

import android.app.Activity;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebView;

import com.siyee.superagentweb.abs.AbsAgentWebUIController;
import com.siyee.superagentweb.abs.Callback;
import com.siyee.superagentweb.widget.WebParentLayout;

/**
 * @author hackycy
 */
public class AgentWebUIControllerImplBase extends AbsAgentWebUIController {

    public static AbsAgentWebUIController build() {
        return new AgentWebUIControllerImplBase();
    }

    @Override
    protected void bindSupportWebParent(WebParentLayout webParentLayout, Activity activity) {
        getDelegate().bindWebParent(webParentLayout, activity);
    }

    @Override
    public void onJsAlert(WebView view, String url, String message) {
        getDelegate().onJsAlert(view, url, message);
    }

    @Override
    public void onOpenPagePrompt(WebView view, String url, Callback<Integer> callback) {
        getDelegate().onOpenPagePrompt(view, url, callback);
    }

    @Override
    public void onJsConfirm(WebView view, String url, String message, JsResult jsResult) {
        getDelegate().onJsConfirm(view, url, message, jsResult);
    }

    @Override
    public void onSelectItemsPrompt(WebView view, String url, String[] ways, Callback<Integer> callback) {
        getDelegate().onSelectItemsPrompt(view, url, ways, callback);
    }

    @Override
    public void onForceDownloadAlert(String url, Callback<Integer> callback) {
        getDelegate().onForceDownloadAlert(url, callback);
    }

    @Override
    public void onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult jsPromptResult) {
        getDelegate().onJsPrompt(view, url, message, defaultValue, jsPromptResult);
    }

    @Override
    public void onMainFrameError(WebView view, int errorCode, String description, String failingUrl) {
        getDelegate().onMainFrameError(view, errorCode, description, failingUrl);
    }

    @Override
    public void onShowMainFrame() {
        getDelegate().onShowMainFrame();
    }

    @Override
    public void onLoading(String msg) {
        getDelegate().onLoading(msg);
    }

    @Override
    public void onCancelLoading() {
        getDelegate().onCancelLoading();
    }

    @Override
    public void onShowMessage(String message, String intent) {
        getDelegate().onShowMessage(message, intent);
    }

    @Override
    public void onPermissionsDeny(String[] permissions, String action) {
        getDelegate().onPermissionsDeny(permissions ,action);
    }
}
