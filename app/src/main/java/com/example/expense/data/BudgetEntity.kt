package com.example.expense.data

import androidx.room.Entity
import androidx.room.PrimaryKey

class BudgetEntity {
    @Entity(tableName = "budgets")
    data class BudgetEntity(
        @PrimaryKey(autoGenerate = true)
        val id: Long = 0L,
        val categoryId: Long,
        val budgetAmount: Double
    )
}