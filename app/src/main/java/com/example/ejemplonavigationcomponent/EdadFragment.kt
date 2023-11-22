package com.example.ejemplonavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.ejemplonavigationcomponent.databinding.FragmentEdadBinding

/**
 * A simple [Fragment] subclass.
 */
class EdadFragment : Fragment() {
    private var _binding: FragmentEdadBinding? = null
    private val binding get() = _binding!!
    private val args: EdadFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentEdadBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textViewEdad.text = getString(R.string.muestra_edad, args.edad)
    }

}