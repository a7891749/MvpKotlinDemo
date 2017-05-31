package com.example.mvpkotlindemo

import android.content.Context
import android.util.Log
import android.widget.Toast

/**
 * Created by yrl on 2017/5/31.
 */
fun Context.toast(msg: CharSequence?, duration: Int = Toast.LENGTH_SHORT)
        = msg?.let { Toast.makeText(this, msg, duration).show() }

fun Any.log(msg: String?) = msg?.let { Log.e(this.javaClass.simpleName, msg) }
