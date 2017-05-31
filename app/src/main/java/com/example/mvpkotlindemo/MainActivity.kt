package com.example.mvpkotlindemo

import android.app.ProgressDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), IMainView {
    private var presenter: IMainPresenter? = null
    private var proDlg: ProgressDialog?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter(this)
        proDlg= ProgressDialog(this)
        btn_login.setOnClickListener {
            presenter?.login(et_userName.text.toString().trim()
                    , et_password.text.toString().trim())
        }
    }
    override fun showProgress() {
        proDlg?.show()
    }

    override fun hideProgress() {
        if(proDlg?.isShowing as Boolean){
            proDlg?.dismiss()
        }
    }

    override fun userNameError() {
        et_userName.error = "用户名不能为空"
    }

    override fun passwordError() {
        et_password.error = "密码不能为空"
    }
    override fun success() {
        toast("登录成功")
    }
    override fun onDestroy() {
        super.onDestroy()
        presenter?.onDestroy()
    }
}
