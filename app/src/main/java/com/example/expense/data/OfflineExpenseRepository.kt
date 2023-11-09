package com.example.expense.data

import androidx.lifecycle.LiveData
import kotlinx.coroutines.flow.Flow


class OfflineExpenseRepository(private val expenseDao: ExpenseDao) : ExpenseRepository {


    override fun getAllExpenseStream(): LiveData<List<ExpenseEntity>> {
        expenseDao.getAllExpenses()
        return expenseDao.getAllExpenses()
    }

    override fun getExpenseStream(id: Int): Flow<Expense?> {
        return expenseDao.getExpenseById(id)
    }

    override suspend fun deleteExpense(expense: Expense) {
        expenseDao.deleteExpense(expense = ExpenseEntity())
    }

    override suspend fun insertExpense(expense: Expense) {
        expenseDao.insertExpense(expense = ExpenseEntity())
    }

    override suspend fun updateExpense(expense: Expense) {
        expenseDao.deleteExpense(expense = ExpenseEntity())
    }

}