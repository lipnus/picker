package com.lipnus.android.numpicker.model

import android.arch.persistence.room.*
import io.reactivex.Flowable


@Dao
interface MessageDao {

    @Query("SELECT * FROM message")
    fun getAllMessage(): Flowable<List<Message>>


    @Query("DELETE FROM message")
    fun clearAll()


    //해당 데이터를 추가합니다(primarykey가 겹칠경우 덮어쓴다)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg message: Message)


    //헤당 데이터를 업데이트 합니다.
    @Update
    fun update(vararg message: Message)

    //해당 데이터를 삭제합니다.
    @Delete
    fun delete(vararg message: Message)

}