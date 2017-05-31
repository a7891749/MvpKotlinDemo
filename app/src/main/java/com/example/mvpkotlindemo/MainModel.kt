package com.example.mvpkotlindemo

import android.os.Handler
import android.text.TextUtils


/**
 * Created by yrl on 2017/5/31.
 */
class MainModel {
    fun login(userName: String?, password: String?,mvpModel: IMainModel){
        Handler().postDelayed({
            if(TextUtils.isEmpty(userName)){
                mvpModel.userNameError()
                return@postDelayed
            }
            if (TextUtils.isEmpty(password)){
                mvpModel.passwordError()
                return@postDelayed
            }
            mvpModel.success()
        },500)
    }

}