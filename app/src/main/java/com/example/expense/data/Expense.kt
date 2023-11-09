package com.example.expense.data

data class Expense(
    val id: Long,
    val amount: Double,
    val category: String,
    val date: String,
    val description: String
)
