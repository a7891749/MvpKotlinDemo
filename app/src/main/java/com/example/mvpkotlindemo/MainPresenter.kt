package com.example.mvpkotlindemo


/**
 * Created by yrl on 2017/5/31.
 */
class MainPresenter(var mainView: IMainView?) : IMainPresenter {
    private var model: MainModel? = null
    init {
        model = MainModel()
    }
    override fun login(userName: String?, password: String?) {
        mainView?.showProgress()
        model?.login(userName, password, object : IMainModel {
            override fun userNameError() {
                mainView?.hideProgress()
                mainView?.userNameError()
            }
            override fun passwordError() {
                mainView?.hideProgress()
                mainView?.passwordError()
            }
            override fun success() {
                mainView?.hideProgress()
                mainView?.success()
            }
        })
    }

    override fun onDestroy() {
        mainView = null
    }
}