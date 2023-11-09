package com.example.expense.ui.expense
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.util.Date


@Composable
fun EnterExpenseScreen() {
    var expenseText by remember { mutableStateOf("") }
    var amountText by remember { mutableStateOf("") }
    var selectedDate by remember { mutableStateOf<Date?>(null) }
    var selectedCategory by remember { mutableStateOf<String?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        TextField(
            value = expenseText,
            onValueChange = { expenseText = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            placeholder = { Text("Expense Name") }
        )

        TextField(
            value = amountText,
            onValueChange = { amountText = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            placeholder = { Text("Amount") }
        )

        CategoryDropdown(
            categories = listOf("Food", "Transportation", "Entertainment", "Other"),
            selectedCategory = selectedCategory,
            onCategorySelected = { selectedCategory = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )




        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {


            Button(
                onClick = {  },
                modifier = Modifier
                    .padding(8.dp)

            ) {
                Text(text = "Save",
                    modifier = Modifier
                    )
            }

            Button(
                onClick = {  },
                modifier = Modifier
                    .padding(8.dp)
            ) {
                Text(text = "Cancel")
            }
        }
    }
}
@Composable
fun CategoryDropdown(
    categories: List<String>,
    selectedCategory: String?,
    onCategorySelected: (String?) -> Unit,
    modifier: Modifier = Modifier
) {
    var isDialogOpen by remember { mutableStateOf(false) }

    Box(
        modifier = modifier
    ) {
        TextButton(
            onClick = { isDialogOpen = true },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = selectedCategory ?: "Select a Category",
                modifier = Modifier.padding(8.dp)
            )
        }

        DropdownMenu(
            expanded = isDialogOpen,
            onDismissRequest = { isDialogOpen = false }
        ) {
            categories.forEach { category ->
                DropdownMenuItem(
                    onClick = {
                        onCategorySelected(category)
                        isDialogOpen = false
                    }
                ) {
                    Text(text = category)
                }
            }
        }
    }
}


@Preview
@Composable
fun EnterExpenseScreenPreview() {
    EnterExpenseScreen()
}
