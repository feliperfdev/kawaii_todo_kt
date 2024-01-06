package com.feliperfdev.study.kawaii_todo

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.feliperfdev.study.kawaii_todo.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.todoCheckbox.setOnCheckedChangeListener { buttonView, isChecked ->
            buttonView.setBackgroundColor(if (!isChecked) Color.WHITE else resources.getColor(R.color.Pink_1))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}