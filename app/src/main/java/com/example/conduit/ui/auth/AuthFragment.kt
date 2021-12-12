package com.example.conduit.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.conduit.databinding.FragmentAuthBinding

class AuthFragment:Fragment() {
    private var authBinding:FragmentAuthBinding?=null
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        authBinding= FragmentAuthBinding.inflate(inflater,container,false)

        return authBinding?.root
    }

    override fun onDestroy() {
        super.onDestroy()
        authBinding=null
    }
}