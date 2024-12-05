package com.example.databinding.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.databinding.R
import com.example.databinding.User

/**
 * Created by Ratna Srivastava on 05-12-2024.
 */
class UserViewModel: ViewModel() {
    private val _name = MutableLiveData<String>()
    val name: LiveData<String> get() = _name

    private val _color = MutableLiveData<Int>()
    val color: LiveData<Int> get() = _color

    init {
        updateUser("Ratna Pandey", android.graphics.Color.RED)
    }

    fun updateUser(name: String, color: Int) {
        _name.value = name
        _color.value = color
    }

    fun handleOnClick() {
        updateUser("Aaryahi Pandey", android.graphics.Color.WHITE)
    }
}