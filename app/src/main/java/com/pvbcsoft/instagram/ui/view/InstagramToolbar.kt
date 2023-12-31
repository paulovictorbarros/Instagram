package com.pvbcsoft.instagram.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pvbcsoft.instagram.R
import com.pvbcsoft.instagram.ui.theme.spacingLarge
import com.pvbcsoft.instagram.ui.theme.spacingMedium

@Composable
fun InstagramToolbar() {

    val instagramLabel = stringResource(id = R.string.name_toolbar)

    Box(modifier = Modifier.background(MaterialTheme.colorScheme.background)) {
        Row(
            modifier = Modifier
                .padding(horizontal = spacingLarge)
                .height(56.dp)
        ) {

            Text(
                text = instagramLabel,
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically),
                style = MaterialTheme.typography.headlineLarge
            )

            Image(
                painter = painterResource(id = R.drawable.ic_notification),
                modifier = Modifier
                    .size(32.dp)
                    .padding(end = spacingMedium)
                    .align(Alignment.CenterVertically),
                contentDescription = stringResource(R.string.content_description_notification_icon)
            )

            Image(
                painter = painterResource(id = R.drawable.ic_message),
                modifier = Modifier
                    .size(32.dp)
                    .padding(start = spacingMedium)
                    .align(Alignment.CenterVertically),
                contentDescription = stringResource(R.string.content_description_message_icon)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InstagramToolbarPreview() {
    InstagramToolbar()
}