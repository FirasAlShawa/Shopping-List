package com.firasalshawa.shoppinglist.data.repositories

import com.firasalshawa.shoppinglist.data.db.ShoppingDatabase
import com.firasalshawa.shoppinglist.data.db.entities.ShoppingItem

class ShoppingRepository(
    private val db: ShoppingDatabase
){

    suspend fun upsert(item:ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    suspend fun getAllShoppingItems()= db.getShoppingDao().getAllShoppingItems()
}