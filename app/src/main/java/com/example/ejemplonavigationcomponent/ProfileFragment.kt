package com.example.ejemplonavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.ejemplonavigationcomponent.databinding.FragmentProfileBinding


/**
 * A simple [Fragment] subclass.
 * Use the [ProfileFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnEnviar.setOnClickListener {
            if(binding.txtNombre.text.toString().isEmpty() && binding.txtApellidos.text.toString().isEmpty()){
                Toast.makeText(this.context, "Introduce algo", Toast.LENGTH_SHORT).show()
            } else{
                val action = ProfileFragmentDirections
                    .actionProfileFragmentToSaludoFragment(binding.txtNombre.text.toString(), binding.txtApellidos.text.toString())

                it.findNavController().navigate(action)
            }
        }


        binding.btnEnviarEdad.setOnClickListener {
            if (binding.txtEdad.toString().isEmpty()){
                Toast.makeText(this.context, "Hay que introducir una edad", Toast.LENGTH_SHORT).show()
            } else{
                val action = ProfileFragmentDirections
                    .actionProfileFragmentToEdadFragment(binding.txtEdad.text.toString().toInt())

                it.findNavController().navigate(action)
            }
        }



    }
}