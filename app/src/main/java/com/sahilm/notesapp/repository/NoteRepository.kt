package com.sahilm.notesapp.repository

import com.sahilm.notesapp.database.NoteDatabase
import com.sahilm.notesapp.model.Note

class NoteRepository(private val db: NoteDatabase) {

    suspend fun insertNotes(note: Note) = db.getNoteDao().insetNote(note)
    suspend fun updateNotes(note: Note) = db.getNoteDao().updateNote(note)
    suspend fun deleteNotes(note: Note) = db.getNoteDao().deleteNote(note)

    fun getAllNotes() = db.getNoteDao().getAllNotes()
    fun searchNote(query: String?) = db.getNoteDao().searchNote(query ?: "")
}