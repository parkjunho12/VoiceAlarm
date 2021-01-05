package com.junho.voicecall.ui.intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.junho.voicecall.R
import com.junho.voicecall.databinding.ActivityIntroBinding
import com.junho.voicecall.ui.base.BaseActivity
import com.junho.voicecall.ui.main.MainActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class IntroActivity : BaseActivity<ActivityIntroBinding, IntroViewModel>()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
    }

    override val layoutResourceId: Int
        get() = R.layout.activity_intro
    override val viewModel: IntroViewModel by viewModel()


    override fun initStartView() {
        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            startActivity(Intent(this@IntroActivity, MainActivity::class.java))
        },3000)

    }

    override fun initDataBinding() {

    }

    override fun initAfterBinding() {

    }
}