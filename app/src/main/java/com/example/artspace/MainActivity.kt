package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    ChangeImage()
                }
            }
        }
    }
}


@Composable
fun ChangeImage() {
    Column(
        modifier = Modifier
            .padding(5.dp)
    ) {
        var result by remember { mutableStateOf(1) }
        when (result) {
            1 -> ArtSpace(
                painterImage = R.drawable.img_7266,
                title = stringResource(R.string.titlt_image),
                photographer = stringResource(R.string.name_photo),
                year = stringResource(R.string.year),
                onClickPrevious = {
                    if (result < 1) {
                        result = 6
                    }
                    else {
                        result--
                    }
                },
                onClickNext = {
                    if (result > 6) {
                        result = 1
                    }
                    else {
                        result++
                    }
                },
                modifier = Modifier
                    .weight(2f)
                    .border(BorderStroke(5.dp, Color.Gray))
            )
            2 -> ArtSpace(
                painterImage = R.drawable.img_7271,
                title = stringResource(R.string.titlt_image),
                photographer = stringResource(R.string.name_photo),
                year = stringResource(R.string.year),
                onClickPrevious = {
                    if (result < 1) {
                        result = 6
                    }
                    else {
                        result--
                    }
                },
                onClickNext = {
                    if (result > 6) {
                        result = 1
                    }
                    else {
                        result++
                    }
                },
                modifier = Modifier
                    .weight(2f)
                    .border(BorderStroke(5.dp, Color.Gray))
            )
            3 -> ArtSpace(
                painterImage = R.drawable.img_7272,
                title = stringResource(R.string.titlt_image),
                photographer = stringResource(R.string.name_photo),
                year = stringResource(R.string.year),
                onClickPrevious = {
                    if (result < 1) {
                        result = 6
                    }
                    else {
                        result--
                    }
                },
                onClickNext = {
                    if (result > 6) {
                        result = 1
                    }
                    else {
                        result++
                    }
                },
                modifier = Modifier
                    .weight(2f)
                    .border(BorderStroke(5.dp, Color.Gray))
            )
            4 -> ArtSpace(
                painterImage = R.drawable.img_7274,
                title = stringResource(R.string.titlt_image),
                photographer = stringResource(R.string.name_photo),
                year = stringResource(R.string.year),
                onClickPrevious = {
                    if (result < 1) {
                        result = 6
                    }
                    else {
                        result--
                    }
                },
                onClickNext = {
                    if (result > 6) {
                        result = 1
                    }
                    else {
                        result++
                    }
                },
                modifier = Modifier
                    .weight(2f)
                    .border(BorderStroke(5.dp, Color.Gray))
            )
            5 -> ArtSpace(
                painterImage = R.drawable.img_7279,
                title = stringResource(R.string.titlt_image),
                photographer = stringResource(R.string.name_photo),
                year = stringResource(R.string.year),
                onClickPrevious = {
                    if (result < 1) {
                        result = 6
                    }
                    else {
                        result--
                    }
                },
                onClickNext = {
                    if (result > 6) {
                        result = 1
                    }
                    else {
                        result++
                    }
                },
                modifier = Modifier
                    .weight(2f)
                    .border(BorderStroke(5.dp, Color.Gray))
            )
            else -> ArtSpace(
                painterImage = R.drawable.img_7282,
                title = stringResource(R.string.titlt_image),
                photographer = stringResource(R.string.name_photo),
                year = stringResource(R.string.year),
                onClickPrevious = {
                    if (result < 1) {
                        result = 6
                    }
                    else {
                        result--
                    }
                },
                onClickNext = {
                    if (result > 6) {
                        result = 1
                    }
                    else {
                        result++
                    }
                },
                modifier = Modifier
                    .weight(2f)
                    .border(BorderStroke(5.dp, Color.Gray))
            )
        }
    }
}

@Composable
fun ArtSpace(
    painterImage: Int,
    title: String,
    photographer: String,
    year: String,
    onClickPrevious: () -> Unit,
    onClickNext: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(painterImage),
            contentDescription = "1"
        )
    }
    Spacer(modifier = Modifier.padding(10.dp))
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 5.dp, bottom = 50.dp, start = 5.dp, end = 5.dp)
            .border(BorderStroke(0.05.dp, Color.Gray)),
        elevation = 5.dp
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 30.dp)
        ) {
            Text(
                text = title,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(top = 10.dp, start = 10.dp, end = 10.dp)
            )
            Row (
                modifier = Modifier
                    .padding(bottom = 10.dp, start = 10.dp, end = 10.dp)
            ) {
                Text(
                    text = photographer,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(end = 6.dp)
                )
                Text(
                    text = year,
                    fontSize = 16.sp
                )
            }
        }
    }
    Spacer(modifier = Modifier.padding(10.dp))
    Row (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = onClickPrevious
            ,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(start = 10.dp)
        ) {
            Text(text = "Previous")
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Button(
            onClick = onClickNext
            ,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(end = 10.dp)
        ) {
            Text(text = "Next")
        }
        Spacer(modifier = Modifier.padding(5.dp))

    }
}


@Preview(showBackground = true)
@Composable
fun ArtSpaceScreen() {
    ArtSpaceTheme {
        ChangeImage()
    }
}