package edu.unicauca.appsmoviles.dulcespopayan.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Disfruta de una dulce guía conociendo Popayán"
    }
    val text: LiveData<String> = _text
}