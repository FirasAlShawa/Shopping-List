package com.firasalshawa.shoppinglist.ui.shoppinglist

import com.firasalshawa.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item:ShoppingItem)
}