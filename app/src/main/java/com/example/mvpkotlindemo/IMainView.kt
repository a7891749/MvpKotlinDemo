package com.example.mvpkotlindemo

/**
 * Created by yrl on 2017/5/31.
 */
interface IMainView {
    fun showProgress()
    fun hideProgress()
    fun success()
    fun userNameError()
    fun passwordError()
}