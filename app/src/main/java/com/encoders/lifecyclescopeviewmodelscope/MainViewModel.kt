package com.encoders.lifecyclescopeviewmodelscope

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    init {

        viewModelScope.launch {
            while (true){
                delay(1000)
                Log.e("WELCOME","TO ENCODERS TECHNOLOGY SOULTION")
            }
        }

    }

    override fun onCleared() {
        super.onCleared()
    }
}