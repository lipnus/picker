package com.lipnus.android.numpicker.util

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.lipnus.android.numpicker.model.Message
import com.lipnus.android.numpicker.model.MessageDao


@Database(entities = [Message::class], version = 2)
abstract class MessageDatabase: RoomDatabase() {

    abstract fun getMessageDao(): MessageDao

    companion object {

        private var INSTANCE: MessageDatabase? = null

        fun getInstance(context: Context): MessageDatabase? {

            if(INSTANCE == null) {
                synchronized(MessageDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context, MessageDatabase::class.java, "message.db").build()
                }
            }

            return INSTANCE
        }

    }

}