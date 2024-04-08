package com.example.hamburgueseria.ui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.hamburgueseria.data.UiState

class ViewModel {
    private val _uiState = mutableStateOf(UiState())
    val uiState : MutableState<UiState> = _uiState

}