package com.example.expense.data

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

interface BudgetDao {
    @Insert
    suspend fun insertBudget(budget: BudgetEntity)

    @Update
    suspend fun updateBudget(budget: BudgetEntity)

    @Delete
    suspend fun deleteBudget(budget: BudgetEntity)

    @Query("SELECT * from BUDGETS WHERE id = :id")
    fun getBudgets(id: Int): Flow<BudgetEntity>

    @Query("SELECT * from BUDGETS")
    fun getAllItems(): Flow<List<BudgetEntity>>
}