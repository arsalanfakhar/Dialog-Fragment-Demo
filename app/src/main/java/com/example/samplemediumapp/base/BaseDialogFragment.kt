package com.example.samplemediumapp.base

import android.os.Bundle
import android.view.*
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.DialogFragment
import com.example.samplemediumapp.R

abstract class BaseDialogFragment<VB : ViewDataBinding> : DialogFragment() {

    protected open val dialogStyle: Int = R.style.DialogTheme

    protected abstract fun getBindView(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): VB

    protected lateinit var binding: VB


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NO_FRAME, dialogStyle)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return getBindView(inflater, container).apply {
            binding = this
            lifecycleOwner = viewLifecycleOwner
        }.root
    }

}
