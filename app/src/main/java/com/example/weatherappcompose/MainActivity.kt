package com.example.weatherappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.Modifier
import com.example.weatherappcompose.ui.theme.GreyLight

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .background(GreyLight)
        ){
            itemsIndexed(
                listOf(
                    ItemRowModel(R.drawable.ava, "1", "TestTest TestTest" +
                            "Test TestTest TestTest" +
                            "TestTestTest TestTest" +
                            "TestTestTest TestTestTest" +
                            "Test TestTestTestTestTestTest" +
                            "TestTestTestTestTestTest"),
                    ItemRowModel(R.drawable.ava2, "2", "Test"),
                    ItemRowModel(R.drawable.ava3, "3", "Test"),
                    ItemRowModel(R.drawable.ava4, "4", "Test"),
                    ItemRowModel(R.drawable.ava, "5", "Test"),
                    ItemRowModel(R.drawable.ava2, "6", "Test"),
                    ItemRowModel(R.drawable.ava3, "7", "Test"),
                    ItemRowModel(R.drawable.ava4, "8", "Test"),
                    ItemRowModel(R.drawable.ava, "9", "Test"),
                    ItemRowModel(R.drawable.ava2, "10", "Test"),
                    ItemRowModel(R.drawable.ava3, "11", "Test"),
                )
            ){_, item->
                ItemRowComp(itemRowModel = item)
            }
        }


        }
    }
}
