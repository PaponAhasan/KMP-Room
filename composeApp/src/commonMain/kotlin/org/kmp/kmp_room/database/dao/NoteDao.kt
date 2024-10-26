package org.kmp.kmp_room.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow
import org.kmp.kmp_room.database.entity.Note

@Dao
interface  NoteDao {
    @Query("Select * From note_table")
    fun getAll(): Flow<List<Note>>

    @Upsert
    suspend fun upsertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}