package com.sahilm.notesapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sahilm.notesapp.model.Note
import com.sahilm.notesapp.repository.NoteRepository
import kotlinx.coroutines.launch

class NoteViewModel(
    app: Application,
    private val noteRespository: NoteRepository
) : AndroidViewModel(app) {

    fun addNote(note : Note) =
        viewModelScope.launch {
            noteRespository.insertNotes(note)
        }

    fun updateNote(note : Note) =
        viewModelScope.launch {
            noteRespository.updateNotes(note)
        }

    fun deleteNote(note : Note) =
        viewModelScope.launch {
            noteRespository.deleteNotes(note)
        }

    fun getAllNotes() = noteRespository.getAllNotes()

    fun searchNotes(query: String) = noteRespository.searchNote(query)
}