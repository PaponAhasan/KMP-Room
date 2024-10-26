package org.kmp.kmp_room.database

import androidx.room.Room
import androidx.room.RoomDatabase

fun getDatabaseBuilder(): RoomDatabase.Builder<AppDatabase>{
    val dbFilePath = NSHomeDirectory() + "/my_room.db"
    return Room.databaseBuilder(
        name = dbFilePath,
        factory = {AppDatabase:class.instantiateImpl()}
    )
}