package com.junho.voicecall.ui.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<T: ViewDataBinding, R: BaseViewModel> : AppCompatActivity() {

    lateinit var viewDataBiding: T


    abstract val layoutResourceId: Int

    abstract val viewModel: R

    // 레이아웃을 띄운 직후 호출 ex) 리사이클러뷰, 툴바, 드로어뷰
    abstract fun initStartView()

    //데이터 바인딩 및 rxjava 설정 ex) rxjava observe, databinding observe 등
    abstract fun initDataBinding()

    // 바인딩 이후 할 일 구성 ex) 클릭 리스너 지정 등
    abstract fun initAfterBinding()

    private var isSetBackButtonValid = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewDataBiding = DataBindingUtil.setContentView(this, layoutResourceId)
        initStartView()
        initDataBinding()
        initAfterBinding()
    }
}