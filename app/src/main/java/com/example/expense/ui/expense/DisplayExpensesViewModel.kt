package com.example.expense.ui.expense

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.expense.data.Expense

class DisplayExpensesViewModel : ViewModel() {
    val expenses: MutableState<List<Expense>> = mutableStateOf(emptyList())

    val totalExpense: MutableState<Int> = mutableStateOf(0)

    fun updateExpenses(newExpenses: List<Expense>) {
        expenses.value = newExpenses
        totalExpense.value = newExpenses.sumOf { it.amount.toInt() }
    }

    fun performAction() {
    }
}