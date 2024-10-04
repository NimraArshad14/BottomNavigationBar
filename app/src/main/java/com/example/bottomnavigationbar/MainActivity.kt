package com.example.bottomnavigationbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bottomnavigationbar.ui.theme.BottomNavigationBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


        }
    }
}
@ExperimentalMaterial3Api
@Preview
@Composable
fun ApplicationPreview() {
    Scaffold(
        bottomBar = { BottomNavigationBar()}
    ) {
            innerpadding ->(innerpadding )
    }
}

@ExperimentalMaterial3Api
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BottomNavigationBar() {

    BottomAppBar(containerColor = Color.LightGray,
        modifier = Modifier,
        actions = {
            Column(modifier = Modifier

                .padding(start = 25.dp)) {
                Icon(
                    Icons.Filled.Home,
                    contentDescription = "Home",
                    modifier = Modifier

                        .size(40.dp),
                    tint=Color.Gray

                )
                Text(
                    text = "Home",
                    fontWeight = FontWeight.Bold,

                    )
            }

            Spacer(modifier = Modifier.padding(start = 80.dp))

            Column(modifier = Modifier.padding(start = 25.dp)) {
                Icon(
                    Icons.Filled.Search,
                    contentDescription = "Search",
                    modifier = Modifier.size(40.dp),
                    tint = Color.Gray
                )
                Text(
                    text = "Search",
                    fontWeight = FontWeight.Bold,
                )
            }
            Spacer(modifier = Modifier.padding(start = 80.dp))

            Column(modifier = Modifier.padding(start = 25.dp)) {
                Icon(
                    Icons.Filled.Person,
                    contentDescription = "Person",
                    modifier = Modifier.size(40.dp),
                    tint = Color.Gray

                )
                Text(
                    text = "Profile",
                    fontWeight = FontWeight.Bold,
                )
            }


        }
    )
}