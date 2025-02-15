package com.example.myapplication.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
fun HomePage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        // Topptekst
        Text(
            text = "Tired of owning so much stuff?",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Rent what you need, only when you need it",
            fontSize = 14.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Søkefelt med ikon
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Search") },
            leadingIcon = {
                Icon(Icons.Default.Search, contentDescription = "Search Icon")
            },
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Kategorier (Rutenett med 2 rader og 4 kolonner)
        CategoryGrid()

        Spacer(modifier = Modifier.height(24.dp))

        // Reklameområde
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .clip(RoundedCornerShape(10.dp))
                .padding(8.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Catchy advertisements",
                color = Color.Gray,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Anbefalinger seksjon
        Text(
            text = "Recommendations",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Start)
        )

        Spacer(modifier = Modifier.height(16.dp))

        RecommendationRow()
    }
}

@Composable
fun CategoryGrid() {
    Column {
        repeat(2) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                repeat(4) {
                    CategoryItem()
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun CategoryItem() {
    Box(
        modifier = Modifier
            .size(80.dp)
            .clip(RoundedCornerShape(10.dp))
            .padding(4.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Category", fontSize = 12.sp, color = Color.Gray)
    }
}

@Composable
fun RecommendationRow() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        repeat(3) {
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .padding(4.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Item", fontSize = 12.sp, color = Color.Gray)
            }
        }
    }
}
