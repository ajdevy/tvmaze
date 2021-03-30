package com.tvmaze.app.app.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tvmaze.app.search.db.SuggestionEntity
import com.tvmaze.app.search.db.SuggestionsDao

@Database(entities = [SuggestionEntity::class], version = 6, exportSchema = false)
abstract class TvMazeDatabase : RoomDatabase() {

    abstract val suggestionsDao: SuggestionsDao

}