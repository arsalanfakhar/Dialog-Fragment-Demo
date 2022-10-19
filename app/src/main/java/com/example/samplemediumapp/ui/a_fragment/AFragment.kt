package com.example.samplemediumapp.ui.a_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.samplemediumapp.databinding.FragmentABinding

class AFragment : Fragment() {

    private var _binding: FragmentABinding? = null

    val binding: FragmentABinding
        get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentABinding.inflate(inflater, container, false).apply {
            _binding = this
            lifecycleOwner = viewLifecycleOwner

        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNavigate.setOnClickListener{
            findNavController().navigate(AFragmentDirections.actionAFragmentToGreetingDialog())
        }

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}