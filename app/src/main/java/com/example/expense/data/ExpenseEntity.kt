package com.example.expense.data

import androidx.room.Entity
import androidx.room.PrimaryKey

class ExpenseEntity {
    @Entity(tableName = "expenses")
    data class ExpenseEntity(
        @PrimaryKey(autoGenerate = true)
        val id: Long = 0L,
        val amount: Double,
        val categoryId: Long,
        val date: Long,
        val description: String
    )
}