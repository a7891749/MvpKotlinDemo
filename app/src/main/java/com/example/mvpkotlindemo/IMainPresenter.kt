package com.example.mvpkotlindemo

/**
 * Created by yrl on 2017/5/31.
 */
interface IMainPresenter {
    fun login(userName:String?,password:String?)
    fun onDestroy()
}