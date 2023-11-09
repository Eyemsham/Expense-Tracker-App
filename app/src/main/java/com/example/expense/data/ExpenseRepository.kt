package com.example.expense.data
import androidx.lifecycle.LiveData
import kotlinx.coroutines.flow.Flow


interface ExpenseRepository{

    fun getAllExpenseStream(): LiveData<List<ExpenseEntity>>

    fun getExpenseStream(id: Int): Flow<Expense?>

    suspend fun insertExpense(expense: Expense)

    suspend fun deleteExpense(expense: Expense)

    suspend fun updateExpense(expense: Expense)

}
