package com.lipnus.android.numpicker.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


//엔티티(@Entity)는 데이터베이스에 저장할 데이터의 형식을 정의

@Entity
class Message(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val title: String,
    val content: String
)