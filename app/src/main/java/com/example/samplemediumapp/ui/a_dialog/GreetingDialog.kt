package com.example.samplemediumapp.ui.a_dialog

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.samplemediumapp.base.BaseDialogFragment
import com.example.samplemediumapp.databinding.DialogGreetingBinding

class GreetingDialog:BaseDialogFragment<DialogGreetingBinding>() {

    override fun getBindView(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): DialogGreetingBinding {
        return DialogGreetingBinding.inflate(inflater, container, false).apply {

            this.thanksbtn.setOnClickListener {
                dismiss()
            }
        }
    }


}