package com.madlore.caloric.ui.macros

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MacrosViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is macros Fragment"
    }
    val text: LiveData<String> = _text
}