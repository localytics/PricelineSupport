package com.localytics.priceline

import android.app.Application
import com.localytics.android.*

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Localytics.autoIntegrate(this);
    }
}