package com.example.expense.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(viewModel: HomeViewModel) {

    var searchText by remember { mutableStateOf(TextFieldValue()) }
    var selectedTab by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(Color.Black)
            ){

                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Profile Icon",
                    tint = Color.White,
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column() {
                Text(text = "Welcome",
                    color = Color.Gray
                )

                Text(
                    text = "Sinesipho",
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.h6,
                    color = Color.Black
                )
            }
        }

        Card(
            modifier = Modifier
                .height(200.dp)
                .padding(16.dp)
                .fillMaxWidth(),
            elevation = 8.dp,
            shape = RoundedCornerShape(40.dp),
            backgroundColor = Color.Black

        ) {
            Column(
                modifier = Modifier
                    .padding(50.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Available Balance",
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    color = Color.White,


                    )
                Text(
                    text = "R180,72",
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.h4,
                    color = Color.White
                )
            }
        }



        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Latest Transactions",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    color = Color.Black,
                )
            )
            Text(
                text = "Amount",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
            )
        }

        Divider(
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )


        com.example.expense.ExpenseItem("Checkers", "2023/08/10", "R345,09")
        com.example.expense.ExpenseItem("Game Canal Walk", "2023/08/10", "R521,86")
        com.example.expense.ExpenseItem("Mrp Canal Walk", "2023/08/10", "R601,47")
        com.example.expense.ExpenseItem("Shoprite Park", "2023/08/07", "R133,03")
        com.example.expense.ExpenseItem("Takealot", "2023/08/02", "R270,00")
    }
}


@Composable
fun ExpenseItem(latestTransaction: String,Date :String, amount: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .height(100.dp),
        backgroundColor = Color(217, 217, 217),

        ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column() {

                Text(text = latestTransaction,
                    style = TextStyle(fontWeight = FontWeight.Bold),
                    fontSize = 20.sp,
                )
                Text(text = Date)
            }
            Text(text = amount,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}
@Preview
@Composable
fun ExpensePreview() {
    HomeScreen(viewModel = HomeViewModel())
}