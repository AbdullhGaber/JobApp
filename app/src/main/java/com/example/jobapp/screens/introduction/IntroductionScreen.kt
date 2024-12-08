package com.example.jobapp.screens.introduction

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jobapp.R

@Composable
fun IntroductionScreen(
    navigateToScreen : () -> Unit
){

    Box(modifier = Modifier.fillMaxHeight()){
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Image(
                painter = painterResource(id = R.drawable.top_intro),
                contentDescription = "Top Intro",
                modifier = Modifier.fillMaxHeight(0.5f)
            )

            Text(
                modifier = Modifier.padding(top = 40.dp),
                text = stringResource(R.string.remote_jobs_for_anyone_anywhere),
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp,
                textAlign = TextAlign.Center
            )

            Text(
                modifier = Modifier.padding(top = 24.dp),
                text = stringResource(R.string.thousands_of_jobs_find_your_job),
                fontWeight = FontWeight.Light,
                fontSize = 18.sp,
                textAlign = TextAlign.Center
            )
        }

        Image(
            painter = painterResource(id = R.drawable.bottom_intro),
            contentDescription = "Top Intro",
            modifier = Modifier.align(BottomCenter).clickable {
                navigateToScreen()
            }
        )
    }
}

@Composable
@Preview(showBackground = true , backgroundColor = 0xFFFFFF)
fun PreviewIntroductionScreen(){
    IntroductionScreen(
        navigateToScreen = {}
    )
}